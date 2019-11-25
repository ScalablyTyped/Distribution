package typings.makeupDashExpander.makeupDashExpanderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoCollapse: js.UndefOr[Boolean] = js.undefined
  var collapseOnClickOut: js.UndefOr[Boolean] = js.undefined
  var collapseOnFocusOut: js.UndefOr[Boolean] = js.undefined
  var collapseOnMouseOut: js.UndefOr[Boolean] = js.undefined
  var contentSelector: js.UndefOr[String] = js.undefined
  var expandOnClick: js.UndefOr[Boolean] = js.undefined
  var expandOnFocus: js.UndefOr[Boolean] = js.undefined
  var expandOnHover: js.UndefOr[Boolean] = js.undefined
  var expandedClass: js.UndefOr[String] = js.undefined
  var focusManagement: js.UndefOr[String | Null] = js.undefined
  var hostSelector: js.UndefOr[String] = js.undefined
  var simulateSpacebarClick: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoCollapse: js.UndefOr[Boolean] = js.undefined,
    collapseOnClickOut: js.UndefOr[Boolean] = js.undefined,
    collapseOnFocusOut: js.UndefOr[Boolean] = js.undefined,
    collapseOnMouseOut: js.UndefOr[Boolean] = js.undefined,
    contentSelector: String = null,
    expandOnClick: js.UndefOr[Boolean] = js.undefined,
    expandOnFocus: js.UndefOr[Boolean] = js.undefined,
    expandOnHover: js.UndefOr[Boolean] = js.undefined,
    expandedClass: String = null,
    focusManagement: String = null,
    hostSelector: String = null,
    simulateSpacebarClick: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCollapse)) __obj.updateDynamic("autoCollapse")(autoCollapse.asInstanceOf[js.Any])
    if (!js.isUndefined(collapseOnClickOut)) __obj.updateDynamic("collapseOnClickOut")(collapseOnClickOut.asInstanceOf[js.Any])
    if (!js.isUndefined(collapseOnFocusOut)) __obj.updateDynamic("collapseOnFocusOut")(collapseOnFocusOut.asInstanceOf[js.Any])
    if (!js.isUndefined(collapseOnMouseOut)) __obj.updateDynamic("collapseOnMouseOut")(collapseOnMouseOut.asInstanceOf[js.Any])
    if (contentSelector != null) __obj.updateDynamic("contentSelector")(contentSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(expandOnClick)) __obj.updateDynamic("expandOnClick")(expandOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(expandOnFocus)) __obj.updateDynamic("expandOnFocus")(expandOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(expandOnHover)) __obj.updateDynamic("expandOnHover")(expandOnHover.asInstanceOf[js.Any])
    if (expandedClass != null) __obj.updateDynamic("expandedClass")(expandedClass.asInstanceOf[js.Any])
    if (focusManagement != null) __obj.updateDynamic("focusManagement")(focusManagement.asInstanceOf[js.Any])
    if (hostSelector != null) __obj.updateDynamic("hostSelector")(hostSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(simulateSpacebarClick)) __obj.updateDynamic("simulateSpacebarClick")(simulateSpacebarClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

