package typings.atIonicCliDashFramework.libLoggerMod

import typings.atIonicCliDashFramework.libColorsMod.Colors
import typings.atIonicCliDashFramework.utilsFormatMod.WordWrapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTaggedFormatterOptions extends js.Object {
  var colors: js.UndefOr[Colors] = js.undefined
  var prefix: js.UndefOr[String | js.Function0[String]] = js.undefined
  var titleize: js.UndefOr[Boolean] = js.undefined
  var wrap: js.UndefOr[Boolean | WordWrapOptions] = js.undefined
}

object CreateTaggedFormatterOptions {
  @scala.inline
  def apply(
    colors: Colors = null,
    prefix: String | js.Function0[String] = null,
    titleize: js.UndefOr[Boolean] = js.undefined,
    wrap: Boolean | WordWrapOptions = null
  ): CreateTaggedFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(titleize)) __obj.updateDynamic("titleize")(titleize)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaggedFormatterOptions]
  }
}

