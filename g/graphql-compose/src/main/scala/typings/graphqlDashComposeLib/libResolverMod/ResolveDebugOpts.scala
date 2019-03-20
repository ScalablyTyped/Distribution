package typings
package graphqlDashComposeLib.libResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveDebugOpts extends js.Object {
  var colors: js.UndefOr[scala.Boolean] = js.undefined
  var depth: js.UndefOr[scala.Double] = js.undefined
  var showHidden: js.UndefOr[scala.Boolean] = js.undefined
}

object ResolveDebugOpts {
  @scala.inline
  def apply(
    colors: js.UndefOr[scala.Boolean] = js.undefined,
    depth: scala.Int | scala.Double = null,
    showHidden: js.UndefOr[scala.Boolean] = js.undefined
  ): ResolveDebugOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(showHidden)) __obj.updateDynamic("showHidden")(showHidden)
    __obj.asInstanceOf[ResolveDebugOpts]
  }
}

