package typings
package koaDashRouterLib.koaDashRouterMod

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

object IRouterOptions {
  @scala.inline
  def apply(
    methods: js.Array[java.lang.String] = null,
    prefix: java.lang.String = null,
    routerPath: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): IRouterOptions = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (routerPath != null) __obj.updateDynamic("routerPath")(routerPath)
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[IRouterOptions]
  }
}

