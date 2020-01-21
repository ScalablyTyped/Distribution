package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Fab.FabClassKey>> */
@js.native
trait PartialStyleRulesFabClassKey extends js.Object {
  var colorInherit: js.UndefOr[CSSProperties] = js.native
  var disabled: js.UndefOr[CSSProperties] = js.native
  var extended: js.UndefOr[CSSProperties] = js.native
  var focusVisible: js.UndefOr[CSSProperties] = js.native
  var label: js.UndefOr[CSSProperties] = js.native
  var primary: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var secondary: js.UndefOr[CSSProperties] = js.native
  var sizeMedium: js.UndefOr[CSSProperties] = js.native
  var sizeSmall: js.UndefOr[CSSProperties] = js.native
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
    if (colorInherit != null) __obj.updateDynamic("colorInherit")(colorInherit.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extended != null) __obj.updateDynamic("extended")(extended.asInstanceOf[js.Any])
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (sizeMedium != null) __obj.updateDynamic("sizeMedium")(sizeMedium.asInstanceOf[js.Any])
    if (sizeSmall != null) __obj.updateDynamic("sizeSmall")(sizeSmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesFabClassKey]
  }
}

