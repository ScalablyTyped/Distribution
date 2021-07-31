package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Check extends StObject {
  
  var border: js.UndefOr[ColorWidth] = js.undefined
  
  var check: js.UndefOr[BackgroundRadius] = js.undefined
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var font: js.UndefOr[`10`] = js.undefined
  
  var gap: js.UndefOr[String] = js.undefined
  
  var hover: js.UndefOr[`19`] = js.undefined
  
  var icon: js.UndefOr[ExtendSize] = js.undefined
  
  var icons: js.UndefOr[Circle] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object Check {
  
  @scala.inline
  def apply(): Check = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Check]
  }
  
  @scala.inline
  implicit class CheckMutableBuilder[Self <: Check] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ColorWidth): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setCheck(value: BackgroundRadius): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFont(value: `10`): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setGap(value: String): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    @scala.inline
    def setHover(value: `19`): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setIcon(value: ExtendSize): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIcons(value: Circle): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
