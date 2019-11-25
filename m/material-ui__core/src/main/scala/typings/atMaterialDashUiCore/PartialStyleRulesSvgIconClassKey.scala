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
    if (colorAction != null) __obj.updateDynamic("colorAction")(colorAction.asInstanceOf[js.Any])
    if (colorDisabled != null) __obj.updateDynamic("colorDisabled")(colorDisabled.asInstanceOf[js.Any])
    if (colorError != null) __obj.updateDynamic("colorError")(colorError.asInstanceOf[js.Any])
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary.asInstanceOf[js.Any])
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary.asInstanceOf[js.Any])
    if (fontSizeInherit != null) __obj.updateDynamic("fontSizeInherit")(fontSizeInherit.asInstanceOf[js.Any])
    if (fontSizeLarge != null) __obj.updateDynamic("fontSizeLarge")(fontSizeLarge.asInstanceOf[js.Any])
    if (fontSizeSmall != null) __obj.updateDynamic("fontSizeSmall")(fontSizeSmall.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesSvgIconClassKey]
  }
}

