package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem extends StObject {
  
  /**
    * Output only. Description of this line item.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. It is set only if the line item has its own free trial applied. End time of the line item free trial period, in ISO 8061 format. For example, "2019-08-31T17:28:54.564Z". It will be set the same as createTime if no free trial promotion is specified.
    */
  var lineItemFreeTrialEndTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The promotions applied on the line item. It can be: - a free trial promotion, which overrides the subscription-level free trial promotion. - an introductory pricing promotion. When used as input in Create or Provision API, specify its resource name only.
    */
  var lineItemPromotionSpecs: js.UndefOr[
    js.Array[SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec]
  ] = js.undefined
  
  /**
    * Output only. Details only set for a ONE_TIME recurrence line item.
    */
  var oneTimeRecurrenceDetails: js.UndefOr[
    SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItemOneTimeRecurrenceDetails
  ] = js.undefined
  
  /**
    * Required. Product resource name that identifies one the line item The format is 'partners/{partner_id\}/products/{product_id\}'.
    */
  var product: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The recurrence type of the line item.
    */
  var recurrenceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The state of the line item.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLineItemFreeTrialEndTime(value: String): Self = StObject.set(x, "lineItemFreeTrialEndTime", value.asInstanceOf[js.Any])
    
    inline def setLineItemFreeTrialEndTimeNull: Self = StObject.set(x, "lineItemFreeTrialEndTime", null)
    
    inline def setLineItemFreeTrialEndTimeUndefined: Self = StObject.set(x, "lineItemFreeTrialEndTime", js.undefined)
    
    inline def setLineItemPromotionSpecs(value: js.Array[SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec]): Self = StObject.set(x, "lineItemPromotionSpecs", value.asInstanceOf[js.Any])
    
    inline def setLineItemPromotionSpecsUndefined: Self = StObject.set(x, "lineItemPromotionSpecs", js.undefined)
    
    inline def setLineItemPromotionSpecsVarargs(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec*): Self = StObject.set(x, "lineItemPromotionSpecs", js.Array(value*))
    
    inline def setOneTimeRecurrenceDetails(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItemOneTimeRecurrenceDetails): Self = StObject.set(x, "oneTimeRecurrenceDetails", value.asInstanceOf[js.Any])
    
    inline def setOneTimeRecurrenceDetailsUndefined: Self = StObject.set(x, "oneTimeRecurrenceDetails", js.undefined)
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductNull: Self = StObject.set(x, "product", null)
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setRecurrenceType(value: String): Self = StObject.set(x, "recurrenceType", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceTypeNull: Self = StObject.set(x, "recurrenceType", null)
    
    inline def setRecurrenceTypeUndefined: Self = StObject.set(x, "recurrenceType", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
