package typings.kendoDashUi.kendo.dataviz.diagram

import typings.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Image")
@js.native
class Image () extends Observable {
  def this(options: ImageOptions) = this()
  var drawingElement: typings.kendoDashUi.kendo.drawing.Image = js.native
  var options: ImageOptions = js.native
  def position(): Unit = js.native
  def position(offset: Point): Unit = js.native
  def rotate(angle: Double, center: Point): Unit = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

