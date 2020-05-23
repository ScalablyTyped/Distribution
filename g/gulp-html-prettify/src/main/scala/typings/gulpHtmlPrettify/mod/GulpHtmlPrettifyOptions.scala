package typings.gulpHtmlPrettify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GulpHtmlPrettifyOptions extends js.Object {
  var indent_char: js.UndefOr[String] = js.undefined
  var indent_size: js.UndefOr[Double] = js.undefined
}

object GulpHtmlPrettifyOptions {
  @scala.inline
  def apply(indent_char: String = null, indent_size: js.UndefOr[Double] = js.undefined): GulpHtmlPrettifyOptions = {
    val __obj = js.Dynamic.literal()
    if (indent_char != null) __obj.updateDynamic("indent_char")(indent_char.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_size)) __obj.updateDynamic("indent_size")(indent_size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GulpHtmlPrettifyOptions]
  }
}

