package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Layout")
@js.native
class Layout protected ()
  extends kendoDashUiLib.kendoNs.drawingNs.Group {
  def this(rect: kendoDashUiLib.kendoNs.geometryNs.Rect) = this()
  def this(rect: kendoDashUiLib.kendoNs.geometryNs.Rect, options: LayoutOptions) = this()
  @JSName("options")
  var options_Layout: LayoutOptions = js.native
  def rect(): kendoDashUiLib.kendoNs.geometryNs.Rect = js.native
  def rect(rect: kendoDashUiLib.kendoNs.geometryNs.Rect): scala.Unit = js.native
  def reflow(): scala.Unit = js.native
}

