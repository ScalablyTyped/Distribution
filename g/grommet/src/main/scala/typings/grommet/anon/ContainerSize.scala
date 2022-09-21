package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerSize extends StObject {
  
  var container: js.UndefOr[BackgroundExtendPad] = js.undefined
  
  var size: js.UndefOr[`36`] = js.undefined
  
  var text: js.UndefOr[`37`] = js.undefined
}
object ContainerSize {
  
  inline def apply(): ContainerSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerSize]
  }
  
  extension [Self <: ContainerSize](x: Self) {
    
    inline def setContainer(value: BackgroundExtendPad): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setSize(value: `36`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setText(value: `37`): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
