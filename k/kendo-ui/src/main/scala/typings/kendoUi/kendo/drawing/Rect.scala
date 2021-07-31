package typings.kendoUi.kendo.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rect
  extends StObject
     with Element {
  
  def fill(color: String): Rect = js.native
  def fill(color: String, opacity: Double): Rect = js.native
  
  def geometry(): typings.kendoUi.kendo.geometry.Rect = js.native
  def geometry(value: typings.kendoUi.kendo.geometry.Rect): Unit = js.native
  
  @JSName("options")
  var options_Rect: RectOptions = js.native
  
  def stroke(color: String): Rect = js.native
  def stroke(color: String, width: Double): Rect = js.native
  def stroke(color: String, width: Double, opacity: Double): Rect = js.native
  def stroke(color: String, width: Unit, opacity: Double): Rect = js.native
}
