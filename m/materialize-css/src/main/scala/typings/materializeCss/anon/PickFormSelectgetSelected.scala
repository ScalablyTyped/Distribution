package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.FormSelect, 'getSelectedValues' | 'destroy'> */
trait PickFormSelectgetSelected extends StObject {
  
  var destroy: js.UndefOr[js.Any] = js.undefined
  
  var getSelectedValues: js.UndefOr[js.Any] = js.undefined
}
object PickFormSelectgetSelected {
  
  inline def apply(): PickFormSelectgetSelected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickFormSelectgetSelected]
  }
  
  extension [Self <: PickFormSelectgetSelected](x: Self) {
    
    inline def setDestroy(value: js.Any): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setGetSelectedValues(value: js.Any): Self = StObject.set(x, "getSelectedValues", value.asInstanceOf[js.Any])
    
    inline def setGetSelectedValuesUndefined: Self = StObject.set(x, "getSelectedValues", js.undefined)
  }
}
