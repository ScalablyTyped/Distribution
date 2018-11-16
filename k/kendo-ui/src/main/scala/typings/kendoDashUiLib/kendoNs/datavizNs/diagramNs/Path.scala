package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Path")
@js.native
class Path ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(options: PathOptions) = this()
  var drawingElement: kendoDashUiLib.kendoNs.drawingNs.Path = js.native
  var options: PathOptions = js.native
  def data(): java.lang.String = js.native
  def data(path: java.lang.String): scala.Unit = js.native
  def visible(): scala.Boolean = js.native
  def visible(visible: scala.Boolean): scala.Unit = js.native
}

