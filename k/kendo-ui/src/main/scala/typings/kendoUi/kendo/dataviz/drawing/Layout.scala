package typings.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layout
  extends StObject
     with typings.kendoUi.kendo.drawing.Group {
  
  @JSName("options")
  var options_Layout: LayoutOptions = js.native
  
  def rect(): typings.kendoUi.kendo.geometry.Rect = js.native
  def rect(rect: typings.kendoUi.kendo.geometry.Rect): Unit = js.native
  
  def reflow(): Unit = js.native
}
