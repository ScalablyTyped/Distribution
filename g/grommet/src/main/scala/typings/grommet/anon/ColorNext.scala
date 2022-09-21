package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorNext extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var next: js.UndefOr[ReactNode | typings.grommetIcons.iconsMod.Icon] = js.undefined
  
  var previous: js.UndefOr[ReactNode | typings.grommetIcons.iconsMod.Icon] = js.undefined
}
object ColorNext {
  
  inline def apply(): ColorNext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorNext]
  }
  
  extension [Self <: ColorNext](x: Self) {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setNext(value: ReactNode | typings.grommetIcons.iconsMod.Icon): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setPrevious(value: ReactNode | typings.grommetIcons.iconsMod.Icon): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
  }
}
