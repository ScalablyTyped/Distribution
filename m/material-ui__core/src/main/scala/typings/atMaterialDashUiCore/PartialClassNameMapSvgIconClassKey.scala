package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/SvgIcon/SvgIcon.SvgIconClassKey>> */
trait PartialClassNameMapSvgIconClassKey extends js.Object {
  var colorAction: js.UndefOr[String] = js.undefined
  var colorDisabled: js.UndefOr[String] = js.undefined
  var colorError: js.UndefOr[String] = js.undefined
  var colorPrimary: js.UndefOr[String] = js.undefined
  var colorSecondary: js.UndefOr[String] = js.undefined
  var fontSizeInherit: js.UndefOr[String] = js.undefined
  var fontSizeLarge: js.UndefOr[String] = js.undefined
  var fontSizeSmall: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapSvgIconClassKey {
  @scala.inline
  def apply(
    colorAction: String = null,
    colorDisabled: String = null,
    colorError: String = null,
    colorPrimary: String = null,
    colorSecondary: String = null,
    fontSizeInherit: String = null,
    fontSizeLarge: String = null,
    fontSizeSmall: String = null,
    root: String = null
  ): PartialClassNameMapSvgIconClassKey = {
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
    __obj.asInstanceOf[PartialClassNameMapSvgIconClassKey]
  }
}

