package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountsLinkRequest extends StObject {
  
  /** Action to perform for this link. The `"request"` action is only available to select merchants. Acceptable values are: - "`approve`" - "`remove`" - "`request`" */
  var action: js.UndefOr[String] = js.undefined
  
  /** Type of the link between the two accounts. Acceptable values are: - "`channelPartner`" - "`eCommercePlatform`" */
  var linkType: js.UndefOr[String] = js.undefined
  
  /** The ID of the linked account. */
  var linkedAccountId: js.UndefOr[String] = js.undefined
  
  /** List of provided services. */
  var services: js.UndefOr[js.Array[String]] = js.undefined
}
object AccountsLinkRequest {
  
  @scala.inline
  def apply(): AccountsLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsLinkRequest]
  }
  
  @scala.inline
  implicit class AccountsLinkRequestMutableBuilder[Self <: AccountsLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
    
    @scala.inline
    def setLinkedAccountId(value: String): Self = StObject.set(x, "linkedAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedAccountIdUndefined: Self = StObject.set(x, "linkedAccountId", js.undefined)
    
    @scala.inline
    def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
