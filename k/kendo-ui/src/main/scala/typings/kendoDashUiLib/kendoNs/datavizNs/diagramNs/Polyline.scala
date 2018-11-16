package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Polyline")
@js.native
class Polyline ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(options: PolylineOptions) = this()
  var drawingElement: kendoDashUiLib.kendoNs.drawingNs.Path = js.native
  var options: PolylineOptions = js.native
  def points(): js.Any = js.native
  def points(points: js.Any): scala.Unit = js.native
  def visible(): scala.Boolean = js.native
  def visible(visible: scala.Boolean): scala.Unit = js.native
}

