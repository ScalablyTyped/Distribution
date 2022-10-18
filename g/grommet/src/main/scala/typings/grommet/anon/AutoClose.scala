package typings.grommet.anon

import typings.grommet.componentsLayerMod.LayerPositionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoClose extends StObject {
  
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[LayerPositionType] = js.undefined
}
object AutoClose {
  
  inline def apply(): AutoClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoClose]
  }
  
  extension [Self <: AutoClose](x: Self) {
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setPosition(value: LayerPositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
