package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountsLinkRequest extends StObject {
  
  /** Action to perform for this link. The `"request"` action is only available to select merchants. Acceptable values are: - "`approve`" - "`remove`" - "`request`" */
  var action: js.UndefOr[String] = js.undefined
  
  /** Additional information required for `eCommercePlatform` link type. */
  var eCommercePlatformLinkInfo: js.UndefOr[ECommercePlatformLinkInfo] = js.undefined
  
  /** Type of the link between the two accounts. Acceptable values are: - "`channelPartner`" - "`eCommercePlatform`" - "`paymentServiceProvider`" */
  var linkType: js.UndefOr[String] = js.undefined
  
  /** The ID of the linked account. */
  var linkedAccountId: js.UndefOr[String] = js.undefined
  
  /** Additional information required for `paymentServiceProvider` link type. */
  var paymentServiceProviderLinkInfo: js.UndefOr[PaymentServiceProviderLinkInfo] = js.undefined
  
  /** Acceptable values are: - "`shoppingAdsProductManagement`" - "`shoppingActionsProductManagement`" - "`shoppingActionsOrderManagement`" - "`paymentProcessing`" */
  var services: js.UndefOr[js.Array[String]] = js.undefined
}
object AccountsLinkRequest {
  
  inline def apply(): AccountsLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsLinkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountsLinkRequest] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setECommercePlatformLinkInfo(value: ECommercePlatformLinkInfo): Self = StObject.set(x, "eCommercePlatformLinkInfo", value.asInstanceOf[js.Any])
    
    inline def setECommercePlatformLinkInfoUndefined: Self = StObject.set(x, "eCommercePlatformLinkInfo", js.undefined)
    
    inline def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    inline def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
    
    inline def setLinkedAccountId(value: String): Self = StObject.set(x, "linkedAccountId", value.asInstanceOf[js.Any])
    
    inline def setLinkedAccountIdUndefined: Self = StObject.set(x, "linkedAccountId", js.undefined)
    
    inline def setPaymentServiceProviderLinkInfo(value: PaymentServiceProviderLinkInfo): Self = StObject.set(x, "paymentServiceProviderLinkInfo", value.asInstanceOf[js.Any])
    
    inline def setPaymentServiceProviderLinkInfoUndefined: Self = StObject.set(x, "paymentServiceProviderLinkInfo", js.undefined)
    
    inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
