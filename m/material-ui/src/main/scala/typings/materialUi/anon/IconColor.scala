package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconColor extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hoverColor: js.UndefOr[String] = js.undefined
  
  var iconColor: js.UndefOr[String] = js.undefined
  
  var menuHoverColor: js.UndefOr[String] = js.undefined
  
  var separatorColor: js.UndefOr[String] = js.undefined
  
  var titleFontSize: js.UndefOr[Double] = js.undefined
}
object IconColor {
  
  @scala.inline
  def apply(): IconColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconColor]
  }
  
  @scala.inline
  implicit class IconColorMutableBuilder[Self <: IconColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    @scala.inline
    def setMenuHoverColor(value: String): Self = StObject.set(x, "menuHoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuHoverColorUndefined: Self = StObject.set(x, "menuHoverColor", js.undefined)
    
    @scala.inline
    def setSeparatorColor(value: String): Self = StObject.set(x, "separatorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorColorUndefined: Self = StObject.set(x, "separatorColor", js.undefined)
    
    @scala.inline
    def setTitleFontSize(value: Double): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
  }
}
