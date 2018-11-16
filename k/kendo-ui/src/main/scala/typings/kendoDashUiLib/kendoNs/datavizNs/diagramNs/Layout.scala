package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Layout")
@js.native
class Layout protected ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(rect: Rect) = this()
  def this(rect: Rect, options: LayoutOptions) = this()
  var drawingElement: kendoDashUiLib.kendoNs.drawingNs.Layout = js.native
  var options: LayoutOptions = js.native
  def append(element: js.Any): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def rect(): Rect = js.native
  def rect(rect: Rect): scala.Unit = js.native
  def reflow(): scala.Unit = js.native
  def remove(element: js.Any): scala.Unit = js.native
  def visible(): scala.Boolean = js.native
  def visible(visible: scala.Boolean): scala.Unit = js.native
}

