package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSetOperationStatusRequest extends StObject {
  
  var errorCode: js.UndefOr[String | Null] = js.undefined
  
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  var operationId: js.UndefOr[String | Null] = js.undefined
  
  var timestampEvents: js.UndefOr[js.Array[SchemaTimestampEvent]] = js.undefined
  
  var validationToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaSetOperationStatusRequest {
  
  inline def apply(): SchemaSetOperationStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetOperationStatusRequest]
  }
  
  extension [Self <: SchemaSetOperationStatusRequest](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdNull: Self = StObject.set(x, "operationId", null)
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setTimestampEvents(value: js.Array[SchemaTimestampEvent]): Self = StObject.set(x, "timestampEvents", value.asInstanceOf[js.Any])
    
    inline def setTimestampEventsUndefined: Self = StObject.set(x, "timestampEvents", js.undefined)
    
    inline def setTimestampEventsVarargs(value: SchemaTimestampEvent*): Self = StObject.set(x, "timestampEvents", js.Array(value*))
    
    inline def setValidationToken(value: String): Self = StObject.set(x, "validationToken", value.asInstanceOf[js.Any])
    
    inline def setValidationTokenNull: Self = StObject.set(x, "validationToken", null)
    
    inline def setValidationTokenUndefined: Self = StObject.set(x, "validationToken", js.undefined)
  }
}
