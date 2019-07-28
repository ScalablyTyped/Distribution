package typings.kendoDashUi.kendoNs.datavizNs.diagramNs

import typings.kendoDashUi.kendoNs.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Circle")
@js.native
class Circle () extends Observable {
  def this(options: CircleOptions) = this()
  var drawingElement: typings.kendoDashUi.kendoNs.drawingNs.Circle = js.native
  var options: CircleOptions = js.native
  def position(): Unit = js.native
  def position(offset: Point): Unit = js.native
  def rotate(angle: Double, center: Point): Unit = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

