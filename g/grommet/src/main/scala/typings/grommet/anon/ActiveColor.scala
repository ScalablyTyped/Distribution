package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveColor extends StObject {
  
  var active: js.UndefOr[`5`] = js.undefined
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var disabled: js.UndefOr[`5`] = js.undefined
  
  var hover: js.UndefOr[ColorExtend] = js.undefined
  
  var side: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object ActiveColor {
  
  inline def apply(): ActiveColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveColor]
  }
  
  extension [Self <: ActiveColor](x: Self) {
    
    inline def setActive(value: `5`): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: `5`): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHover(value: ColorExtend): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
