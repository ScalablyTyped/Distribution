package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailPreferences extends js.Object {
  
  /** If true, email notifications will be sent on transfer run failures. */
  var enableFailureEmail: js.UndefOr[Boolean] = js.native
}
object EmailPreferences {
  
  @scala.inline
  def apply(): EmailPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailPreferences]
  }
  
  @scala.inline
  implicit class EmailPreferencesOps[Self <: EmailPreferences] (val x: Self) extends AnyVal {
    
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
    def setEnableFailureEmail(value: Boolean): Self = this.set("enableFailureEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFailureEmail: Self = this.set("enableFailureEmail", js.undefined)
  }
}
