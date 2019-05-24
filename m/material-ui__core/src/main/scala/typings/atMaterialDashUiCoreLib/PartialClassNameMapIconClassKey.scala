package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Icon/Icon.IconClassKey>> */
trait PartialClassNameMapIconClassKey extends js.Object {
  var colorAction: js.UndefOr[java.lang.String] = js.undefined
  var colorDisabled: js.UndefOr[java.lang.String] = js.undefined
  var colorError: js.UndefOr[java.lang.String] = js.undefined
  var colorPrimary: js.UndefOr[java.lang.String] = js.undefined
  var colorSecondary: js.UndefOr[java.lang.String] = js.undefined
  var fontSizeInherit: js.UndefOr[java.lang.String] = js.undefined
  var fontSizeLarge: js.UndefOr[java.lang.String] = js.undefined
  var fontSizeSmall: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapIconClassKey {
  @scala.inline
  def apply(
    colorAction: java.lang.String = null,
    colorDisabled: java.lang.String = null,
    colorError: java.lang.String = null,
    colorPrimary: java.lang.String = null,
    colorSecondary: java.lang.String = null,
    fontSizeInherit: java.lang.String = null,
    fontSizeLarge: java.lang.String = null,
    fontSizeSmall: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapIconClassKey = {
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
    __obj.asInstanceOf[PartialClassNameMapIconClassKey]
  }
}

