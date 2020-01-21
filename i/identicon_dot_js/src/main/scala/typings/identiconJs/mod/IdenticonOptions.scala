package typings.identiconJs.mod

import typings.identiconJs.identiconJsStrings.png
import typings.identiconJs.identiconJsStrings.svg
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
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (foreground != null) __obj.updateDynamic("foreground")(foreground.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdenticonOptions]
  }
}

