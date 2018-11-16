package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Text")
@js.native
class Text protected ()
  extends kendoDashUiLib.kendoNs.drawingNs.Element {
  def this(content: java.lang.String, position: kendoDashUiLib.kendoNs.geometryNs.Point) = this()
  def this(content: java.lang.String, position: kendoDashUiLib.kendoNs.geometryNs.Point, options: TextOptions) = this()
  @JSName("options")
  var options_Text: TextOptions = js.native
  def content(): java.lang.String = js.native
  def content(value: java.lang.String): scala.Unit = js.native
  def fill(color: java.lang.String): kendoDashUiLib.kendoNs.drawingNs.Text = js.native
  def fill(color: java.lang.String, opacity: scala.Double): kendoDashUiLib.kendoNs.drawingNs.Text = js.native
  def position(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def position(value: kendoDashUiLib.kendoNs.geometryNs.Point): scala.Unit = js.native
  def stroke(color: java.lang.String): kendoDashUiLib.kendoNs.drawingNs.Text = js.native
  def stroke(color: java.lang.String, width: scala.Double): kendoDashUiLib.kendoNs.drawingNs.Text = js.native
  def stroke(color: java.lang.String, width: scala.Double, opacity: scala.Double): kendoDashUiLib.kendoNs.drawingNs.Text = js.native
}

