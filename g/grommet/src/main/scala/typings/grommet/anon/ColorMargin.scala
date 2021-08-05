package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.MarginType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorMargin extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var margin: js.UndefOr[MarginType] = js.undefined
}
object ColorMargin {
  
  inline def apply(): ColorMargin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorMargin]
  }
  
  extension [Self <: ColorMargin](x: Self) {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
  }
}
