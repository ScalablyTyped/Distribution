package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/SvgIcon/SvgIcon.SvgIconClassKey>> */
@js.native
trait PartialClassNameMapSvgIconClassKey extends js.Object {
  var colorAction: js.UndefOr[String] = js.native
  var colorDisabled: js.UndefOr[String] = js.native
  var colorError: js.UndefOr[String] = js.native
  var colorPrimary: js.UndefOr[String] = js.native
  var colorSecondary: js.UndefOr[String] = js.native
  var fontSizeInherit: js.UndefOr[String] = js.native
  var fontSizeLarge: js.UndefOr[String] = js.native
  var fontSizeSmall: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
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
    if (colorAction != null) __obj.updateDynamic("colorAction")(colorAction.asInstanceOf[js.Any])
    if (colorDisabled != null) __obj.updateDynamic("colorDisabled")(colorDisabled.asInstanceOf[js.Any])
    if (colorError != null) __obj.updateDynamic("colorError")(colorError.asInstanceOf[js.Any])
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary.asInstanceOf[js.Any])
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary.asInstanceOf[js.Any])
    if (fontSizeInherit != null) __obj.updateDynamic("fontSizeInherit")(fontSizeInherit.asInstanceOf[js.Any])
    if (fontSizeLarge != null) __obj.updateDynamic("fontSizeLarge")(fontSizeLarge.asInstanceOf[js.Any])
    if (fontSizeSmall != null) __obj.updateDynamic("fontSizeSmall")(fontSizeSmall.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapSvgIconClassKey]
  }
}

