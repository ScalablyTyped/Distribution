package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectangleFill extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var gradient: js.UndefOr[RectangleFillGradient] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
}
object RectangleFill {
  
  @scala.inline
  def apply(): RectangleFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectangleFill]
  }
  
  @scala.inline
  implicit class RectangleFillMutableBuilder[Self <: RectangleFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setGradient(value: RectangleFillGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
