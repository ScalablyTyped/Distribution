package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.FormSelect, 'getSelectedValues' | 'destroy'> */
@js.native
trait PickFormSelectgetSelected extends StObject {
  
  var destroy: js.UndefOr[js.Any] = js.native
  
  var getSelectedValues: js.UndefOr[js.Any] = js.native
}
object PickFormSelectgetSelected {
  
  @scala.inline
  def apply(): PickFormSelectgetSelected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickFormSelectgetSelected]
  }
  
  @scala.inline
  implicit class PickFormSelectgetSelectedMutableBuilder[Self <: PickFormSelectgetSelected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: js.Any): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setGetSelectedValues(value: js.Any): Self = StObject.set(x, "getSelectedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSelectedValuesUndefined: Self = StObject.set(x, "getSelectedValues", js.undefined)
  }
}
