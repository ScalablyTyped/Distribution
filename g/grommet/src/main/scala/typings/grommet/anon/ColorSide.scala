package typings.grommet.anon

import typings.grommet.componentsListMod.SideType
import typings.grommet.componentsListMod.SizeType
import typings.grommet.componentsListMod._BorderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSide
  extends StObject
     with _BorderType {
  
  var color: js.UndefOr[String | Dark] = js.undefined
  
  var side: js.UndefOr[SideType] = js.undefined
  
  var size: js.UndefOr[SizeType] = js.undefined
}
object ColorSide {
  
  inline def apply(): ColorSide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSide]
  }
  
  extension [Self <: ColorSide](x: Self) {
    
    inline def setColor(value: String | Dark): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSide(value: SideType): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
