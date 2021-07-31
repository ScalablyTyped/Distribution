package typings.kendoUi.kendo.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arc
  extends StObject
     with Element {
  
  def fill(color: String): Arc = js.native
  def fill(color: String, opacity: Double): Arc = js.native
  
  def geometry(): typings.kendoUi.kendo.geometry.Arc = js.native
  def geometry(value: typings.kendoUi.kendo.geometry.Arc): Unit = js.native
  
  @JSName("options")
  var options_Arc: ArcOptions = js.native
  
  def stroke(color: String): Arc = js.native
  def stroke(color: String, width: Double): Arc = js.native
  def stroke(color: String, width: Double, opacity: Double): Arc = js.native
  def stroke(color: String, width: Unit, opacity: Double): Arc = js.native
}
