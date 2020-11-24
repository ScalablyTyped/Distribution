package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationJobVerificationError extends js.Object {
  
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
  implicit class MigrationJobVerificationErrorOps[Self <: MigrationJobVerificationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorCode(value: String): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setErrorDetailMessage(value: String): Self = this.set("errorDetailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetailMessage: Self = this.set("errorDetailMessage", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
  }
}
