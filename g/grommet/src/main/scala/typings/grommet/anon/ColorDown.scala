package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.MarginType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorDown extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var down: js.UndefOr[ReactNode | typings.grommetIcons.iconsMod.Icon] = js.undefined
  
  var margin: js.UndefOr[MarginType] = js.undefined
  
  var up: js.UndefOr[ReactNode | typings.grommetIcons.iconsMod.Icon] = js.undefined
}
object ColorDown {
  
  inline def apply(): ColorDown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorDown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorDown] (val x: Self) extends AnyVal {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDown(value: ReactNode | typings.grommetIcons.iconsMod.Icon): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setUp(value: ReactNode | typings.grommetIcons.iconsMod.Icon): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
