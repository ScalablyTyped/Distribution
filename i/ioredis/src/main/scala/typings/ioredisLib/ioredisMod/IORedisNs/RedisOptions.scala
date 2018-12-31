package typings
package ioredisLib.ioredisMod.IORedisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisOptions extends js.Object {
  /**
    * If true, client will resend unfulfilled commands(e.g. block commands) in the previous connection when reconnected.
    * default: true.
    */
  var autoResendUnfulfilledCommands: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * After reconnected, if the previous connection was in the subscriber mode, client will auto re-subscribe these channels.
    * default: true.
    */
  var autoResubscribe: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The milliseconds before a timeout occurs during the initial connection to the Redis server.
    * default: 10000.
    */
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  var connectionName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Database index to use.
    */
  var db: js.UndefOr[scala.Double] = js.undefined
  /**
    * If you are using the hiredis parser, it's highly recommended to enable this option.
    * Create another instance with dropBufferSupport disabled for other commands that you want to return binary instead of string
    */
  var dropBufferSupport: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, if there is no active connection to the Redis server, commands are added to a queue
    * and are executed once the connection is "ready" (when enableReadyCheck is true, "ready" means
    * the Redis server has loaded the database from disk, otherwise means the connection to the Redis
    * server has been established). If this option is false, when execute the command when the connection
    * isn't ready, an error will be returned.
    */
  var enableOfflineQueue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When a connection is established to the Redis server, the server might still be loading
    * the database from disk. While loading, the server not respond to any commands.
    * To work around this, when this option is true, ioredis will check the status of the Redis server,
    * and when the Redis server is able to process commands, a ready event will be emitted.
    */
  var enableReadyCheck: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 4 (IPv4) or 6 (IPv6), Defaults to 4.
    */
  var family: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * TCP KeepAlive on the socket with a X ms delay before start. Set to a non-number value to disable keepAlive.
    */
  var keepAlive: js.UndefOr[scala.Double] = js.undefined
  var keyPrefix: js.UndefOr[java.lang.String] = js.undefined
  var lazyConnect: js.UndefOr[scala.Boolean] = js.undefined
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
  var maxRetriesPerRequest: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set, client will send AUTH command with the value of this option when connected.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Local domain socket path. If set the port, host and family will be ignored.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable READONLY mode for the connection. Only available for cluster mode.
    * default: false.
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 1/true means reconnect, 2 means reconnect and resend failed command. Returning false will ignore
    * the error and do nothing.
    */
  var reconnectOnError: js.UndefOr[
    js.Function1[
      /* error */ nodeLib.Error, 
      scala.Boolean | ioredisLib.ioredisLibNumbers.`1` | ioredisLib.ioredisLibNumbers.`2`
    ]
  ] = js.undefined
  /**
    * When the return value isn't a number, ioredis will stop trying to reconnect.
    * Fixed in: https://github.com/DefinitelyTyped/DefinitelyTyped/pull/15858
    */
  var retryStrategy: js.UndefOr[
    js.Function1[/* times */ scala.Double, scala.Double | ioredisLib.ioredisLibNumbers.`false`]
  ] = js.undefined
  var sentinels: js.UndefOr[js.Array[ioredisLib.Anon_Host]] = js.undefined
  /**
    * Whether to show a friendly error stack. Will decrease the performance significantly.
    */
  var showFriendlyErrorStack: js.UndefOr[scala.Boolean] = js.undefined
  var tls: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
}

