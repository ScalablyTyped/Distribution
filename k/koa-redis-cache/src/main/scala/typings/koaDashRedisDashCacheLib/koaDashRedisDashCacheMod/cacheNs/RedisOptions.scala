package typings
package koaDashRedisDashCacheLib.koaDashRedisDashCacheMod.cacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisOptions extends js.Object {
  /**
    * host name of the redis server, default: 'localhost'
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * node_redis options
    */
  var options: js.UndefOr[redisLib.redisMod.ClientOpts] = js.undefined
  /**
    * port number of the redis server, default: 6379
    */
  var port: js.UndefOr[scala.Double] = js.undefined
}

object RedisOptions {
  @scala.inline
  def apply(
    host: java.lang.String = null,
    options: redisLib.redisMod.ClientOpts = null,
    port: scala.Int | scala.Double = null
  ): RedisOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (options != null) __obj.updateDynamic("options")(options)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedisOptions]
  }
}

