package typings.kendoUi.kendo.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rect extends Element {
  @JSName("options")
  var options_Rect: RectOptions = js.native
  def fill(color: String): Rect = js.native
  def fill(color: String, opacity: Double): Rect = js.native
  def geometry(): typings.kendoUi.kendo.geometry.Rect = js.native
  def geometry(value: typings.kendoUi.kendo.geometry.Rect): Unit = js.native
  def stroke(color: String): Rect = js.native
  def stroke(color: String, width: Double): Rect = js.native
  def stroke(color: String, width: Double, opacity: Double): Rect = js.native
}

