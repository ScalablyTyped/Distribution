package typings.koaDashRedisDashCache.koaDashRedisDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  /**
    * expiration time in seconds for cached responses for the route
    */
  var expire: js.UndefOr[Double] = js.undefined
  /**
    * the route to cache, example: '/api/(.*)'
    */
  var route: String
}

object RouteOptions {
  @scala.inline
  def apply(route: String, expire: Int | Double = null): RouteOptions = {
    val __obj = js.Dynamic.literal(route = route)
    if (expire != null) __obj.updateDynamic("expire")(expire.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptions]
  }
}

