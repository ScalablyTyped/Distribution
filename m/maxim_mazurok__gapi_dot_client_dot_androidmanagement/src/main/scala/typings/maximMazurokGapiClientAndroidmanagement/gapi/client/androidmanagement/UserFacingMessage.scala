package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserFacingMessage extends js.Object {
  
  /**
    * The default message displayed if no localized message is specified or the user's locale doesn't match with any of the localized messages. A default message must be provided if any
    * localized messages are provided.
    */
  var defaultMessage: js.UndefOr[String] = js.native
  
  /** A map containing pairs, where locale is a well-formed BCP 47 language (https://www.w3.org/International/articles/language-tags/) code, such as en-US, es-ES, or fr. */
  var localizedMessages: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.UserFacingMessage with TopLevel[js.Any]
  ] = js.native
}
object UserFacingMessage {
  
  @scala.inline
  def apply(): UserFacingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserFacingMessage]
  }
  
  @scala.inline
  implicit class UserFacingMessageOps[Self <: UserFacingMessage] (val x: Self) extends AnyVal {
    
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
    def setDefaultMessage(value: String): Self = this.set("defaultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMessage: Self = this.set("defaultMessage", js.undefined)
    
    @scala.inline
    def setLocalizedMessages(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.UserFacingMessage with TopLevel[js.Any]
    ): Self = this.set("localizedMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalizedMessages: Self = this.set("localizedMessages", js.undefined)
  }
}
