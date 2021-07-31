package typings.ioredis.mod

import typings.ioredis.anon.Host
import typings.ioredis.anon.Ip
import typings.ioredis.ioredisNumbers.`1`
import typings.ioredis.ioredisNumbers.`2`
import typings.ioredis.ioredisStrings.master
import typings.ioredis.ioredisStrings.slave
import typings.node.tlsMod.ConnectionOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedisOptions extends StObject {
  
  /**
    * If true, client will resend unfulfilled commands(e.g. block commands) in the previous connection when reconnected.
    * default: true.
    */
  var autoResendUnfulfilledCommands: js.UndefOr[Boolean] = js.undefined
  
  /**
    * After reconnected, if the previous connection was in the subscriber mode, client will auto re-subscribe these channels.
    * default: true.
    */
  var autoResubscribe: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The milliseconds before a timeout occurs during the initial connection to the Redis server.
    * default: 10000.
    */
  var connectTimeout: js.UndefOr[Double] = js.undefined
  
  var connectionName: js.UndefOr[String] = js.undefined
  
  /**
    * Database index to use.
    */
  var db: js.UndefOr[Double] = js.undefined
  
  /**
    * If you are using the hiredis parser, it's highly recommended to enable this option.
    * Create another instance with dropBufferSupport disabled for other commands that you want to return binary instead of string
    */
  var dropBufferSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When enabled, all commands issued during an event loop iteration are automatically wrapped in a
    * pipeline and sent to the server at the same time. This can improve performance by 30-50%.
    * default: false.
    */
  var enableAutoPipelining: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, if there is no active connection to the Redis server, commands are added to a queue
    * and are executed once the connection is "ready" (when enableReadyCheck is true, "ready" means
    * the Redis server has loaded the database from disk, otherwise means the connection to the Redis
    * server has been established). If this option is false, when execute the command when the connection
    * isn't ready, an error will be returned.
    */
  var enableOfflineQueue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When a connection is established to the Redis server, the server might still be loading
    * the database from disk. While loading, the server not respond to any commands.
    * To work around this, when this option is true, ioredis will check the status of the Redis server,
    * and when the Redis server is able to process commands, a ready event will be emitted.
    */
  var enableReadyCheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to support the `tls` option when connecting to Redis via sentinel mode.
    * default: false.
    */
  var enableTLSForSentinelMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 4 (IPv4) or 6 (IPv6), Defaults to 4.
    */
  var family: js.UndefOr[Double] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * TCP KeepAlive on the socket with a X ms delay before start. Set to a non-number value to disable keepAlive.
    */
  var keepAlive: js.UndefOr[Double] = js.undefined
  
  var keyPrefix: js.UndefOr[String] = js.undefined
  
  var lazyConnect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, all pending commands will be flushed with an error every
    * 20 retry attempts. That makes sure commands won't wait forever when
    * the connection is down. You can change this behavior by setting
    * `maxRetriesPerRequest`.
    *
    * Set maxRetriesPerRequest to `null` to disable this behavior, and
    * every command will wait forever until the connection is alive again
    * (which is the default behavior before ioredis v4).
    */
  var maxRetriesPerRequest: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * default: null.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * NAT map for sentinel connector.
    * default: null.
    */
  var natMap: js.UndefOr[NatMap] = js.undefined
  
  /**
    * If set, client will send AUTH command with the value of this option when connected.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * Local domain socket path. If set the port, host and family will be ignored.
    */
  var path: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * Can be used to prefer a particular slave or set of slaves based on priority.
    */
  var preferredSlaves: js.UndefOr[PreferredSlaves] = js.undefined
  
  /**
    * Enable READONLY mode for the connection. Only available for cluster mode.
    * default: false.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 1/true means reconnect, 2 means reconnect and resend failed command. Returning false will ignore
    * the error and do nothing.
    */
  var reconnectOnError: js.UndefOr[js.Function1[/* error */ Error, Boolean | `1` | `2`]] = js.undefined
  
  /**
    * When the return value isn't a number, ioredis will stop trying to reconnect.
    * Fixed in: https://github.com/DefinitelyTyped/DefinitelyTyped/pull/15858
    */
  var retryStrategy: js.UndefOr[js.Function1[/* times */ Double, Double | Unit | Null]] = js.undefined
  
  /**
    * default: "master".
    */
  var role: js.UndefOr[master | slave] = js.undefined
  
  var sentinelPassword: js.UndefOr[String] = js.undefined
  
  /**
    * If `sentinelRetryStrategy` returns a valid delay time, ioredis will try to reconnect from scratch.
    * default: function(times) { return Math.min(times * 10, 1000); }
    */
  var sentinelRetryStrategy: js.UndefOr[js.Function1[/* times */ Double, Double | Unit | Null]] = js.undefined
  
  var sentinelTLS: js.UndefOr[SecureContextOptions] = js.undefined
  
  var sentinelUsername: js.UndefOr[String] = js.undefined
  
  var sentinels: js.UndefOr[js.Array[Host]] = js.undefined
  
  /**
    * Whether to show a friendly error stack. Will decrease the performance significantly.
    */
  var showFriendlyErrorStack: js.UndefOr[Boolean] = js.undefined
  
  var tls: js.UndefOr[ConnectionOptions] = js.undefined
  
  /**
    * Update the given `sentinels` list with new IP addresses when communicating with existing sentinels.
    * default: true.
    */
  var updateSentinels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set, client will send AUTH command with the value of this option as the first argument when connected. The `password` option must be set too. Username should only be set for Redis >=6.
    */
  var username: js.UndefOr[String] = js.undefined
}
object RedisOptions {
  
  @scala.inline
  def apply(): RedisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedisOptions]
  }
  
  @scala.inline
  implicit class RedisOptionsMutableBuilder[Self <: RedisOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoResendUnfulfilledCommands(value: Boolean): Self = StObject.set(x, "autoResendUnfulfilledCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResendUnfulfilledCommandsUndefined: Self = StObject.set(x, "autoResendUnfulfilledCommands", js.undefined)
    
    @scala.inline
    def setAutoResubscribe(value: Boolean): Self = StObject.set(x, "autoResubscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResubscribeUndefined: Self = StObject.set(x, "autoResubscribe", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    @scala.inline
    def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
    
    @scala.inline
    def setDb(value: Double): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
    
    @scala.inline
    def setDropBufferSupport(value: Boolean): Self = StObject.set(x, "dropBufferSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropBufferSupportUndefined: Self = StObject.set(x, "dropBufferSupport", js.undefined)
    
    @scala.inline
    def setEnableAutoPipelining(value: Boolean): Self = StObject.set(x, "enableAutoPipelining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoPipeliningUndefined: Self = StObject.set(x, "enableAutoPipelining", js.undefined)
    
    @scala.inline
    def setEnableOfflineQueue(value: Boolean): Self = StObject.set(x, "enableOfflineQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableOfflineQueueUndefined: Self = StObject.set(x, "enableOfflineQueue", js.undefined)
    
    @scala.inline
    def setEnableReadyCheck(value: Boolean): Self = StObject.set(x, "enableReadyCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableReadyCheckUndefined: Self = StObject.set(x, "enableReadyCheck", js.undefined)
    
    @scala.inline
    def setEnableTLSForSentinelMode(value: Boolean): Self = StObject.set(x, "enableTLSForSentinelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTLSForSentinelModeUndefined: Self = StObject.set(x, "enableTLSForSentinelMode", js.undefined)
    
    @scala.inline
    def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Double): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    @scala.inline
    def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
    
    @scala.inline
    def setLazyConnect(value: Boolean): Self = StObject.set(x, "lazyConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyConnectUndefined: Self = StObject.set(x, "lazyConnect", js.undefined)
    
    @scala.inline
    def setMaxRetriesPerRequest(value: Double): Self = StObject.set(x, "maxRetriesPerRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesPerRequestNull: Self = StObject.set(x, "maxRetriesPerRequest", null)
    
    @scala.inline
    def setMaxRetriesPerRequestUndefined: Self = StObject.set(x, "maxRetriesPerRequest", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNatMap(value: NatMap): Self = StObject.set(x, "natMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatMapUndefined: Self = StObject.set(x, "natMap", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setPreferredSlaves(value: PreferredSlaves): Self = StObject.set(x, "preferredSlaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredSlavesFunction1(value: /* slaves */ js.Array[AddressFromResponse] => AddressFromResponse | Null): Self = StObject.set(x, "preferredSlaves", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreferredSlavesUndefined: Self = StObject.set(x, "preferredSlaves", js.undefined)
    
    @scala.inline
    def setPreferredSlavesVarargs(value: Ip*): Self = StObject.set(x, "preferredSlaves", js.Array(value :_*))
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setReconnectOnError(value: /* error */ Error => Boolean | `1` | `2`): Self = StObject.set(x, "reconnectOnError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReconnectOnErrorUndefined: Self = StObject.set(x, "reconnectOnError", js.undefined)
    
    @scala.inline
    def setRetryStrategy(value: /* times */ Double => Double | Unit | Null): Self = StObject.set(x, "retryStrategy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
    
    @scala.inline
    def setRole(value: master | slave): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSentinelPassword(value: String): Self = StObject.set(x, "sentinelPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentinelPasswordUndefined: Self = StObject.set(x, "sentinelPassword", js.undefined)
    
    @scala.inline
    def setSentinelRetryStrategy(value: /* times */ Double => Double | Unit | Null): Self = StObject.set(x, "sentinelRetryStrategy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSentinelRetryStrategyUndefined: Self = StObject.set(x, "sentinelRetryStrategy", js.undefined)
    
    @scala.inline
    def setSentinelTLS(value: SecureContextOptions): Self = StObject.set(x, "sentinelTLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentinelTLSUndefined: Self = StObject.set(x, "sentinelTLS", js.undefined)
    
    @scala.inline
    def setSentinelUsername(value: String): Self = StObject.set(x, "sentinelUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentinelUsernameUndefined: Self = StObject.set(x, "sentinelUsername", js.undefined)
    
    @scala.inline
    def setSentinels(value: js.Array[Host]): Self = StObject.set(x, "sentinels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentinelsUndefined: Self = StObject.set(x, "sentinels", js.undefined)
    
    @scala.inline
    def setSentinelsVarargs(value: Host*): Self = StObject.set(x, "sentinels", js.Array(value :_*))
    
    @scala.inline
    def setShowFriendlyErrorStack(value: Boolean): Self = StObject.set(x, "showFriendlyErrorStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFriendlyErrorStackUndefined: Self = StObject.set(x, "showFriendlyErrorStack", js.undefined)
    
    @scala.inline
    def setTls(value: ConnectionOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    
    @scala.inline
    def setUpdateSentinels(value: Boolean): Self = StObject.set(x, "updateSentinels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSentinelsUndefined: Self = StObject.set(x, "updateSentinels", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
