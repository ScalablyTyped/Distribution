package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.Group")
@js.native
class Group () extends Element {
  def this(options: GroupOptions) = this()
  var children: js.Any = js.native
  @JSName("options")
  var options_Group: GroupOptions = js.native
  def append(element: Element): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def insert(position: scala.Double, element: Element): scala.Unit = js.native
  def remove(element: Element): scala.Unit = js.native
  def removeAt(index: scala.Double): scala.Unit = js.native
}

