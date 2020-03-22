package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CardActionArea.CardActionAreaClassKey>> */
@js.native
trait PartialStyleRulesCardActi extends js.Object {
  var focusHighlight: js.UndefOr[CSSProperties] = js.native
  var focusVisible: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesCardActi {
  @scala.inline
  def apply(
    focusHighlight: CSSProperties = null,
    focusVisible: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesCardActi = {
    val __obj = js.Dynamic.literal()
    if (focusHighlight != null) __obj.updateDynamic("focusHighlight")(focusHighlight.asInstanceOf[js.Any])
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesCardActi]
  }
}

