package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Line")
@js.native
class Line ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(options: LineOptions) = this()
  var drawingElement: kendoDashUiLib.kendoNs.drawingNs.Path = js.native
  var options: LineOptions = js.native
  def position(): scala.Unit = js.native
  def position(offset: Point): scala.Unit = js.native
  def rotate(angle: scala.Double, center: Point): scala.Unit = js.native
  def visible(): scala.Boolean = js.native
  def visible(visible: scala.Boolean): scala.Unit = js.native
}

