package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification extends js.Object {
  
  /** The filter string to use for notification filtering. Currently, this is assumed to be a CEL program. See https://opensource.google/projects/cel for more. */
  var filter: js.UndefOr[String] = js.native
  
  /** Configuration for HTTP delivery. */
  var httpDelivery: js.UndefOr[HTTPDelivery] = js.native
  
  /** Configuration for Slack delivery. */
  var slackDelivery: js.UndefOr[SlackDelivery] = js.native
  
  /** Configuration for SMTP (email) delivery. */
  var smtpDelivery: js.UndefOr[SMTPDelivery] = js.native
  
  /** Escape hatch for users to supply custom delivery configs. */
  var structDelivery: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.Notification with TopLevel[js.Any]
  ] = js.native
}
object Notification {
  
  @scala.inline
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setHttpDelivery(value: HTTPDelivery): Self = this.set("httpDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpDelivery: Self = this.set("httpDelivery", js.undefined)
    
    @scala.inline
    def setSlackDelivery(value: SlackDelivery): Self = this.set("slackDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlackDelivery: Self = this.set("slackDelivery", js.undefined)
    
    @scala.inline
    def setSmtpDelivery(value: SMTPDelivery): Self = this.set("smtpDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmtpDelivery: Self = this.set("smtpDelivery", js.undefined)
    
    @scala.inline
    def setStructDelivery(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.Notification with TopLevel[js.Any]
    ): Self = this.set("structDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructDelivery: Self = this.set("structDelivery", js.undefined)
  }
}
