package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckError extends StObject {
  
  /**
    * The error code.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Free-form text providing details on the error cause of the error.
    */
  var detail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contains public information about the check error. If available, `status.code` will be non zero and client can propagate it out as public error.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Subject to whom this error applies. See the specific code enum for more details on this field. For example: - "project:" - "folder:" - "organization:"
    */
  var subject: js.UndefOr[String | Null] = js.undefined
}
object SchemaCheckError {
  
  inline def apply(): SchemaCheckError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckError]
  }
  
  extension [Self <: SchemaCheckError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailNull: Self = StObject.set(x, "detail", null)
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
