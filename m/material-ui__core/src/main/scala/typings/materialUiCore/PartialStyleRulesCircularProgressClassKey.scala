package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CircularProgress.CircularProgressClassKey>> */
@js.native
trait PartialStyleRulesCircularProgressClassKey extends js.Object {
  var circle: js.UndefOr[CSSProperties] = js.native
  var circleDisableShrink: js.UndefOr[CSSProperties] = js.native
  var circleIndeterminate: js.UndefOr[CSSProperties] = js.native
  var circleStatic: js.UndefOr[CSSProperties] = js.native
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  var colorSecondary: js.UndefOr[CSSProperties] = js.native
  var indeterminate: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var static: js.UndefOr[CSSProperties] = js.native
  var svg: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesCircularProgressClassKey {
  @scala.inline
  def apply(
    circle: CSSProperties = null,
    circleDisableShrink: CSSProperties = null,
    circleIndeterminate: CSSProperties = null,
    circleStatic: CSSProperties = null,
    colorPrimary: CSSProperties = null,
    colorSecondary: CSSProperties = null,
    indeterminate: CSSProperties = null,
    root: CSSProperties = null,
    static: CSSProperties = null,
    svg: CSSProperties = null
  ): PartialStyleRulesCircularProgressClassKey = {
    val __obj = js.Dynamic.literal()
    if (circle != null) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    if (circleDisableShrink != null) __obj.updateDynamic("circleDisableShrink")(circleDisableShrink.asInstanceOf[js.Any])
    if (circleIndeterminate != null) __obj.updateDynamic("circleIndeterminate")(circleIndeterminate.asInstanceOf[js.Any])
    if (circleStatic != null) __obj.updateDynamic("circleStatic")(circleStatic.asInstanceOf[js.Any])
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary.asInstanceOf[js.Any])
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary.asInstanceOf[js.Any])
    if (indeterminate != null) __obj.updateDynamic("indeterminate")(indeterminate.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesCircularProgressClassKey]
  }
}

