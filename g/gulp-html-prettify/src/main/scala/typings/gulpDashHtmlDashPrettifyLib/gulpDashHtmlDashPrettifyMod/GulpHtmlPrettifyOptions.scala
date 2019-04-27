package typings
package gulpDashHtmlDashPrettifyLib.gulpDashHtmlDashPrettifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GulpHtmlPrettifyOptions extends js.Object {
  var indent_char: js.UndefOr[java.lang.String] = js.undefined
  var indent_size: js.UndefOr[scala.Double] = js.undefined
}

object GulpHtmlPrettifyOptions {
  @scala.inline
  def apply(indent_char: java.lang.String = null, indent_size: scala.Int | scala.Double = null): GulpHtmlPrettifyOptions = {
    val __obj = js.Dynamic.literal()
    if (indent_char != null) __obj.updateDynamic("indent_char")(indent_char)
    if (indent_size != null) __obj.updateDynamic("indent_size")(indent_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GulpHtmlPrettifyOptions]
  }
}

