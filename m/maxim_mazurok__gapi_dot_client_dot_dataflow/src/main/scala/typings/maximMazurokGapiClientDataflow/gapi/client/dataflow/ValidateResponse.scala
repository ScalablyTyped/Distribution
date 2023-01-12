package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateResponse extends StObject {
  
  /** Will be empty if validation succeeds. */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /** Information about the validated query. Not defined if validation fails. */
  var queryInfo: js.UndefOr[QueryInfo] = js.undefined
}
object ValidateResponse {
  
  inline def apply(): ValidateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateResponse] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setQueryInfo(value: QueryInfo): Self = StObject.set(x, "queryInfo", value.asInstanceOf[js.Any])
    
    inline def setQueryInfoUndefined: Self = StObject.set(x, "queryInfo", js.undefined)
  }
}
