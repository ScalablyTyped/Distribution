package typings.kendoUi.kendo.dataviz.diagram

import typings.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Path")
@js.native
class Path () extends Observable_ {
  def this(options: PathOptions) = this()
  var drawingElement: typings.kendoUi.kendo.drawing.Path = js.native
  var options: PathOptions = js.native
  def data(): String = js.native
  def data(path: String): Unit = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

