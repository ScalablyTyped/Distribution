package typings.identiconDotJs.identiconDotJsMod

import typings.identiconDotJs.identiconDotJsStrings.png
import typings.identiconDotJs.identiconDotJsStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdenticonOptions extends js.Object {
  var background: js.UndefOr[Color] = js.undefined
  var foreground: js.UndefOr[Color] = js.undefined
  var format: js.UndefOr[svg | png] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object IdenticonOptions {
  @scala.inline
  def apply(
    background: Color = null,
    foreground: Color = null,
    format: svg | png = null,
    margin: Int | Double = null,
    size: Int | Double = null
  ): IdenticonOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (foreground != null) __obj.updateDynamic("foreground")(foreground)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdenticonOptions]
  }
}

