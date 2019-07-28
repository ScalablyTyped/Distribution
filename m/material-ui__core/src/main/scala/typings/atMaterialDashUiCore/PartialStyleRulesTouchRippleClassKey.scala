package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ButtonBase/TouchRipple.TouchRippleClassKey>> */
trait PartialStyleRulesTouchRippleClassKey extends js.Object {
  var child: js.UndefOr[CSSProperties] = js.undefined
  var childLeaving: js.UndefOr[CSSProperties] = js.undefined
  var childPulsate: js.UndefOr[CSSProperties] = js.undefined
  var ripple: js.UndefOr[CSSProperties] = js.undefined
  var ripplePulsate: js.UndefOr[CSSProperties] = js.undefined
  var rippleVisible: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesTouchRippleClassKey {
  @scala.inline
  def apply(
    child: CSSProperties = null,
    childLeaving: CSSProperties = null,
    childPulsate: CSSProperties = null,
    ripple: CSSProperties = null,
    ripplePulsate: CSSProperties = null,
    rippleVisible: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesTouchRippleClassKey = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child)
    if (childLeaving != null) __obj.updateDynamic("childLeaving")(childLeaving)
    if (childPulsate != null) __obj.updateDynamic("childPulsate")(childPulsate)
    if (ripple != null) __obj.updateDynamic("ripple")(ripple)
    if (ripplePulsate != null) __obj.updateDynamic("ripplePulsate")(ripplePulsate)
    if (rippleVisible != null) __obj.updateDynamic("rippleVisible")(rippleVisible)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesTouchRippleClassKey]
  }
}

