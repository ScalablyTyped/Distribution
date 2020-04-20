package typings.jqueryColorpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var colorpicker: JQueryColorpickerStatic
}

object JQueryStatic {
  @scala.inline
  def apply(colorpicker: JQueryColorpickerStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(colorpicker = colorpicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
}

