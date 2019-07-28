package typings.kendoDashUi.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Layout")
@js.native
class Layout protected ()
  extends typings.kendoDashUi.kendoNs.drawingNs.Group {
  def this(rect: typings.kendoDashUi.kendoNs.geometryNs.Rect) = this()
  def this(rect: typings.kendoDashUi.kendoNs.geometryNs.Rect, options: LayoutOptions) = this()
  @JSName("options")
  var options_Layout: LayoutOptions = js.native
  def rect(): typings.kendoDashUi.kendoNs.geometryNs.Rect = js.native
  def rect(rect: typings.kendoDashUi.kendoNs.geometryNs.Rect): Unit = js.native
  def reflow(): Unit = js.native
}

