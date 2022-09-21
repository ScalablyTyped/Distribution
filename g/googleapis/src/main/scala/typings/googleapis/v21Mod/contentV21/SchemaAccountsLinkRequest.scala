package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountsLinkRequest extends StObject {
  
  /**
    * Action to perform for this link. The `"request"` action is only available to select merchants. Acceptable values are: - "`approve`" - "`remove`" - "`request`"
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional information required for `eCommercePlatform` link type.
    */
  var eCommercePlatformLinkInfo: js.UndefOr[SchemaECommercePlatformLinkInfo] = js.undefined
  
  /**
    * Type of the link between the two accounts. Acceptable values are: - "`channelPartner`" - "`eCommercePlatform`" - "`paymentServiceProvider`"
    */
  var linkType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the linked account.
    */
  var linkedAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional information required for `paymentServiceProvider` link type.
    */
  var paymentServiceProviderLinkInfo: js.UndefOr[SchemaPaymentServiceProviderLinkInfo] = js.undefined
  
  /**
    *  Acceptable values are: - "`shoppingAdsProductManagement`" - "`shoppingActionsProductManagement`" - "`shoppingActionsOrderManagement`" - "`paymentProcessing`"
    */
  var services: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAccountsLinkRequest {
  
  inline def apply(): SchemaAccountsLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsLinkRequest]
  }
  
  extension [Self <: SchemaAccountsLinkRequest](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setECommercePlatformLinkInfo(value: SchemaECommercePlatformLinkInfo): Self = StObject.set(x, "eCommercePlatformLinkInfo", value.asInstanceOf[js.Any])
    
    inline def setECommercePlatformLinkInfoUndefined: Self = StObject.set(x, "eCommercePlatformLinkInfo", js.undefined)
    
    inline def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    inline def setLinkTypeNull: Self = StObject.set(x, "linkType", null)
    
    inline def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
    
    inline def setLinkedAccountId(value: String): Self = StObject.set(x, "linkedAccountId", value.asInstanceOf[js.Any])
    
    inline def setLinkedAccountIdNull: Self = StObject.set(x, "linkedAccountId", null)
    
    inline def setLinkedAccountIdUndefined: Self = StObject.set(x, "linkedAccountId", js.undefined)
    
    inline def setPaymentServiceProviderLinkInfo(value: SchemaPaymentServiceProviderLinkInfo): Self = StObject.set(x, "paymentServiceProviderLinkInfo", value.asInstanceOf[js.Any])
    
    inline def setPaymentServiceProviderLinkInfoUndefined: Self = StObject.set(x, "paymentServiceProviderLinkInfo", js.undefined)
    
    inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesNull: Self = StObject.set(x, "services", null)
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
