package typings.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circle
  extends typings.kendoUi.kendo.drawing.Element {
  
  def fill(color: String): typings.kendoUi.kendo.drawing.Circle = js.native
  def fill(color: String, opacity: Double): typings.kendoUi.kendo.drawing.Circle = js.native
  
  def geometry(): typings.kendoUi.kendo.geometry.Circle = js.native
  def geometry(value: typings.kendoUi.kendo.geometry.Circle): Unit = js.native
  
  @JSName("options")
  var options_Circle: CircleOptions = js.native
  
  def stroke(color: String): typings.kendoUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: js.UndefOr[scala.Nothing], opacity: Double): typings.kendoUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: Double): typings.kendoUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: Double, opacity: Double): typings.kendoUi.kendo.drawing.Circle = js.native
}
