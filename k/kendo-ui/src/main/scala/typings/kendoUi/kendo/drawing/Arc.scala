package typings.kendoUi.kendo.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arc extends Element {
  @JSName("options")
  var options_Arc: ArcOptions = js.native
  def fill(color: String): Arc = js.native
  def fill(color: String, opacity: Double): Arc = js.native
  def geometry(): typings.kendoUi.kendo.geometry.Arc = js.native
  def geometry(value: typings.kendoUi.kendo.geometry.Arc): Unit = js.native
  def stroke(color: String): Arc = js.native
  def stroke(color: String, width: Double): Arc = js.native
  def stroke(color: String, width: Double, opacity: Double): Arc = js.native
}

