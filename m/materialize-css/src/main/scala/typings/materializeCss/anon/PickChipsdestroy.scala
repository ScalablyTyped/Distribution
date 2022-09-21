package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Chips, 'destroy'> */
trait PickChipsdestroy extends StObject {
  
  var destroy: js.UndefOr[Any] = js.undefined
}
object PickChipsdestroy {
  
  inline def apply(): PickChipsdestroy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickChipsdestroy]
  }
  
  extension [Self <: PickChipsdestroy](x: Self) {
    
    inline def setDestroy(value: Any): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
  }
}
