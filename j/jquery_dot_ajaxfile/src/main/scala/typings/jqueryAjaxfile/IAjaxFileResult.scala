package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAjaxFileResult[T] extends StObject {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  var status: js.UndefOr[IResponseStatus] = js.native
}
object IAjaxFileResult {
  
  @scala.inline
  def apply[T](): IAjaxFileResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAjaxFileResult[T]]
  }
  
  @scala.inline
  implicit class IAjaxFileResultMutableBuilder[Self <: IAjaxFileResult[_], T] (val x: Self with IAjaxFileResult[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setStatus(value: IResponseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
