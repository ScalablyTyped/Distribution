package typings.kendoDashUi.kendo.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.Image")
@js.native
class Image protected () extends Element {
  def this(src: String, rect: typings.kendoDashUi.kendo.geometry.Rect) = this()
  @JSName("options")
  var options_Image: ImageOptions = js.native
  def rect(): typings.kendoDashUi.kendo.geometry.Rect = js.native
  def rect(value: typings.kendoDashUi.kendo.geometry.Rect): Unit = js.native
  def src(): String = js.native
  def src(value: String): Unit = js.native
}

