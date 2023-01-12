package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorIcon extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var icon: js.UndefOr[ReactNode | typings.grommetIcons.iconsMod.Icon] = js.undefined
}
object ColorIcon {
  
  inline def apply(): ColorIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorIcon] (val x: Self) extends AnyVal {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIcon(value: ReactNode | typings.grommetIcons.iconsMod.Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
  }
}
