package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CardActionArea.CardActionAreaClassKey>> */
trait PartialStyleRulesCardActionAreaClassKey extends js.Object {
  var focusHighlight: js.UndefOr[CSSProperties] = js.undefined
  var focusVisible: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesCardActionAreaClassKey {
  @scala.inline
  def apply(
    focusHighlight: CSSProperties = null,
    focusVisible: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesCardActionAreaClassKey = {
    val __obj = js.Dynamic.literal()
    if (focusHighlight != null) __obj.updateDynamic("focusHighlight")(focusHighlight.asInstanceOf[js.Any])
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesCardActionAreaClassKey]
  }
}

