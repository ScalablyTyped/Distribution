package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.FloatingActionButton, 'open' | 'close' | 'destroy'> */
trait PickFloatingActionButtono extends StObject {
  
  var close: js.UndefOr[js.Any] = js.undefined
  
  var destroy: js.UndefOr[js.Any] = js.undefined
  
  var open: js.UndefOr[js.Any] = js.undefined
}
object PickFloatingActionButtono {
  
  inline def apply(): PickFloatingActionButtono = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickFloatingActionButtono]
  }
  
  extension [Self <: PickFloatingActionButtono](x: Self) {
    
    inline def setClose(value: js.Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDestroy(value: js.Any): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setOpen(value: js.Any): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
