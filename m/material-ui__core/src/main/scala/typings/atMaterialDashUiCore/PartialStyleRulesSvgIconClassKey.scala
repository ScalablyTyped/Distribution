package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/SvgIcon.SvgIconClassKey>> */
trait PartialStyleRulesSvgIconClassKey extends js.Object {
  var colorAction: js.UndefOr[CSSProperties] = js.undefined
  var colorDisabled: js.UndefOr[CSSProperties] = js.undefined
  var colorError: js.UndefOr[CSSProperties] = js.undefined
  var colorPrimary: js.UndefOr[CSSProperties] = js.undefined
  var colorSecondary: js.UndefOr[CSSProperties] = js.undefined
  var fontSizeInherit: js.UndefOr[CSSProperties] = js.undefined
  var fontSizeLarge: js.UndefOr[CSSProperties] = js.undefined
  var fontSizeSmall: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesSvgIconClassKey {
  @scala.inline
  def apply(
    colorAction: CSSProperties = null,
    colorDisabled: CSSProperties = null,
    colorError: CSSProperties = null,
    colorPrimary: CSSProperties = null,
    colorSecondary: CSSProperties = null,
    fontSizeInherit: CSSProperties = null,
    fontSizeLarge: CSSProperties = null,
    fontSizeSmall: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesSvgIconClassKey = {
    val __obj = js.Dynamic.literal()
    if (colorAction != null) __obj.updateDynamic("colorAction")(colorAction)
    if (colorDisabled != null) __obj.updateDynamic("colorDisabled")(colorDisabled)
    if (colorError != null) __obj.updateDynamic("colorError")(colorError)
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary)
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary)
    if (fontSizeInherit != null) __obj.updateDynamic("fontSizeInherit")(fontSizeInherit)
    if (fontSizeLarge != null) __obj.updateDynamic("fontSizeLarge")(fontSizeLarge)
    if (fontSizeSmall != null) __obj.updateDynamic("fontSizeSmall")(fontSizeSmall)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesSvgIconClassKey]
  }
}

