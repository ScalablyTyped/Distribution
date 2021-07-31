package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SubscriptionPurchase resource indicates the status of a user&#39;s
  * subscription purchase.
  */
trait SchemaSubscriptionPurchase extends StObject {
  
  /**
    * Whether the subscription will automatically be renewed when it reaches
    * its current expiry time.
    */
  var autoRenewing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The reason why a subscription was canceled or is not auto-renewing.
    * Possible values are:   - User canceled the subscription  - Subscription
    * was canceled by the system, for example because of a billing problem  -
    * Subscription was replaced with a new subscription  - Subscription was
    * canceled by the developer
    */
  var cancelReason: js.UndefOr[Double] = js.undefined
  
  /**
    * Information provided by the user when they complete the subscription
    * cancellation flow (cancellation reason survey).
    */
  var cancelSurveyResult: js.UndefOr[SchemaSubscriptionCancelSurveyResult] = js.undefined
  
  /**
    * ISO 3166-1 alpha-2 billing country/region code of the user at the time
    * the subscription was granted.
    */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /**
    * A developer-specified string that contains supplemental information about
    * an order.
    */
  var developerPayload: js.UndefOr[String] = js.undefined
  
  /**
    * The email address of the user when the subscription was purchased. Only
    * present for purchases made with &#39;Subscribe with Google&#39;.
    */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Time at which the subscription will expire, in milliseconds since the
    * Epoch.
    */
  var expiryTimeMillis: js.UndefOr[String] = js.undefined
  
  /**
    * The family name of the user when the subscription was purchased. Only
    * present for purchases made with &#39;Subscribe with Google&#39;.
    */
  var familyName: js.UndefOr[String] = js.undefined
  
  /**
    * The given name of the user when the subscription was purchased. Only
    * present for purchases made with &#39;Subscribe with Google&#39;.
    */
  var givenName: js.UndefOr[String] = js.undefined
  
  /**
    * This kind represents a subscriptionPurchase object in the
    * androidpublisher service.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The purchase token of the originating purchase if this subscription is
    * one of the following:   - Re-signup of a canceled but non-lapsed
    * subscription  - Upgrade/downgrade from a previous subscription  For
    * example, suppose a user originally signs up and you receive purchase
    * token X, then the user cancels and goes through the resignup flow (before
    * their subscription lapses) and you receive purchase token Y, and finally
    * the user upgrades their subscription and you receive purchase token Z. If
    * you call this API with purchase token Z, this field will be set to Y. If
    * you call this API with purchase token Y, this field will be set to X. If
    * you call this API with purchase token X, this field will not be set.
    */
  var linkedPurchaseToken: js.UndefOr[String] = js.undefined
  
  /**
    * The order id of the latest recurring order associated with the purchase
    * of the subscription.
    */
  var orderId: js.UndefOr[String] = js.undefined
  
  /**
    * The payment state of the subscription. Possible values are:   - Payment
    * pending  - Payment received  - Free trial  - Pending deferred
    * upgrade/downgrade
    */
  var paymentState: js.UndefOr[Double] = js.undefined
  
  /**
    * Price of the subscription, not including tax. Price is expressed in
    * micro-units, where 1,000,000 micro-units represents one unit of the
    * currency. For example, if the subscription price is €1.99,
    * price_amount_micros is 1990000.
    */
  var priceAmountMicros: js.UndefOr[String] = js.undefined
  
  /**
    * The latest price change information available. This is present only when
    * there is an upcoming price change for the subscription yet to be applied.
    * Once the subscription renews with the new price or the subscription is
    * canceled, no price change information will be returned.
    */
  var priceChange: js.UndefOr[SchemaSubscriptionPriceChange] = js.undefined
  
  /**
    * ISO 4217 currency code for the subscription price. For example, if the
    * price is specified in British pounds sterling, price_currency_code is
    * &quot;GBP&quot;.
    */
  var priceCurrencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * The profile id of the user when the subscription was purchased. Only
    * present for purchases made with &#39;Subscribe with Google&#39;.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * The profile name of the user when the subscription was purchased. Only
    * present for purchases made with &#39;Subscribe with Google&#39;.
    */
  var profileName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of purchase of the subscription. This field is only set if this
    * purchase was not made using the standard in-app billing flow. Possible
    * values are:   - Test (i.e. purchased from a license testing account)
    */
  var purchaseType: js.UndefOr[Double] = js.undefined
  
  /**
    * Time at which the subscription was granted, in milliseconds since the
    * Epoch.
    */
  var startTimeMillis: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the subscription was canceled by the user, in
    * milliseconds since the epoch. Only present if cancelReason is 0.
    */
  var userCancellationTimeMillis: js.UndefOr[String] = js.undefined
}
object SchemaSubscriptionPurchase {
  
  @scala.inline
  def apply(): SchemaSubscriptionPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPurchase]
  }
  
  @scala.inline
  implicit class SchemaSubscriptionPurchaseMutableBuilder[Self <: SchemaSubscriptionPurchase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRenewing(value: Boolean): Self = StObject.set(x, "autoRenewing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRenewingUndefined: Self = StObject.set(x, "autoRenewing", js.undefined)
    
    @scala.inline
    def setCancelReason(value: Double): Self = StObject.set(x, "cancelReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelReasonUndefined: Self = StObject.set(x, "cancelReason", js.undefined)
    
    @scala.inline
    def setCancelSurveyResult(value: SchemaSubscriptionCancelSurveyResult): Self = StObject.set(x, "cancelSurveyResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelSurveyResultUndefined: Self = StObject.set(x, "cancelSurveyResult", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setExpiryTimeMillis(value: String): Self = StObject.set(x, "expiryTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryTimeMillisUndefined: Self = StObject.set(x, "expiryTimeMillis", js.undefined)
    
    @scala.inline
    def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    @scala.inline
    def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLinkedPurchaseToken(value: String): Self = StObject.set(x, "linkedPurchaseToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedPurchaseTokenUndefined: Self = StObject.set(x, "linkedPurchaseToken", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    @scala.inline
    def setPaymentState(value: Double): Self = StObject.set(x, "paymentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentStateUndefined: Self = StObject.set(x, "paymentState", js.undefined)
    
    @scala.inline
    def setPriceAmountMicros(value: String): Self = StObject.set(x, "priceAmountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceAmountMicrosUndefined: Self = StObject.set(x, "priceAmountMicros", js.undefined)
    
    @scala.inline
    def setPriceChange(value: SchemaSubscriptionPriceChange): Self = StObject.set(x, "priceChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceChangeUndefined: Self = StObject.set(x, "priceChange", js.undefined)
    
    @scala.inline
    def setPriceCurrencyCode(value: String): Self = StObject.set(x, "priceCurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceCurrencyCodeUndefined: Self = StObject.set(x, "priceCurrencyCode", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    @scala.inline
    def setProfileName(value: String): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
    
    @scala.inline
    def setPurchaseType(value: Double): Self = StObject.set(x, "purchaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseTypeUndefined: Self = StObject.set(x, "purchaseType", js.undefined)
    
    @scala.inline
    def setStartTimeMillis(value: String): Self = StObject.set(x, "startTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeMillisUndefined: Self = StObject.set(x, "startTimeMillis", js.undefined)
    
    @scala.inline
    def setUserCancellationTimeMillis(value: String): Self = StObject.set(x, "userCancellationTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCancellationTimeMillisUndefined: Self = StObject.set(x, "userCancellationTimeMillis", js.undefined)
  }
}
