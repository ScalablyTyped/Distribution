package typings
package atIonicCliDashFrameworkLib.libLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTaggedFormatterOptions extends js.Object {
  var colors: js.UndefOr[atIonicCliDashFrameworkLib.libColorsMod.Colors] = js.undefined
  var prefix: js.UndefOr[java.lang.String | js.Function0[java.lang.String]] = js.undefined
  var titleize: js.UndefOr[scala.Boolean] = js.undefined
  var wrap: js.UndefOr[scala.Boolean | atIonicCliDashFrameworkLib.utilsFormatMod.WordWrapOptions] = js.undefined
}

object CreateTaggedFormatterOptions {
  @scala.inline
  def apply(
    colors: atIonicCliDashFrameworkLib.libColorsMod.Colors = null,
    prefix: java.lang.String | js.Function0[java.lang.String] = null,
    titleize: js.UndefOr[scala.Boolean] = js.undefined,
    wrap: scala.Boolean | atIonicCliDashFrameworkLib.utilsFormatMod.WordWrapOptions = null
  ): CreateTaggedFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(titleize)) __obj.updateDynamic("titleize")(titleize)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaggedFormatterOptions]
  }
}

