package typings
package koaDashRouterLib.koaDashRouterMod.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouterOptions extends js.Object {
  /**
    * Methods which should be supported by the router.
    */
  var methods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Prefix for all routes.
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var routerPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not routing should be case-sensitive.
    */
  var sensitive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not routes should matched strictly.
    *
    * If strict matching is enabled, the trailing slash is taken into
    * account when matching routes.
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

