package typings
package makeupDashExpanderLib.makeupDashExpanderMod.ExpanderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoCollapse: js.UndefOr[scala.Boolean] = js.undefined
  var collapseOnClickOut: js.UndefOr[scala.Boolean] = js.undefined
  var collapseOnFocusOut: js.UndefOr[scala.Boolean] = js.undefined
  var collapseOnMouseOut: js.UndefOr[scala.Boolean] = js.undefined
  var contentSelector: js.UndefOr[java.lang.String] = js.undefined
  var expandOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var expandOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var expandOnHover: js.UndefOr[scala.Boolean] = js.undefined
  var expandedClass: js.UndefOr[java.lang.String] = js.undefined
  var focusManagement: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var hostSelector: js.UndefOr[java.lang.String] = js.undefined
  var simulateSpacebarClick: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoCollapse: js.UndefOr[scala.Boolean] = js.undefined,
    collapseOnClickOut: js.UndefOr[scala.Boolean] = js.undefined,
    collapseOnFocusOut: js.UndefOr[scala.Boolean] = js.undefined,
    collapseOnMouseOut: js.UndefOr[scala.Boolean] = js.undefined,
    contentSelector: java.lang.String = null,
    expandOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    expandOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    expandOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    expandedClass: java.lang.String = null,
    focusManagement: java.lang.String = null,
    hostSelector: java.lang.String = null,
    simulateSpacebarClick: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCollapse)) __obj.updateDynamic("autoCollapse")(autoCollapse)
    if (!js.isUndefined(collapseOnClickOut)) __obj.updateDynamic("collapseOnClickOut")(collapseOnClickOut)
    if (!js.isUndefined(collapseOnFocusOut)) __obj.updateDynamic("collapseOnFocusOut")(collapseOnFocusOut)
    if (!js.isUndefined(collapseOnMouseOut)) __obj.updateDynamic("collapseOnMouseOut")(collapseOnMouseOut)
    if (contentSelector != null) __obj.updateDynamic("contentSelector")(contentSelector)
    if (!js.isUndefined(expandOnClick)) __obj.updateDynamic("expandOnClick")(expandOnClick)
    if (!js.isUndefined(expandOnFocus)) __obj.updateDynamic("expandOnFocus")(expandOnFocus)
    if (!js.isUndefined(expandOnHover)) __obj.updateDynamic("expandOnHover")(expandOnHover)
    if (expandedClass != null) __obj.updateDynamic("expandedClass")(expandedClass)
    if (focusManagement != null) __obj.updateDynamic("focusManagement")(focusManagement)
    if (hostSelector != null) __obj.updateDynamic("hostSelector")(hostSelector)
    if (!js.isUndefined(simulateSpacebarClick)) __obj.updateDynamic("simulateSpacebarClick")(simulateSpacebarClick)
    __obj.asInstanceOf[Options]
  }
}

