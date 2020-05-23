package typings.koaRedisCache.mod

import typings.redis.mod.ClientOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisOptions extends js.Object {
  /**
    * host name of the redis server, default: 'localhost'
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * node_redis options
    */
  var options: js.UndefOr[ClientOpts] = js.undefined
  /**
    * port number of the redis server, default: 6379
    */
  var port: js.UndefOr[Double] = js.undefined
}

object RedisOptions {
  @scala.inline
  def apply(host: String = null, options: ClientOpts = null, port: js.UndefOr[Double] = js.undefined): RedisOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedisOptions]
  }
}

