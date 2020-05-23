package typings.kendoUi.kendo.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends Group {
  @JSName("options")
  var options_Layout: LayoutOptions = js.native
  def rect(): typings.kendoUi.kendo.geometry.Rect = js.native
  def rect(rect: typings.kendoUi.kendo.geometry.Rect): Unit = js.native
  def reflow(): Unit = js.native
}

