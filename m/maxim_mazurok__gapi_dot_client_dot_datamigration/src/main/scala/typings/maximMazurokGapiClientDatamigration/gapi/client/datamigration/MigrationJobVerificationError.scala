package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationJobVerificationError extends StObject {
  
  /** Output only. An instance of ErrorCode specifying the error that occurred. */
  var errorCode: js.UndefOr[String] = js.native
  
  /** Output only. A specific detailed error message, if supplied by the engine. */
  var errorDetailMessage: js.UndefOr[String] = js.native
  
  /** Output only. A formatted message with further details about the error and a CTA. */
  var errorMessage: js.UndefOr[String] = js.native
}
object MigrationJobVerificationError {
  
  @scala.inline
  def apply(): MigrationJobVerificationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationJobVerificationError]
  }
  
  @scala.inline
  implicit class MigrationJobVerificationErrorMutableBuilder[Self <: MigrationJobVerificationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorDetailMessage(value: String): Self = StObject.set(x, "errorDetailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailMessageUndefined: Self = StObject.set(x, "errorDetailMessage", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
