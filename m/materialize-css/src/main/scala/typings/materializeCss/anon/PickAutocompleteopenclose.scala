package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Autocomplete, 'open' | 'close' | 'destroy'> */
trait PickAutocompleteopenclose extends StObject {
  
  var close: js.UndefOr[js.Any] = js.undefined
  
  var destroy: js.UndefOr[js.Any] = js.undefined
  
  var open: js.UndefOr[js.Any] = js.undefined
}
object PickAutocompleteopenclose {
  
  @scala.inline
  def apply(): PickAutocompleteopenclose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickAutocompleteopenclose]
  }
  
  @scala.inline
  implicit class PickAutocompleteopencloseMutableBuilder[Self <: PickAutocompleteopenclose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: js.Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setDestroy(value: js.Any): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setOpen(value: js.Any): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
