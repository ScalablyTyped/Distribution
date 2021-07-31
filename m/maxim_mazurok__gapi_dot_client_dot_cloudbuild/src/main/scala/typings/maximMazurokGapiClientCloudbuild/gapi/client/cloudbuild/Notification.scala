package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notification extends StObject {
  
  /** The filter string to use for notification filtering. Currently, this is assumed to be a CEL program. See https://opensource.google/projects/cel for more. */
  var filter: js.UndefOr[String] = js.undefined
  
  /** Configuration for HTTP delivery. */
  var httpDelivery: js.UndefOr[HTTPDelivery] = js.undefined
  
  /** Configuration for Slack delivery. */
  var slackDelivery: js.UndefOr[SlackDelivery] = js.undefined
  
  /** Configuration for SMTP (email) delivery. */
  var smtpDelivery: js.UndefOr[SMTPDelivery] = js.undefined
  
  /** Escape hatch for users to supply custom delivery configs. */
  var structDelivery: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.Notification & TopLevel[js.Any]
  ] = js.undefined
}
object Notification {
  
  @scala.inline
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit class NotificationMutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setHttpDelivery(value: HTTPDelivery): Self = StObject.set(x, "httpDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpDeliveryUndefined: Self = StObject.set(x, "httpDelivery", js.undefined)
    
    @scala.inline
    def setSlackDelivery(value: SlackDelivery): Self = StObject.set(x, "slackDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlackDeliveryUndefined: Self = StObject.set(x, "slackDelivery", js.undefined)
    
    @scala.inline
    def setSmtpDelivery(value: SMTPDelivery): Self = StObject.set(x, "smtpDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmtpDeliveryUndefined: Self = StObject.set(x, "smtpDelivery", js.undefined)
    
    @scala.inline
    def setStructDelivery(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientCloudbuild.maximMazurokGapiClientCloudbuildStrings.Notification & TopLevel[js.Any]
    ): Self = StObject.set(x, "structDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructDeliveryUndefined: Self = StObject.set(x, "structDelivery", js.undefined)
  }
}
