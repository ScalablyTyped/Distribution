package typings.ioredis

import typings.ioredis.anon.Ip
import typings.ioredis.anon.Lua
import typings.ioredis.anon.PartialSentinelAddress
import typings.ioredis.builtClusterClusterOptionsMod.NatMap
import typings.ioredis.builtConnectorsConnectorConstructorMod.ConnectorConstructor
import typings.ioredis.builtConnectorsSentinelConnectorMod.AddressFromResponse
import typings.ioredis.builtConnectorsSentinelConnectorMod.PreferredSlaves
import typings.ioredis.builtUtilsCommanderMod.CommanderOptions
import typings.ioredis.ioredisInts.`1`
import typings.ioredis.ioredisInts.`2`
import typings.ioredis.ioredisStrings.master_
import typings.ioredis.ioredisStrings.slave
import typings.node.AbortSignal
import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import typings.node.netMod.LookupFunction
import typings.node.netMod.OnReadOpts
import typings.node.tlsMod.ConnectionOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtRedisRedisOptionsMod {
  
  @JSImport("ioredis/built/redis/RedisOptions", "DEFAULT_REDIS_OPTIONS")
  @js.native
  val DEFAULT_REDIS_OPTIONS: RedisOptions = js.native
  
  trait CommonRedisOptions
    extends StObject
       with CommanderOptions {
    
    var Connector: js.UndefOr[ConnectorConstructor] = js.undefined
    
    /**
      * @default []
      */
    var autoPipeliningIgnoredCommands: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether or not to resend unfulfilled commands on reconnect.
      * Unfulfilled commands are most likely to be blocking commands such as `brpop` or `blpop`.
      * @default true
      */
    var autoResendUnfulfilledCommands: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When the client reconnects, channels subscribed in the previous connection will be
      * resubscribed automatically if `autoResubscribe` is `true`.
      * @default true
      */
    var autoResubscribe: js.UndefOr[Boolean] = js.undefined
    
    var commandQueue: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If a command does not return a reply within a set number of milliseconds,
      * a "Command timed out" error will be thrown.
      */
    var commandTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * How long the client will wait before killing a socket due to inactivity during initial connection.
      * @default 10000
      */
    var connectTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Set the name of the connection to make it easier to identity the connection
      * in client list.
      * @link https://redis.io/commands/client-setname
      */
    var connectionName: js.UndefOr[String] = js.undefined
    
    /**
      * Database index to use.
      *
      * @default 0
      */
    var db: js.UndefOr[Double] = js.undefined
    
    /**
      * @default false
      */
    var enableAutoPipelining: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * By default, if the connection to Redis server has not been established, commands are added to a queue
      * and are executed once the connection is "ready" (when `enableReadyCheck` is true, "ready" means
      * the Redis server has loaded the database from disk, otherwise means the connection to the Redis
      * server has been established). If this option is false, when execute the command when the connection
      * isn't ready, an error will be returned.
      *
      * @default true
      */
    var enableOfflineQueue: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The client will sent an INFO command to check whether the server is still loading data from the disk (
      * which happens when the server is just launched) when the connection is established, and only wait until
      * the loading process is finished before emitting the `ready` event.
      *
      * @default true
      */
    var enableReadyCheck: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable/disable keep-alive functionality.
      * @link https://nodejs.org/api/net.html#socketsetkeepaliveenable-initialdelay
      * @default 0
      */
    var keepAlive: js.UndefOr[Double] = js.undefined
    
    /**
      * When a Redis instance is initialized, a connection to the server is immediately established. Set this to
      * true will delay the connection to the server until the first command is sent or `redis.connect()` is called
      * explicitly.
      *
      * @default false
      */
    var lazyConnect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 10000
      */
    var maxLoadingRetryTime: js.UndefOr[Double] = js.undefined
    
    /**
      * The commands that don't get a reply due to the connection to the server is lost are
      * put into a queue and will be resent on reconnect (if allowed by the `retryStrategy` option).
      * This option is used to configure how many reconnection attempts should be allowed before
      * the queue is flushed with a `MaxRetriesPerRequestError` error.
      * Set this options to `null` instead of a number to let commands wait forever
      * until the connection is alive again.
      *
      * @default 20
      */
    var maxRetriesPerRequest: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * This option is used internally when you call `redis.monitor()` to tell Redis
      * to enter the monitor mode when the connection is established.
      *
      * @default false
      */
    var monitor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable/disable the use of Nagle's algorithm.
      * @link https://nodejs.org/api/net.html#socketsetnodelaynodelay
      * @default true
      */
    var noDelay: js.UndefOr[Boolean] = js.undefined
    
    var offlineQueue: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, client will send AUTH command with the value of this option when connected.
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * @default false
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not to reconnect on certain Redis errors.
      * This options by default is `null`, which means it should never reconnect on Redis errors.
      * You can pass a function that accepts an Redis error, and returns:
      * - `true` or `1` to trigger a reconnection.
      * - `false` or `0` to not reconnect.
      * - `2` to reconnect and resend the failed command (who triggered the error) after reconnection.
      * @example
      * ```js
      * const redis = new Redis({
      *   reconnectOnError(err) {
      *     const targetError = "READONLY";
      *     if (err.message.includes(targetError)) {
      *       // Only reconnect when the error contains "READONLY"
      *       return true; // or `return 1;`
      *     }
      *   },
      * });
      * ```
      * @default null
      */
    var reconnectOnError: js.UndefOr[ReconnectOnError | Null] = js.undefined
    
    var retryStrategy: js.UndefOr[js.Function1[/* times */ Double, Double | Unit | Null]] = js.undefined
    
    /**
      * @default undefined
      */
    var scripts: js.UndefOr[Record[String, Lua]] = js.undefined
    
    /**
      * When enabled, numbers returned by Redis will be converted to JavaScript strings instead of numbers.
      * This is necessary if you want to handle big numbers (above `Number.MAX_SAFE_INTEGER` === 2^53).
      * @default false
      */
    var stringNumbers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, client will send AUTH command with the value of this option as the first argument when connected.
      * This is supported since Redis 6.
      */
    var username: js.UndefOr[String] = js.undefined
  }
  object CommonRedisOptions {
    
    inline def apply(): CommonRedisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonRedisOptions]
    }
    
    extension [Self <: CommonRedisOptions](x: Self) {
      
      inline def setAutoPipeliningIgnoredCommands(value: js.Array[String]): Self = StObject.set(x, "autoPipeliningIgnoredCommands", value.asInstanceOf[js.Any])
      
      inline def setAutoPipeliningIgnoredCommandsUndefined: Self = StObject.set(x, "autoPipeliningIgnoredCommands", js.undefined)
      
      inline def setAutoPipeliningIgnoredCommandsVarargs(value: String*): Self = StObject.set(x, "autoPipeliningIgnoredCommands", js.Array(value*))
      
      inline def setAutoResendUnfulfilledCommands(value: Boolean): Self = StObject.set(x, "autoResendUnfulfilledCommands", value.asInstanceOf[js.Any])
      
      inline def setAutoResendUnfulfilledCommandsUndefined: Self = StObject.set(x, "autoResendUnfulfilledCommands", js.undefined)
      
      inline def setAutoResubscribe(value: Boolean): Self = StObject.set(x, "autoResubscribe", value.asInstanceOf[js.Any])
      
      inline def setAutoResubscribeUndefined: Self = StObject.set(x, "autoResubscribe", js.undefined)
      
      inline def setCommandQueue(value: Boolean): Self = StObject.set(x, "commandQueue", value.asInstanceOf[js.Any])
      
      inline def setCommandQueueUndefined: Self = StObject.set(x, "commandQueue", js.undefined)
      
      inline def setCommandTimeout(value: Double): Self = StObject.set(x, "commandTimeout", value.asInstanceOf[js.Any])
      
      inline def setCommandTimeoutUndefined: Self = StObject.set(x, "commandTimeout", js.undefined)
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
      
      inline def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
      
      inline def setConnector(value: ConnectorConstructor): Self = StObject.set(x, "Connector", value.asInstanceOf[js.Any])
      
      inline def setConnectorUndefined: Self = StObject.set(x, "Connector", js.undefined)
      
      inline def setDb(value: Double): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      inline def setEnableAutoPipelining(value: Boolean): Self = StObject.set(x, "enableAutoPipelining", value.asInstanceOf[js.Any])
      
      inline def setEnableAutoPipeliningUndefined: Self = StObject.set(x, "enableAutoPipelining", js.undefined)
      
      inline def setEnableOfflineQueue(value: Boolean): Self = StObject.set(x, "enableOfflineQueue", value.asInstanceOf[js.Any])
      
      inline def setEnableOfflineQueueUndefined: Self = StObject.set(x, "enableOfflineQueue", js.undefined)
      
      inline def setEnableReadyCheck(value: Boolean): Self = StObject.set(x, "enableReadyCheck", value.asInstanceOf[js.Any])
      
      inline def setEnableReadyCheckUndefined: Self = StObject.set(x, "enableReadyCheck", js.undefined)
      
      inline def setKeepAlive(value: Double): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setLazyConnect(value: Boolean): Self = StObject.set(x, "lazyConnect", value.asInstanceOf[js.Any])
      
      inline def setLazyConnectUndefined: Self = StObject.set(x, "lazyConnect", js.undefined)
      
      inline def setMaxLoadingRetryTime(value: Double): Self = StObject.set(x, "maxLoadingRetryTime", value.asInstanceOf[js.Any])
      
      inline def setMaxLoadingRetryTimeUndefined: Self = StObject.set(x, "maxLoadingRetryTime", js.undefined)
      
      inline def setMaxRetriesPerRequest(value: Double): Self = StObject.set(x, "maxRetriesPerRequest", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesPerRequestNull: Self = StObject.set(x, "maxRetriesPerRequest", null)
      
      inline def setMaxRetriesPerRequestUndefined: Self = StObject.set(x, "maxRetriesPerRequest", js.undefined)
      
      inline def setMonitor(value: Boolean): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
      
      inline def setMonitorUndefined: Self = StObject.set(x, "monitor", js.undefined)
      
      inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
      
      inline def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
      
      inline def setOfflineQueue(value: Boolean): Self = StObject.set(x, "offlineQueue", value.asInstanceOf[js.Any])
      
      inline def setOfflineQueueUndefined: Self = StObject.set(x, "offlineQueue", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setReconnectOnError(value: /* err */ js.Error => Boolean | `1` | `2`): Self = StObject.set(x, "reconnectOnError", js.Any.fromFunction1(value))
      
      inline def setReconnectOnErrorNull: Self = StObject.set(x, "reconnectOnError", null)
      
      inline def setReconnectOnErrorUndefined: Self = StObject.set(x, "reconnectOnError", js.undefined)
      
      inline def setRetryStrategy(value: /* times */ Double => Double | Unit | Null): Self = StObject.set(x, "retryStrategy", js.Any.fromFunction1(value))
      
      inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
      
      inline def setScripts(value: Record[String, Lua]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setStringNumbers(value: Boolean): Self = StObject.set(x, "stringNumbers", value.asInstanceOf[js.Any])
      
      inline def setStringNumbersUndefined: Self = StObject.set(x, "stringNumbers", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  type ReconnectOnError = js.Function1[/* err */ js.Error, Boolean | `1` | `2`]
  
  /* Inlined ioredis.ioredis/built/redis/RedisOptions.CommonRedisOptions & ioredis.ioredis/built/connectors/SentinelConnector.SentinelConnectionOptions & ioredis.ioredis/built/connectors/StandaloneConnector.StandaloneConnectionOptions */
  trait RedisOptions extends StObject {
    
    var Connector: js.UndefOr[ConnectorConstructor] = js.undefined
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default []
      */
    var autoPipeliningIgnoredCommands: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether or not to resend unfulfilled commands on reconnect.
      * Unfulfilled commands are most likely to be blocking commands such as `brpop` or `blpop`.
      * @default true
      */
    var autoResendUnfulfilledCommands: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When the client reconnects, channels subscribed in the previous connection will be
      * resubscribed automatically if `autoResubscribe` is `true`.
      * @default true
      */
    var autoResubscribe: js.UndefOr[Boolean] = js.undefined
    
    var commandQueue: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If a command does not return a reply within a set number of milliseconds,
      * a "Command timed out" error will be thrown.
      */
    var commandTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * How long the client will wait before killing a socket due to inactivity during initial connection.
      * @default 10000
      */
    var connectTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Set the name of the connection to make it easier to identity the connection
      * in client list.
      * @link https://redis.io/commands/client-setname
      */
    var connectionName: js.UndefOr[String] = js.undefined
    
    /**
      * Database index to use.
      *
      * @default 0
      */
    var db: js.UndefOr[Double] = js.undefined
    
    var disconnectTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * @default false
      */
    var enableAutoPipelining: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * By default, if the connection to Redis server has not been established, commands are added to a queue
      * and are executed once the connection is "ready" (when `enableReadyCheck` is true, "ready" means
      * the Redis server has loaded the database from disk, otherwise means the connection to the Redis
      * server has been established). If this option is false, when execute the command when the connection
      * isn't ready, an error will be returned.
      *
      * @default true
      */
    var enableOfflineQueue: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The client will sent an INFO command to check whether the server is still loading data from the disk (
      * which happens when the server is just launched) when the connection is established, and only wait until
      * the loading process is finished before emitting the `ready` event.
      *
      * @default true
      */
    var enableReadyCheck: js.UndefOr[Boolean] = js.undefined
    
    var enableTLSForSentinelMode: js.UndefOr[Boolean] = js.undefined
    
    var failoverDetector: js.UndefOr[Boolean] = js.undefined
    
    var family: js.UndefOr[Double] = js.undefined
    
    var fd: js.UndefOr[Double] = js.undefined
    
    var hints: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Enable/disable keep-alive functionality.
      * @link https://nodejs.org/api/net.html#socketsetkeepaliveenable-initialdelay
      * @default 0
      */
    var keepAlive: js.UndefOr[Double] = js.undefined
    
    var keepAliveInitialDelay: js.UndefOr[Double] = js.undefined
    
    var keyPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * When a Redis instance is initialized, a connection to the server is immediately established. Set this to
      * true will delay the connection to the server until the first command is sent or `redis.connect()` is called
      * explicitly.
      *
      * @default false
      */
    var lazyConnect: js.UndefOr[Boolean] = js.undefined
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var localPort: js.UndefOr[Double] = js.undefined
    
    var lookup: js.UndefOr[LookupFunction] = js.undefined
    
    /**
      * @default 10000
      */
    var maxLoadingRetryTime: js.UndefOr[Double] = js.undefined
    
    /**
      * The commands that don't get a reply due to the connection to the server is lost are
      * put into a queue and will be resent on reconnect (if allowed by the `retryStrategy` option).
      * This option is used to configure how many reconnection attempts should be allowed before
      * the queue is flushed with a `MaxRetriesPerRequestError` error.
      * Set this options to `null` instead of a number to let commands wait forever
      * until the connection is alive again.
      *
      * @default 20
      */
    var maxRetriesPerRequest: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * This option is used internally when you call `redis.monitor()` to tell Redis
      * to enter the monitor mode when the connection is established.
      *
      * @default false
      */
    var monitor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Master group name of the Sentinel
      */
    var name: js.UndefOr[String] = js.undefined
    
    var natMap: js.UndefOr[NatMap] = js.undefined
    
    /**
      * Enable/disable the use of Nagle's algorithm.
      * @link https://nodejs.org/api/net.html#socketsetnodelaynodelay
      * @default true
      */
    var noDelay: js.UndefOr[Boolean] = js.undefined
    
    var offlineQueue: js.UndefOr[Boolean] = js.undefined
    
    var onread: js.UndefOr[OnReadOpts] = js.undefined
    
    /**
      * If set, client will send AUTH command with the value of this option when connected.
      */
    var password: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var preferredSlaves: js.UndefOr[PreferredSlaves] = js.undefined
    
    /**
      * @default false
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var readable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not to reconnect on certain Redis errors.
      * This options by default is `null`, which means it should never reconnect on Redis errors.
      * You can pass a function that accepts an Redis error, and returns:
      * - `true` or `1` to trigger a reconnection.
      * - `false` or `0` to not reconnect.
      * - `2` to reconnect and resend the failed command (who triggered the error) after reconnection.
      * @example
      * ```js
      * const redis = new Redis({
      *   reconnectOnError(err) {
      *     const targetError = "READONLY";
      *     if (err.message.includes(targetError)) {
      *       // Only reconnect when the error contains "READONLY"
      *       return true; // or `return 1;`
      *     }
      *   },
      * });
      * ```
      * @default null
      */
    var reconnectOnError: js.UndefOr[ReconnectOnError | Null] = js.undefined
    
    var retryStrategy: js.UndefOr[js.Function1[/* times */ Double, Double | Unit | Null]] = js.undefined
    
    /**
      * @default "master"
      */
    var role: js.UndefOr[master_ | slave] = js.undefined
    
    /**
      * @default undefined
      */
    var scripts: js.UndefOr[Record[String, Lua]] = js.undefined
    
    var sentinelCommandTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 10
      */
    var sentinelMaxConnections: js.UndefOr[Double] = js.undefined
    
    var sentinelPassword: js.UndefOr[String] = js.undefined
    
    var sentinelReconnectStrategy: js.UndefOr[js.Function1[/* retryAttempts */ Double, Double | Unit | Null]] = js.undefined
    
    var sentinelRetryStrategy: js.UndefOr[js.Function1[/* retryAttempts */ Double, Double | Unit | Null]] = js.undefined
    
    var sentinelTLS: js.UndefOr[ConnectionOptions] = js.undefined
    
    var sentinelUsername: js.UndefOr[String] = js.undefined
    
    var sentinels: js.UndefOr[js.Array[PartialSentinelAddress]] = js.undefined
    
    var showFriendlyErrorStack: js.UndefOr[Boolean] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * When enabled, numbers returned by Redis will be converted to JavaScript strings instead of numbers.
      * This is necessary if you want to handle big numbers (above `Number.MAX_SAFE_INTEGER` === 2^53).
      * @default false
      */
    var stringNumbers: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var tls: js.UndefOr[ConnectionOptions] = js.undefined
    
    var updateSentinels: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, client will send AUTH command with the value of this option as the first argument when connected.
      * This is supported since Redis 6.
      */
    var username: js.UndefOr[String] = js.undefined
    
    var writable: js.UndefOr[Boolean] = js.undefined
  }
  object RedisOptions {
    
    inline def apply(): RedisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedisOptions]
    }
    
    extension [Self <: RedisOptions](x: Self) {
      
      inline def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      inline def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      inline def setAutoPipeliningIgnoredCommands(value: js.Array[String]): Self = StObject.set(x, "autoPipeliningIgnoredCommands", value.asInstanceOf[js.Any])
      
      inline def setAutoPipeliningIgnoredCommandsUndefined: Self = StObject.set(x, "autoPipeliningIgnoredCommands", js.undefined)
      
      inline def setAutoPipeliningIgnoredCommandsVarargs(value: String*): Self = StObject.set(x, "autoPipeliningIgnoredCommands", js.Array(value*))
      
      inline def setAutoResendUnfulfilledCommands(value: Boolean): Self = StObject.set(x, "autoResendUnfulfilledCommands", value.asInstanceOf[js.Any])
      
      inline def setAutoResendUnfulfilledCommandsUndefined: Self = StObject.set(x, "autoResendUnfulfilledCommands", js.undefined)
      
      inline def setAutoResubscribe(value: Boolean): Self = StObject.set(x, "autoResubscribe", value.asInstanceOf[js.Any])
      
      inline def setAutoResubscribeUndefined: Self = StObject.set(x, "autoResubscribe", js.undefined)
      
      inline def setCommandQueue(value: Boolean): Self = StObject.set(x, "commandQueue", value.asInstanceOf[js.Any])
      
      inline def setCommandQueueUndefined: Self = StObject.set(x, "commandQueue", js.undefined)
      
      inline def setCommandTimeout(value: Double): Self = StObject.set(x, "commandTimeout", value.asInstanceOf[js.Any])
      
      inline def setCommandTimeoutUndefined: Self = StObject.set(x, "commandTimeout", js.undefined)
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
      
      inline def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
      
      inline def setConnector(value: ConnectorConstructor): Self = StObject.set(x, "Connector", value.asInstanceOf[js.Any])
      
      inline def setConnectorUndefined: Self = StObject.set(x, "Connector", js.undefined)
      
      inline def setDb(value: Double): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      inline def setDisconnectTimeout(value: Double): Self = StObject.set(x, "disconnectTimeout", value.asInstanceOf[js.Any])
      
      inline def setDisconnectTimeoutUndefined: Self = StObject.set(x, "disconnectTimeout", js.undefined)
      
      inline def setEnableAutoPipelining(value: Boolean): Self = StObject.set(x, "enableAutoPipelining", value.asInstanceOf[js.Any])
      
      inline def setEnableAutoPipeliningUndefined: Self = StObject.set(x, "enableAutoPipelining", js.undefined)
      
      inline def setEnableOfflineQueue(value: Boolean): Self = StObject.set(x, "enableOfflineQueue", value.asInstanceOf[js.Any])
      
      inline def setEnableOfflineQueueUndefined: Self = StObject.set(x, "enableOfflineQueue", js.undefined)
      
      inline def setEnableReadyCheck(value: Boolean): Self = StObject.set(x, "enableReadyCheck", value.asInstanceOf[js.Any])
      
      inline def setEnableReadyCheckUndefined: Self = StObject.set(x, "enableReadyCheck", js.undefined)
      
      inline def setEnableTLSForSentinelMode(value: Boolean): Self = StObject.set(x, "enableTLSForSentinelMode", value.asInstanceOf[js.Any])
      
      inline def setEnableTLSForSentinelModeUndefined: Self = StObject.set(x, "enableTLSForSentinelMode", js.undefined)
      
      inline def setFailoverDetector(value: Boolean): Self = StObject.set(x, "failoverDetector", value.asInstanceOf[js.Any])
      
      inline def setFailoverDetectorUndefined: Self = StObject.set(x, "failoverDetector", js.undefined)
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      inline def setHints(value: Double): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
      
      inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setKeepAlive(value: Double): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelay(value: Double): Self = StObject.set(x, "keepAliveInitialDelay", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelayUndefined: Self = StObject.set(x, "keepAliveInitialDelay", js.undefined)
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
      
      inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
      
      inline def setLazyConnect(value: Boolean): Self = StObject.set(x, "lazyConnect", value.asInstanceOf[js.Any])
      
      inline def setLazyConnectUndefined: Self = StObject.set(x, "lazyConnect", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      inline def setLookup(
        value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
      ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
      
      inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
      
      inline def setMaxLoadingRetryTime(value: Double): Self = StObject.set(x, "maxLoadingRetryTime", value.asInstanceOf[js.Any])
      
      inline def setMaxLoadingRetryTimeUndefined: Self = StObject.set(x, "maxLoadingRetryTime", js.undefined)
      
      inline def setMaxRetriesPerRequest(value: Double): Self = StObject.set(x, "maxRetriesPerRequest", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesPerRequestNull: Self = StObject.set(x, "maxRetriesPerRequest", null)
      
      inline def setMaxRetriesPerRequestUndefined: Self = StObject.set(x, "maxRetriesPerRequest", js.undefined)
      
      inline def setMonitor(value: Boolean): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
      
      inline def setMonitorUndefined: Self = StObject.set(x, "monitor", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNatMap(value: NatMap): Self = StObject.set(x, "natMap", value.asInstanceOf[js.Any])
      
      inline def setNatMapUndefined: Self = StObject.set(x, "natMap", js.undefined)
      
      inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
      
      inline def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
      
      inline def setOfflineQueue(value: Boolean): Self = StObject.set(x, "offlineQueue", value.asInstanceOf[js.Any])
      
      inline def setOfflineQueueUndefined: Self = StObject.set(x, "offlineQueue", js.undefined)
      
      inline def setOnread(value: OnReadOpts): Self = StObject.set(x, "onread", value.asInstanceOf[js.Any])
      
      inline def setOnreadUndefined: Self = StObject.set(x, "onread", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPreferredSlaves(value: PreferredSlaves): Self = StObject.set(x, "preferredSlaves", value.asInstanceOf[js.Any])
      
      inline def setPreferredSlavesFunction1(value: /* slaves */ js.Array[AddressFromResponse] => AddressFromResponse | Null): Self = StObject.set(x, "preferredSlaves", js.Any.fromFunction1(value))
      
      inline def setPreferredSlavesUndefined: Self = StObject.set(x, "preferredSlaves", js.undefined)
      
      inline def setPreferredSlavesVarargs(value: Ip*): Self = StObject.set(x, "preferredSlaves", js.Array(value*))
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
      
      inline def setReconnectOnError(value: /* err */ js.Error => Boolean | `1` | `2`): Self = StObject.set(x, "reconnectOnError", js.Any.fromFunction1(value))
      
      inline def setReconnectOnErrorNull: Self = StObject.set(x, "reconnectOnError", null)
      
      inline def setReconnectOnErrorUndefined: Self = StObject.set(x, "reconnectOnError", js.undefined)
      
      inline def setRetryStrategy(value: /* times */ Double => Double | Unit | Null): Self = StObject.set(x, "retryStrategy", js.Any.fromFunction1(value))
      
      inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
      
      inline def setRole(value: master_ | slave): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setScripts(value: Record[String, Lua]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setSentinelCommandTimeout(value: Double): Self = StObject.set(x, "sentinelCommandTimeout", value.asInstanceOf[js.Any])
      
      inline def setSentinelCommandTimeoutUndefined: Self = StObject.set(x, "sentinelCommandTimeout", js.undefined)
      
      inline def setSentinelMaxConnections(value: Double): Self = StObject.set(x, "sentinelMaxConnections", value.asInstanceOf[js.Any])
      
      inline def setSentinelMaxConnectionsUndefined: Self = StObject.set(x, "sentinelMaxConnections", js.undefined)
      
      inline def setSentinelPassword(value: String): Self = StObject.set(x, "sentinelPassword", value.asInstanceOf[js.Any])
      
      inline def setSentinelPasswordUndefined: Self = StObject.set(x, "sentinelPassword", js.undefined)
      
      inline def setSentinelReconnectStrategy(value: /* retryAttempts */ Double => Double | Unit | Null): Self = StObject.set(x, "sentinelReconnectStrategy", js.Any.fromFunction1(value))
      
      inline def setSentinelReconnectStrategyUndefined: Self = StObject.set(x, "sentinelReconnectStrategy", js.undefined)
      
      inline def setSentinelRetryStrategy(value: /* retryAttempts */ Double => Double | Unit | Null): Self = StObject.set(x, "sentinelRetryStrategy", js.Any.fromFunction1(value))
      
      inline def setSentinelRetryStrategyUndefined: Self = StObject.set(x, "sentinelRetryStrategy", js.undefined)
      
      inline def setSentinelTLS(value: ConnectionOptions): Self = StObject.set(x, "sentinelTLS", value.asInstanceOf[js.Any])
      
      inline def setSentinelTLSUndefined: Self = StObject.set(x, "sentinelTLS", js.undefined)
      
      inline def setSentinelUsername(value: String): Self = StObject.set(x, "sentinelUsername", value.asInstanceOf[js.Any])
      
      inline def setSentinelUsernameUndefined: Self = StObject.set(x, "sentinelUsername", js.undefined)
      
      inline def setSentinels(value: js.Array[PartialSentinelAddress]): Self = StObject.set(x, "sentinels", value.asInstanceOf[js.Any])
      
      inline def setSentinelsUndefined: Self = StObject.set(x, "sentinels", js.undefined)
      
      inline def setSentinelsVarargs(value: PartialSentinelAddress*): Self = StObject.set(x, "sentinels", js.Array(value*))
      
      inline def setShowFriendlyErrorStack(value: Boolean): Self = StObject.set(x, "showFriendlyErrorStack", value.asInstanceOf[js.Any])
      
      inline def setShowFriendlyErrorStackUndefined: Self = StObject.set(x, "showFriendlyErrorStack", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setStringNumbers(value: Boolean): Self = StObject.set(x, "stringNumbers", value.asInstanceOf[js.Any])
      
      inline def setStringNumbersUndefined: Self = StObject.set(x, "stringNumbers", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTls(value: ConnectionOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUpdateSentinels(value: Boolean): Self = StObject.set(x, "updateSentinels", value.asInstanceOf[js.Any])
      
      inline def setUpdateSentinelsUndefined: Self = StObject.set(x, "updateSentinels", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    }
  }
}
