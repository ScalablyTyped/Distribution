package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeFill extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var gradient: js.UndefOr[DiagramShapeFillGradient] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
}
object DiagramShapeFill {
  
  @scala.inline
  def apply(): DiagramShapeFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeFill]
  }
  
  @scala.inline
  implicit class DiagramShapeFillMutableBuilder[Self <: DiagramShapeFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setGradient(value: DiagramShapeFillGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
