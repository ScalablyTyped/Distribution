package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Group")
@js.native
class Group ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(options: GroupOptions) = this()
  var drawingElement: kendoDashUiLib.kendoNs.drawingNs.Group = js.native
  var options: GroupOptions = js.native
  def append(element: js.Any): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def position(): scala.Unit = js.native
  def position(offset: Point): scala.Unit = js.native
  def remove(element: js.Any): scala.Unit = js.native
  def rotate(angle: scala.Double, center: Point): scala.Unit = js.native
  def visible(): scala.Boolean = js.native
  def visible(visible: scala.Boolean): scala.Unit = js.native
}

