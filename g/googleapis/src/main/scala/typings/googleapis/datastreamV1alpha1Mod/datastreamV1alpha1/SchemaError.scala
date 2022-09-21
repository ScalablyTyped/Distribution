package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaError extends StObject {
  
  /**
    * Additional information about the error.
    */
  var details: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The time when the error occurred.
    */
  var errorTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A unique identifier for this specific error, allowing it to be traced throughout the system in logs and API responses.
    */
  var errorUuid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A message containing more information about the error that occurred.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A title that explains the reason for the error.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object SchemaError {
  
  inline def apply(): SchemaError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaError]
  }
  
  extension [Self <: SchemaError](x: Self) {
    
    inline def setDetails(value: StringDictionary[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setErrorTime(value: String): Self = StObject.set(x, "errorTime", value.asInstanceOf[js.Any])
    
    inline def setErrorTimeNull: Self = StObject.set(x, "errorTime", null)
    
    inline def setErrorTimeUndefined: Self = StObject.set(x, "errorTime", js.undefined)
    
    inline def setErrorUuid(value: String): Self = StObject.set(x, "errorUuid", value.asInstanceOf[js.Any])
    
    inline def setErrorUuidNull: Self = StObject.set(x, "errorUuid", null)
    
    inline def setErrorUuidUndefined: Self = StObject.set(x, "errorUuid", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
