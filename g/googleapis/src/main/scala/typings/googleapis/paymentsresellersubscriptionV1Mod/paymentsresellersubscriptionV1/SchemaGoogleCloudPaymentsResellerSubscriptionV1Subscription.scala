package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription extends StObject {
  
  /**
    * Output only. Describes the details of a cancelled subscription. Only applicable to subscription of state `STATE_CANCELLED`.
    */
  var cancellationDetails: js.UndefOr[SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionCancellationDetails] = js.undefined
  
  /**
    * Output only. System generated timestamp when the subscription is created. UTC timezone.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which the subscription is expected to be extended, in ISO 8061 format. UTC timezone. For example: "2019-08-31T17:28:54.564Z"
    */
  var cycleEndTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Indicates if the subscription is entitled to the end user.
    */
  var endUserEntitled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. End of the free trial period, in ISO 8061 format. For example, "2019-08-31T17:28:54.564Z". It will be set the same as createTime if no free trial promotion is specified.
    */
  var freeTrialEndTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The line items of the subscription.
    */
  var lineItems: js.UndefOr[js.Array[SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem]] = js.undefined
  
  /**
    * Output only. Response only. Resource name of the subscription. It will have the format of "partners/{partner_id\}/subscriptions/{subscription_id\}"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Identifier of the end-user in partner’s system. The value is restricted to 63 ASCII characters at the maximum.
    */
  var partnerUserToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Describes the processing state of the subscription. See more details at [the lifecycle of a subscription](/payments/reseller/subscription/reference/index/Receive.Notifications#payments-subscription-lifecycle).
    */
  var processingState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Deprecated: consider using `line_items` as the input. Required. Resource name that identifies the purchased products. The format will be 'partners/{partner_id\}/products/{product_id\}'.
    */
  var products: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Subscription-level promotions. Only free trial is supported on this level. It determines the first renewal time of the subscription to be the end of the free trial period. Specify the promotion resource name only when used as input.
    */
  var promotionSpecs: js.UndefOr[
    js.Array[SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec]
  ] = js.undefined
  
  /**
    * Optional. Deprecated: consider using the top-level `promotion_specs` as the input. Optional. Resource name that identifies one or more promotions that can be applied on the product. A typical promotion for a subscription is Free trial. The format will be 'partners/{partner_id\}/promotions/{promotion_id\}'.
    */
  var promotions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The place where partners should redirect the end-user to after creation. This field might also be populated when creation failed. However, Partners should always prepare a default URL to redirect the user in case this field is empty.
    */
  var redirectUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which the subscription is expected to be renewed by Google - a new charge will be incurred and the service entitlement will be renewed. A non-immediate cancellation will take place at this time too, before which, the service entitlement for the end user will remain valid. UTC timezone in ISO 8061 format. For example: "2019-08-31T17:28:54.564Z"
    */
  var renewalTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The location that the service is provided as indicated by the partner.
    */
  var serviceLocation: js.UndefOr[SchemaGoogleCloudPaymentsResellerSubscriptionV1Location] = js.undefined
  
  /**
    * Output only. Describes the state of the subscription. See more details at [the lifecycle of a subscription](/payments/reseller/subscription/reference/index/Receive.Notifications#payments-subscription-lifecycle).
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. System generated timestamp when the subscription is most recently updated. UTC timezone.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Details about the previous subscription that this new subscription upgrades/downgrades from. Only populated if this subscription is an upgrade/downgrade from another subscription.
    */
  var upgradeDowngradeDetails: js.UndefOr[
    SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails
  ] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription](x: Self) {
    
    inline def setCancellationDetails(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionCancellationDetails): Self = StObject.set(x, "cancellationDetails", value.asInstanceOf[js.Any])
    
    inline def setCancellationDetailsUndefined: Self = StObject.set(x, "cancellationDetails", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCycleEndTime(value: String): Self = StObject.set(x, "cycleEndTime", value.asInstanceOf[js.Any])
    
    inline def setCycleEndTimeNull: Self = StObject.set(x, "cycleEndTime", null)
    
    inline def setCycleEndTimeUndefined: Self = StObject.set(x, "cycleEndTime", js.undefined)
    
    inline def setEndUserEntitled(value: Boolean): Self = StObject.set(x, "endUserEntitled", value.asInstanceOf[js.Any])
    
    inline def setEndUserEntitledNull: Self = StObject.set(x, "endUserEntitled", null)
    
    inline def setEndUserEntitledUndefined: Self = StObject.set(x, "endUserEntitled", js.undefined)
    
    inline def setFreeTrialEndTime(value: String): Self = StObject.set(x, "freeTrialEndTime", value.asInstanceOf[js.Any])
    
    inline def setFreeTrialEndTimeNull: Self = StObject.set(x, "freeTrialEndTime", null)
    
    inline def setFreeTrialEndTimeUndefined: Self = StObject.set(x, "freeTrialEndTime", js.undefined)
    
    inline def setLineItems(value: js.Array[SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPartnerUserToken(value: String): Self = StObject.set(x, "partnerUserToken", value.asInstanceOf[js.Any])
    
    inline def setPartnerUserTokenNull: Self = StObject.set(x, "partnerUserToken", null)
    
    inline def setPartnerUserTokenUndefined: Self = StObject.set(x, "partnerUserToken", js.undefined)
    
    inline def setProcessingState(value: String): Self = StObject.set(x, "processingState", value.asInstanceOf[js.Any])
    
    inline def setProcessingStateNull: Self = StObject.set(x, "processingState", null)
    
    inline def setProcessingStateUndefined: Self = StObject.set(x, "processingState", js.undefined)
    
    inline def setProducts(value: js.Array[String]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsNull: Self = StObject.set(x, "products", null)
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: String*): Self = StObject.set(x, "products", js.Array(value*))
    
    inline def setPromotionSpecs(value: js.Array[SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec]): Self = StObject.set(x, "promotionSpecs", value.asInstanceOf[js.Any])
    
    inline def setPromotionSpecsUndefined: Self = StObject.set(x, "promotionSpecs", js.undefined)
    
    inline def setPromotionSpecsVarargs(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec*): Self = StObject.set(x, "promotionSpecs", js.Array(value*))
    
    inline def setPromotions(value: js.Array[String]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    inline def setPromotionsNull: Self = StObject.set(x, "promotions", null)
    
    inline def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    inline def setPromotionsVarargs(value: String*): Self = StObject.set(x, "promotions", js.Array(value*))
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriNull: Self = StObject.set(x, "redirectUri", null)
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    inline def setRenewalTime(value: String): Self = StObject.set(x, "renewalTime", value.asInstanceOf[js.Any])
    
    inline def setRenewalTimeNull: Self = StObject.set(x, "renewalTime", null)
    
    inline def setRenewalTimeUndefined: Self = StObject.set(x, "renewalTime", js.undefined)
    
    inline def setServiceLocation(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1Location): Self = StObject.set(x, "serviceLocation", value.asInstanceOf[js.Any])
    
    inline def setServiceLocationUndefined: Self = StObject.set(x, "serviceLocation", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUpgradeDowngradeDetails(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails): Self = StObject.set(x, "upgradeDowngradeDetails", value.asInstanceOf[js.Any])
    
    inline def setUpgradeDowngradeDetailsUndefined: Self = StObject.set(x, "upgradeDowngradeDetails", js.undefined)
  }
}
