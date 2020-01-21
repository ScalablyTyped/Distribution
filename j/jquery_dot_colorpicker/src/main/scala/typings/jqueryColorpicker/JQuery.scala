package typings.jqueryColorpicker

import typings.jqueryColorpicker.jqueryColorpickerStrings.close
import typings.jqueryColorpicker.jqueryColorpickerStrings.destroy
import typings.jqueryColorpicker.jqueryColorpickerStrings.open
import typings.jqueryColorpicker.jqueryColorpickerStrings.setColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def colorpicker(): JQuery = js.native
  def colorpicker(method: String): JQuery = js.native
  def colorpicker(method: String, params: js.Any*): JQuery = js.native
  def colorpicker(options: JQueryColorpickerOptions): JQuery = js.native
  @JSName("colorpicker")
  def colorpicker_close(method: close): JQuery = js.native
  @JSName("colorpicker")
  def colorpicker_destroy(method: destroy): JQuery = js.native
  @JSName("colorpicker")
  def colorpicker_open(method: open): JQuery = js.native
  @JSName("colorpicker")
  def colorpicker_setColor(method: setColor, color: js.Any): JQuery = js.native
}

