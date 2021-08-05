package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSideSize extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var side: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object ColorSideSize {
  
  inline def apply(): ColorSideSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSideSize]
  }
  
  extension [Self <: ColorSideSize](x: Self) {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
