package typings.atHapiCatboxDashRedis.atHapiCatboxDashRedisMod

import typings.atHapiCatbox.atHapiCatboxMod.ClientOptions
import typings.atHapiCatboxDashRedis.Anon_Host
import typings.ioredis.ioredisMod.Redis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatboxRedisOptions extends ClientOptions {
  /**
    * Raw client.
    */
  var client: js.UndefOr[Redis] = js.undefined
  /**
    * the Redis database.
    */
  var database: js.UndefOr[String] = js.undefined
  /**
    * the Redis server hostname.
    * Defaults to '127.0.0.1'.
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * the Redis authentication password when required.
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * the Redis server port or unix domain socket path.
    * Defaults to 6379.
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * the name of the sentinel master.
    * (Only needed when sentinels is specified)
    */
  var sentinelName: js.UndefOr[String] = js.undefined
  /**
    * an array of redis sentinel addresses to connect to.
    */
  var sentinels: js.UndefOr[js.Array[Anon_Host]] = js.undefined
  /**
    * the unix socket string to connect to (if socket is provided, host and port are ignored)
    */
  var socket: js.UndefOr[String] = js.undefined
  /**
    * the Redis server URL (if url is provided, host, port, and socket are ignored)
    */
  var url: js.UndefOr[String] = js.undefined
}

object CatboxRedisOptions {
  @scala.inline
  def apply(
    client: Redis = null,
    database: String = null,
    host: String = null,
    partition: String = null,
    password: String = null,
    port: Int | Double = null,
    sentinelName: String = null,
    sentinels: js.Array[Anon_Host] = null,
    socket: String = null,
    url: String = null
  ): CatboxRedisOptions = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (sentinelName != null) __obj.updateDynamic("sentinelName")(sentinelName.asInstanceOf[js.Any])
    if (sentinels != null) __obj.updateDynamic("sentinels")(sentinels.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatboxRedisOptions]
  }
}

