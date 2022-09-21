package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionPurchaseV2 extends StObject {
  
  /** The acknowledgement state of the subscription. */
  var acknowledgementState: js.UndefOr[String] = js.undefined
  
  /** Additional context around canceled subscriptions. Only present if the subscription currently has subscription_state SUBSCRIPTION_STATE_CANCELED. */
  var canceledStateContext: js.UndefOr[CanceledStateContext] = js.undefined
  
  /** User account identifier in the third-party service. */
  var externalAccountIdentifiers: js.UndefOr[ExternalAccountIdentifiers] = js.undefined
  
  /** This kind represents a SubscriptionPurchaseV2 object in the androidpublisher service. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The order id of the latest order associated with the purchase of the subscription. For autoRenewing subscription, this is the order id of signup order if it is not renewed yet, or
    * the last recurring order id (success, pending, or declined order). For prepaid subscription, this is the order id associated with the queried purchase token.
    */
  var latestOrderId: js.UndefOr[String] = js.undefined
  
  /** Item-level info for a subscription purchase. The items in the same purchase should be either all with AutoRenewingPlan or all with PrepaidPlan. */
  var lineItems: js.UndefOr[js.Array[SubscriptionPurchaseLineItem]] = js.undefined
  
  /**
    * The purchase token of the old subscription if this subscription is one of the following: * Re-signup of a canceled but non-lapsed subscription * Upgrade/downgrade from a previous
    * subscription. * Convert from prepaid to auto renewing subscription. * Convert from an auto renewing subscription to prepaid. * Topup a prepaid subscription.
    */
  var linkedPurchaseToken: js.UndefOr[String] = js.undefined
  
  /** Additional context around paused subscriptions. Only present if the subscription currently has subscription_state SUBSCRIPTION_STATE_PAUSED. */
  var pausedStateContext: js.UndefOr[PausedStateContext] = js.undefined
  
  /** ISO 3166-1 alpha-2 billing country/region code of the user at the time the subscription was granted. */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /** Time at which the subscription was granted. Not set for pending subscriptions (subscription was created but awaiting payment during signup). */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** User profile associated with purchases made with 'Subscribe with Google'. */
  var subscribeWithGoogleInfo: js.UndefOr[SubscribeWithGoogleInfo] = js.undefined
  
  /** The current state of the subscription. */
  var subscriptionState: js.UndefOr[String] = js.undefined
  
  /** Only present if this subscription purchase is a test purchase. */
  var testPurchase: js.UndefOr[Any] = js.undefined
}
object SubscriptionPurchaseV2 {
  
  inline def apply(): SubscriptionPurchaseV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionPurchaseV2]
  }
  
  extension [Self <: SubscriptionPurchaseV2](x: Self) {
    
    inline def setAcknowledgementState(value: String): Self = StObject.set(x, "acknowledgementState", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgementStateUndefined: Self = StObject.set(x, "acknowledgementState", js.undefined)
    
    inline def setCanceledStateContext(value: CanceledStateContext): Self = StObject.set(x, "canceledStateContext", value.asInstanceOf[js.Any])
    
    inline def setCanceledStateContextUndefined: Self = StObject.set(x, "canceledStateContext", js.undefined)
    
    inline def setExternalAccountIdentifiers(value: ExternalAccountIdentifiers): Self = StObject.set(x, "externalAccountIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setExternalAccountIdentifiersUndefined: Self = StObject.set(x, "externalAccountIdentifiers", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLatestOrderId(value: String): Self = StObject.set(x, "latestOrderId", value.asInstanceOf[js.Any])
    
    inline def setLatestOrderIdUndefined: Self = StObject.set(x, "latestOrderId", js.undefined)
    
    inline def setLineItems(value: js.Array[SubscriptionPurchaseLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: SubscriptionPurchaseLineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setLinkedPurchaseToken(value: String): Self = StObject.set(x, "linkedPurchaseToken", value.asInstanceOf[js.Any])
    
    inline def setLinkedPurchaseTokenUndefined: Self = StObject.set(x, "linkedPurchaseToken", js.undefined)
    
    inline def setPausedStateContext(value: PausedStateContext): Self = StObject.set(x, "pausedStateContext", value.asInstanceOf[js.Any])
    
    inline def setPausedStateContextUndefined: Self = StObject.set(x, "pausedStateContext", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setSubscribeWithGoogleInfo(value: SubscribeWithGoogleInfo): Self = StObject.set(x, "subscribeWithGoogleInfo", value.asInstanceOf[js.Any])
    
    inline def setSubscribeWithGoogleInfoUndefined: Self = StObject.set(x, "subscribeWithGoogleInfo", js.undefined)
    
    inline def setSubscriptionState(value: String): Self = StObject.set(x, "subscriptionState", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionStateUndefined: Self = StObject.set(x, "subscriptionState", js.undefined)
    
    inline def setTestPurchase(value: Any): Self = StObject.set(x, "testPurchase", value.asInstanceOf[js.Any])
    
    inline def setTestPurchaseUndefined: Self = StObject.set(x, "testPurchase", js.undefined)
  }
}
