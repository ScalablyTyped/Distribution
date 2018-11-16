package typings
package koaDashRedisDashCacheLib.koaDashRedisDashCacheMod.cacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RouteOptions extends js.Object {
  /**
           * expiration time in seconds for cached responses for the route
           */
  var expire: js.UndefOr[scala.Double] = js.undefined
  /**
           * the route to cache, example: '/api/(.*)'
           */
  var route: java.lang.String
}

