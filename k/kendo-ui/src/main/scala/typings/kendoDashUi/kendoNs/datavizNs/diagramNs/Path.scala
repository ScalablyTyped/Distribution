package typings.kendoDashUi.kendoNs.datavizNs.diagramNs

import typings.kendoDashUi.kendoNs.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Path")
@js.native
class Path () extends Observable {
  def this(options: PathOptions) = this()
  var drawingElement: typings.kendoDashUi.kendoNs.drawingNs.Path = js.native
  var options: PathOptions = js.native
  def data(): String = js.native
  def data(path: String): Unit = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

