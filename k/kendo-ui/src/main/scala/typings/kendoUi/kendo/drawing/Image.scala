package typings.kendoUi.kendo.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image
  extends StObject
     with Element {
  
  @JSName("options")
  var options_Image: ImageOptions = js.native
  
  def rect(): typings.kendoUi.kendo.geometry.Rect = js.native
  def rect(value: typings.kendoUi.kendo.geometry.Rect): Unit = js.native
  
  def src(): String = js.native
  def src(value: String): Unit = js.native
}
