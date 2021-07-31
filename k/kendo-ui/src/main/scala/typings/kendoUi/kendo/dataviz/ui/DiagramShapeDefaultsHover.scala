package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeDefaultsHover extends StObject {
  
  var fill: js.UndefOr[String | DiagramShapeDefaultsHoverFill] = js.undefined
}
object DiagramShapeDefaultsHover {
  
  @scala.inline
  def apply(): DiagramShapeDefaultsHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsHover]
  }
  
  @scala.inline
  implicit class DiagramShapeDefaultsHoverMutableBuilder[Self <: DiagramShapeDefaultsHover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | DiagramShapeDefaultsHoverFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
