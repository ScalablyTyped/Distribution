package typings.hapiCatboxRedis.mod

import typings.hapiCatbox.mod.ClientOptions
import typings.hapiCatboxRedis.anon.Host
import typings.ioredis.mod.Redis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatboxRedisOptions extends ClientOptions {
  /**
    * Raw client.
    */
  var client: js.UndefOr[Redis] = js.native
  /**
    * the Redis database.
    */
  var database: js.UndefOr[String] = js.native
  /**
    * the Redis server hostname.
    * Defaults to '127.0.0.1'.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * the Redis authentication password when required.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * the Redis server port or unix domain socket path.
    * Defaults to 6379.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * the name of the sentinel master.
    * (Only needed when sentinels is specified)
    */
  var sentinelName: js.UndefOr[String] = js.native
  /**
    * an array of redis sentinel addresses to connect to.
    */
  var sentinels: js.UndefOr[js.Array[Host]] = js.native
  /**
    * the unix socket string to connect to (if socket is provided, host and port are ignored)
    */
  var socket: js.UndefOr[String] = js.native
  /**
    * the Redis server URL (if url is provided, host, port, and socket are ignored)
    */
  var url: js.UndefOr[String] = js.native
}

object CatboxRedisOptions {
  @scala.inline
  def apply(): CatboxRedisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatboxRedisOptions]
  }
  @scala.inline
  implicit class CatboxRedisOptionsOps[Self <: CatboxRedisOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClient(value: Redis): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setSentinelName(value: String): Self = this.set("sentinelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentinelName: Self = this.set("sentinelName", js.undefined)
    @scala.inline
    def setSentinelsVarargs(value: Host*): Self = this.set("sentinels", js.Array(value :_*))
    @scala.inline
    def setSentinels(value: js.Array[Host]): Self = this.set("sentinels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentinels: Self = this.set("sentinels", js.undefined)
    @scala.inline
    def setSocket(value: String): Self = this.set("socket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

