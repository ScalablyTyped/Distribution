package typings.grommet.anon

import typings.grommet.componentsBoxMod.BoxProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerIcon extends StObject {
  
  var container: js.UndefOr[BoxProps | `7` | `33`] = js.undefined
  
  var icon: js.UndefOr[ReactNode | typings.grommetIcons.iconsMod.Icon] = js.undefined
  
  var size: js.UndefOr[Small] = js.undefined
}
object ContainerIcon {
  
  inline def apply(): ContainerIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerIcon]
  }
  
  extension [Self <: ContainerIcon](x: Self) {
    
    inline def setContainer(value: BoxProps | `7` | `33`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setIcon(value: ReactNode | typings.grommetIcons.iconsMod.Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setSize(value: Small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
