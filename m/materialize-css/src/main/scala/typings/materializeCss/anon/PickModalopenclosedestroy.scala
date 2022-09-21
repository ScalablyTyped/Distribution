package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Modal, 'open' | 'close' | 'destroy'> */
trait PickModalopenclosedestroy extends StObject {
  
  var close: js.UndefOr[Any] = js.undefined
  
  var destroy: js.UndefOr[Any] = js.undefined
  
  var open: js.UndefOr[Any] = js.undefined
}
object PickModalopenclosedestroy {
  
  inline def apply(): PickModalopenclosedestroy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickModalopenclosedestroy]
  }
  
  extension [Self <: PickModalopenclosedestroy](x: Self) {
    
    inline def setClose(value: Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDestroy(value: Any): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setOpen(value: Any): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
