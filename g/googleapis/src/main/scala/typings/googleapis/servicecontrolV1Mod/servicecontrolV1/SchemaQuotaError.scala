package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuotaError extends StObject {
  
  /**
    * Error code.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Free-form text that provides details on the cause of the error.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contains additional information about the quota error. If available, `status.code` will be non zero.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Subject to whom this error applies. See the specific enum for more details on this field. For example, "clientip:" or "project:".
    */
  var subject: js.UndefOr[String | Null] = js.undefined
}
object SchemaQuotaError {
  
  inline def apply(): SchemaQuotaError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuotaError]
  }
  
  extension [Self <: SchemaQuotaError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
