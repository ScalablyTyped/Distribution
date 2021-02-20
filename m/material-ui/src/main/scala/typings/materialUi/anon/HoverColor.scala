package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoverColor extends StObject {
  
  var borderColor: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hoverColor: js.UndefOr[String] = js.native
  
  var selectedColor: js.UndefOr[String] = js.native
  
  var stripeColor: js.UndefOr[String] = js.native
  
  var textColor: js.UndefOr[String] = js.native
}
object HoverColor {
  
  @scala.inline
  def apply(): HoverColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverColor]
  }
  
  @scala.inline
  implicit class HoverColorMutableBuilder[Self <: HoverColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
    
    @scala.inline
    def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
    
    @scala.inline
    def setStripeColor(value: String): Self = StObject.set(x, "stripeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripeColorUndefined: Self = StObject.set(x, "stripeColor", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
