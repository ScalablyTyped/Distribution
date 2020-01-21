package typings.jui.mod

import typings.jui.AnonColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIColorPicker extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: AnonColor): this.type = js.native
  def getColor(`type`: String): String | js.Object = js.native
  def setColor(value: String): Unit = js.native
  def setColor(value: js.Object): Unit = js.native
}

