package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAjaxFileResult[T] extends StObject {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var error: js.UndefOr[Any] = js.undefined
  
  var status: js.UndefOr[IResponseStatus] = js.undefined
}
object IAjaxFileResult {
  
  inline def apply[T](): IAjaxFileResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAjaxFileResult[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAjaxFileResult[?], T] (val x: Self & IAjaxFileResult[T]) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setStatus(value: IResponseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
