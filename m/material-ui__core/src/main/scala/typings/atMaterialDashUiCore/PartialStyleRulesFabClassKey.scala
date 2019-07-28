package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Fab.FabClassKey>> */
trait PartialStyleRulesFabClassKey extends js.Object {
  var colorInherit: js.UndefOr[CSSProperties] = js.undefined
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var extended: js.UndefOr[CSSProperties] = js.undefined
  var focusVisible: js.UndefOr[CSSProperties] = js.undefined
  var label: js.UndefOr[CSSProperties] = js.undefined
  var primary: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var secondary: js.UndefOr[CSSProperties] = js.undefined
  var sizeMedium: js.UndefOr[CSSProperties] = js.undefined
  var sizeSmall: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesFabClassKey {
  @scala.inline
  def apply(
    colorInherit: CSSProperties = null,
    disabled: CSSProperties = null,
    extended: CSSProperties = null,
    focusVisible: CSSProperties = null,
    label: CSSProperties = null,
    primary: CSSProperties = null,
    root: CSSProperties = null,
    secondary: CSSProperties = null,
    sizeMedium: CSSProperties = null,
    sizeSmall: CSSProperties = null
  ): PartialStyleRulesFabClassKey = {
    val __obj = js.Dynamic.literal()
    if (colorInherit != null) __obj.updateDynamic("colorInherit")(colorInherit)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (extended != null) __obj.updateDynamic("extended")(extended)
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible)
    if (label != null) __obj.updateDynamic("label")(label)
    if (primary != null) __obj.updateDynamic("primary")(primary)
    if (root != null) __obj.updateDynamic("root")(root)
    if (secondary != null) __obj.updateDynamic("secondary")(secondary)
    if (sizeMedium != null) __obj.updateDynamic("sizeMedium")(sizeMedium)
    if (sizeSmall != null) __obj.updateDynamic("sizeSmall")(sizeSmall)
    __obj.asInstanceOf[PartialStyleRulesFabClassKey]
  }
}

