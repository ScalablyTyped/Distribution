package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramShapeHover extends StObject {
  
  var fill: js.UndefOr[String | DiagramShapeHoverFill] = js.native
}
object DiagramShapeHover {
  
  @scala.inline
  def apply(): DiagramShapeHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeHover]
  }
  
  @scala.inline
  implicit class DiagramShapeHoverMutableBuilder[Self <: DiagramShapeHover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | DiagramShapeHoverFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
