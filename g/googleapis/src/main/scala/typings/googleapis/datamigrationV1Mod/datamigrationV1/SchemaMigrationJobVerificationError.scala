package typings.googleapis.datamigrationV1Mod.datamigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMigrationJobVerificationError extends StObject {
  
  /**
    * Output only. An instance of ErrorCode specifying the error that occurred.
    */
  var errorCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A specific detailed error message, if supplied by the engine.
    */
  var errorDetailMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A formatted message with further details about the error and a CTA.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
}
object SchemaMigrationJobVerificationError {
  
  inline def apply(): SchemaMigrationJobVerificationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMigrationJobVerificationError]
  }
  
  extension [Self <: SchemaMigrationJobVerificationError](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorDetailMessage(value: String): Self = StObject.set(x, "errorDetailMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailMessageNull: Self = StObject.set(x, "errorDetailMessage", null)
    
    inline def setErrorDetailMessageUndefined: Self = StObject.set(x, "errorDetailMessage", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
