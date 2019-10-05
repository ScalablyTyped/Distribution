package typings.kendoDashUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Arc")
@js.native
class Arc protected ()
  extends typings.kendoDashUi.kendo.drawing.Element {
  def this(geometry: typings.kendoDashUi.kendo.geometry.Arc) = this()
  def this(geometry: typings.kendoDashUi.kendo.geometry.Arc, options: ArcOptions) = this()
  @JSName("options")
  var options_Arc: ArcOptions = js.native
  def fill(color: String): typings.kendoDashUi.kendo.drawing.Arc = js.native
  def fill(color: String, opacity: Double): typings.kendoDashUi.kendo.drawing.Arc = js.native
  def geometry(): typings.kendoDashUi.kendo.geometry.Arc = js.native
  def geometry(value: typings.kendoDashUi.kendo.geometry.Arc): Unit = js.native
  def stroke(color: String): typings.kendoDashUi.kendo.drawing.Arc = js.native
  def stroke(color: String, width: Double): typings.kendoDashUi.kendo.drawing.Arc = js.native
  def stroke(color: String, width: Double, opacity: Double): typings.kendoDashUi.kendo.drawing.Arc = js.native
}

