package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleFill extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var gradient: js.UndefOr[CircleFillGradient] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
}
object CircleFill {
  
  @scala.inline
  def apply(): CircleFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleFill]
  }
  
  @scala.inline
  implicit class CircleFillMutableBuilder[Self <: CircleFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setGradient(value: CircleFillGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
