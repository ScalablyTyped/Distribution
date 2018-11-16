package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Group")
@js.native
class Group ()
  extends kendoDashUiLib.kendoNs.drawingNs.Element {
  def this(options: GroupOptions) = this()
  var children: js.Any = js.native
  @JSName("options")
  var options_Group: GroupOptions = js.native
  def append(element: kendoDashUiLib.kendoNs.drawingNs.Element): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def insert(position: scala.Double, element: kendoDashUiLib.kendoNs.drawingNs.Element): scala.Unit = js.native
  def remove(element: kendoDashUiLib.kendoNs.drawingNs.Element): scala.Unit = js.native
  def removeAt(index: scala.Double): scala.Unit = js.native
}

