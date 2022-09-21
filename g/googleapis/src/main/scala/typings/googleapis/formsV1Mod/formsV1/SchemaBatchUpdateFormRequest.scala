package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchUpdateFormRequest extends StObject {
  
  /**
    * Whether to return an updated version of the model in the response.
    */
  var includeFormInResponse: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The update requests of this batch.
    */
  var requests: js.UndefOr[js.Array[SchemaRequest]] = js.undefined
  
  /**
    * Provides control over how write requests are executed.
    */
  var writeControl: js.UndefOr[SchemaWriteControl] = js.undefined
}
object SchemaBatchUpdateFormRequest {
  
  inline def apply(): SchemaBatchUpdateFormRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateFormRequest]
  }
  
  extension [Self <: SchemaBatchUpdateFormRequest](x: Self) {
    
    inline def setIncludeFormInResponse(value: Boolean): Self = StObject.set(x, "includeFormInResponse", value.asInstanceOf[js.Any])
    
    inline def setIncludeFormInResponseNull: Self = StObject.set(x, "includeFormInResponse", null)
    
    inline def setIncludeFormInResponseUndefined: Self = StObject.set(x, "includeFormInResponse", js.undefined)
    
    inline def setRequests(value: js.Array[SchemaRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaRequest*): Self = StObject.set(x, "requests", js.Array(value*))
    
    inline def setWriteControl(value: SchemaWriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
    
    inline def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
  }
}
