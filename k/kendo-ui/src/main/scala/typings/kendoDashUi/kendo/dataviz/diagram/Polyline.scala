package typings.kendoDashUi.kendo.dataviz.diagram

import typings.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Polyline")
@js.native
class Polyline () extends Observable {
  def this(options: PolylineOptions) = this()
  var drawingElement: typings.kendoDashUi.kendo.drawing.Path = js.native
  var options: PolylineOptions = js.native
  def points(): js.Any = js.native
  def points(points: js.Any): Unit = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

