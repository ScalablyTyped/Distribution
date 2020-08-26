package typings.koaRedisCache.mod

import typings.redis.mod.ClientOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisOptions extends js.Object {
  /**
    * host name of the redis server, default: 'localhost'
    */
  var host: js.UndefOr[String] = js.native
  /**
    * node_redis options
    */
  var options: js.UndefOr[ClientOpts] = js.native
  /**
    * port number of the redis server, default: 6379
    */
  var port: js.UndefOr[Double] = js.native
}

object RedisOptions {
  @scala.inline
  def apply(): RedisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedisOptions]
  }
  @scala.inline
  implicit class RedisOptionsOps[Self <: RedisOptions] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setOptions(value: ClientOpts): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

