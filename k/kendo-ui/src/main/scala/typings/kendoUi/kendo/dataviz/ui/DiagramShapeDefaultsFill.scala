package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramShapeDefaultsFill extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var gradient: js.UndefOr[DiagramShapeDefaultsFillGradient] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
}
object DiagramShapeDefaultsFill {
  
  @scala.inline
  def apply(): DiagramShapeDefaultsFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsFill]
  }
  
  @scala.inline
  implicit class DiagramShapeDefaultsFillMutableBuilder[Self <: DiagramShapeDefaultsFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setGradient(value: DiagramShapeDefaultsFillGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
