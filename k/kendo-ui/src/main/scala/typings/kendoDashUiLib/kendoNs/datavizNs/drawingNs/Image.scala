package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Image")
@js.native
class Image protected ()
  extends kendoDashUiLib.kendoNs.drawingNs.Element {
  def this(src: java.lang.String, rect: kendoDashUiLib.kendoNs.geometryNs.Rect) = this()
  @JSName("options")
  var options_Image: ImageOptions = js.native
  def rect(): kendoDashUiLib.kendoNs.geometryNs.Rect = js.native
  def rect(value: kendoDashUiLib.kendoNs.geometryNs.Rect): scala.Unit = js.native
  def src(): java.lang.String = js.native
  def src(value: java.lang.String): scala.Unit = js.native
}

