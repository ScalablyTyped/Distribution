package typings
package jqueryDotColorpickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var colorpicker: JQueryColorpickerStatic
}

object JQueryStatic {
  @scala.inline
  def apply(colorpicker: JQueryColorpickerStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colorpicker")(colorpicker)
    __obj.asInstanceOf[JQueryStatic]
  }
}

