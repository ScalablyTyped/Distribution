package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIconColor extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var deleteIconColor: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var fontWeight: js.UndefOr[Double] = js.undefined
  
  var shadow: js.UndefOr[String] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
}
object DeleteIconColor {
  
  @scala.inline
  def apply(): DeleteIconColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIconColor]
  }
  
  @scala.inline
  implicit class DeleteIconColorMutableBuilder[Self <: DeleteIconColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setDeleteIconColor(value: String): Self = StObject.set(x, "deleteIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteIconColorUndefined: Self = StObject.set(x, "deleteIconColor", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setShadow(value: String): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
