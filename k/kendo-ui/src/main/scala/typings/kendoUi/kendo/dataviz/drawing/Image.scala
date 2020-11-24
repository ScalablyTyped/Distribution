package typings.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image
  extends typings.kendoUi.kendo.drawing.Element {
  
  @JSName("options")
  var options_Image: ImageOptions = js.native
  
  def rect(): typings.kendoUi.kendo.geometry.Rect = js.native
  def rect(value: typings.kendoUi.kendo.geometry.Rect): Unit = js.native
  
  def src(): String = js.native
  def src(value: String): Unit = js.native
}
