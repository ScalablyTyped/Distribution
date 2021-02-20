package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateResponse extends StObject {
  
  /** Will be empty if validation succeeds. */
  var errorMessage: js.UndefOr[String] = js.native
  
  /** Information about the validated query. Not defined if validation fails. */
  var queryInfo: js.UndefOr[QueryInfo] = js.native
}
object ValidateResponse {
  
  @scala.inline
  def apply(): ValidateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateResponse]
  }
  
  @scala.inline
  implicit class ValidateResponseMutableBuilder[Self <: ValidateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setQueryInfo(value: QueryInfo): Self = StObject.set(x, "queryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryInfoUndefined: Self = StObject.set(x, "queryInfo", js.undefined)
  }
}
