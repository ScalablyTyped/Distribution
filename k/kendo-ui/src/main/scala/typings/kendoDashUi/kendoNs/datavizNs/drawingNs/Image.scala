package typings.kendoDashUi.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Image")
@js.native
class Image protected ()
  extends typings.kendoDashUi.kendoNs.drawingNs.Element {
  def this(src: String, rect: typings.kendoDashUi.kendoNs.geometryNs.Rect) = this()
  @JSName("options")
  var options_Image: ImageOptions = js.native
  def rect(): typings.kendoDashUi.kendoNs.geometryNs.Rect = js.native
  def rect(value: typings.kendoDashUi.kendoNs.geometryNs.Rect): Unit = js.native
  def src(): String = js.native
  def src(value: String): Unit = js.native
}

