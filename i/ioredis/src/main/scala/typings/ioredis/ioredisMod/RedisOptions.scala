package typings.ioredis.ioredisMod

import typings.ioredis.Anon_Host
import typings.ioredis.ioredisNumbers.`1`
import typings.ioredis.ioredisNumbers.`2`
import typings.ioredis.ioredisNumbers.`false`
import typings.node.tlsMod.ConnectionOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisOptions extends js.Object {
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
  var name: js.UndefOr[String] = js.undefined
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
  var retryStrategy: js.UndefOr[js.Function1[/* times */ Double, Double | `false`]] = js.undefined
  var sentinels: js.UndefOr[js.Array[Anon_Host]] = js.undefined
  /**
    * Whether to show a friendly error stack. Will decrease the performance significantly.
    */
  var showFriendlyErrorStack: js.UndefOr[Boolean] = js.undefined
  var tls: js.UndefOr[ConnectionOptions] = js.undefined
}

object RedisOptions {
  @scala.inline
  def apply(
    autoResendUnfulfilledCommands: js.UndefOr[Boolean] = js.undefined,
    autoResubscribe: js.UndefOr[Boolean] = js.undefined,
    connectTimeout: Int | Double = null,
    connectionName: String = null,
    db: Int | Double = null,
    dropBufferSupport: js.UndefOr[Boolean] = js.undefined,
    enableOfflineQueue: js.UndefOr[Boolean] = js.undefined,
    enableReadyCheck: js.UndefOr[Boolean] = js.undefined,
    family: Int | Double = null,
    host: String = null,
    keepAlive: Int | Double = null,
    keyPrefix: String = null,
    lazyConnect: js.UndefOr[Boolean] = js.undefined,
    maxRetriesPerRequest: Int | Double = null,
    name: String = null,
    password: String = null,
    path: String = null,
    port: Int | Double = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    reconnectOnError: /* error */ Error => Boolean | `1` | `2` = null,
    retryStrategy: /* times */ Double => Double | `false` = null,
    sentinels: js.Array[Anon_Host] = null,
    showFriendlyErrorStack: js.UndefOr[Boolean] = js.undefined,
    tls: ConnectionOptions = null
  ): RedisOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResendUnfulfilledCommands)) __obj.updateDynamic("autoResendUnfulfilledCommands")(autoResendUnfulfilledCommands)
    if (!js.isUndefined(autoResubscribe)) __obj.updateDynamic("autoResubscribe")(autoResubscribe)
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (connectionName != null) __obj.updateDynamic("connectionName")(connectionName)
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (!js.isUndefined(dropBufferSupport)) __obj.updateDynamic("dropBufferSupport")(dropBufferSupport)
    if (!js.isUndefined(enableOfflineQueue)) __obj.updateDynamic("enableOfflineQueue")(enableOfflineQueue)
    if (!js.isUndefined(enableReadyCheck)) __obj.updateDynamic("enableReadyCheck")(enableReadyCheck)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (keepAlive != null) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix)
    if (!js.isUndefined(lazyConnect)) __obj.updateDynamic("lazyConnect")(lazyConnect)
    if (maxRetriesPerRequest != null) __obj.updateDynamic("maxRetriesPerRequest")(maxRetriesPerRequest.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (password != null) __obj.updateDynamic("password")(password)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (reconnectOnError != null) __obj.updateDynamic("reconnectOnError")(js.Any.fromFunction1(reconnectOnError))
    if (retryStrategy != null) __obj.updateDynamic("retryStrategy")(js.Any.fromFunction1(retryStrategy))
    if (sentinels != null) __obj.updateDynamic("sentinels")(sentinels)
    if (!js.isUndefined(showFriendlyErrorStack)) __obj.updateDynamic("showFriendlyErrorStack")(showFriendlyErrorStack)
    if (tls != null) __obj.updateDynamic("tls")(tls)
    __obj.asInstanceOf[RedisOptions]
  }
}

