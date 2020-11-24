package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionPurchase extends js.Object {
  
  /** The acknowledgement state of the subscription product. Possible values are: 0. Yet to be acknowledged 1. Acknowledged */
  var acknowledgementState: js.UndefOr[Double] = js.native
  
  /** Whether the subscription will automatically be renewed when it reaches its current expiry time. */
  var autoRenewing: js.UndefOr[Boolean] = js.native
  
  /** Time at which the subscription will be automatically resumed, in milliseconds since the Epoch. Only present if the user has requested to pause the subscription. */
  var autoResumeTimeMillis: js.UndefOr[String] = js.native
  
  /**
    * The reason why a subscription was canceled or is not auto-renewing. Possible values are: 0. User canceled the subscription 1. Subscription was canceled by the system, for example
    * because of a billing problem 2. Subscription was replaced with a new subscription 3. Subscription was canceled by the developer
    */
  var cancelReason: js.UndefOr[Double] = js.native
  
  /** Information provided by the user when they complete the subscription cancellation flow (cancellation reason survey). */
  var cancelSurveyResult: js.UndefOr[SubscriptionCancelSurveyResult] = js.native
  
  /** ISO 3166-1 alpha-2 billing country/region code of the user at the time the subscription was granted. */
  var countryCode: js.UndefOr[String] = js.native
  
  /** A developer-specified string that contains supplemental information about an order. */
  var developerPayload: js.UndefOr[String] = js.native
  
  /** The email address of the user when the subscription was purchased. Only present for purchases made with 'Subscribe with Google'. */
  var emailAddress: js.UndefOr[String] = js.native
  
  /** Time at which the subscription will expire, in milliseconds since the Epoch. */
  var expiryTimeMillis: js.UndefOr[String] = js.native
  
  /** User account identifier in the third-party service. Only present if account linking happened as part of the subscription purchase flow. */
  var externalAccountId: js.UndefOr[String] = js.native
  
  /** The family name of the user when the subscription was purchased. Only present for purchases made with 'Subscribe with Google'. */
  var familyName: js.UndefOr[String] = js.native
  
  /** The given name of the user when the subscription was purchased. Only present for purchases made with 'Subscribe with Google'. */
  var givenName: js.UndefOr[String] = js.native
  
  /**
    * Introductory price information of the subscription. This is only present when the subscription was purchased with an introductory price. This field does not indicate the
    * subscription is currently in introductory price period.
    */
  var introductoryPriceInfo: js.UndefOr[IntroductoryPriceInfo] = js.native
  
  /** This kind represents a subscriptionPurchase object in the androidpublisher service. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The purchase token of the originating purchase if this subscription is one of the following: 0. Re-signup of a canceled but non-lapsed subscription 1. Upgrade/downgrade from a
    * previous subscription For example, suppose a user originally signs up and you receive purchase token X, then the user cancels and goes through the resignup flow (before their
    * subscription lapses) and you receive purchase token Y, and finally the user upgrades their subscription and you receive purchase token Z. If you call this API with purchase token Z,
    * this field will be set to Y. If you call this API with purchase token Y, this field will be set to X. If you call this API with purchase token X, this field will not be set.
    */
  var linkedPurchaseToken: js.UndefOr[String] = js.native
  
  /**
    * An obfuscated version of the id that is uniquely associated with the user's account in your app. Present for the following purchases: * If account linking happened as part of the
    * subscription purchase flow. * It was specified using https://developer.android.com/reference/com/android/billingclient/api/BillingFlowParams.Builder#setobfuscatedaccountid when the
    * purchase was made.
    */
  var obfuscatedExternalAccountId: js.UndefOr[String] = js.native
  
  /**
    * An obfuscated version of the id that is uniquely associated with the user's profile in your app. Only present if specified using
    * https://developer.android.com/reference/com/android/billingclient/api/BillingFlowParams.Builder#setobfuscatedprofileid when the purchase was made.
    */
  var obfuscatedExternalProfileId: js.UndefOr[String] = js.native
  
  /** The order id of the latest recurring order associated with the purchase of the subscription. */
  var orderId: js.UndefOr[String] = js.native
  
  /**
    * The payment state of the subscription. Possible values are: 0. Payment pending 1. Payment received 2. Free trial 3. Pending deferred upgrade/downgrade Not present for canceled,
    * expired subscriptions.
    */
  var paymentState: js.UndefOr[Double] = js.native
  
  /**
    * Price of the subscription, not including tax. Price is expressed in micro-units, where 1,000,000 micro-units represents one unit of the currency. For example, if the subscription
    * price is €1.99, price_amount_micros is 1990000.
    */
  var priceAmountMicros: js.UndefOr[String] = js.native
  
  /**
    * The latest price change information available. This is present only when there is an upcoming price change for the subscription yet to be applied. Once the subscription renews with
    * the new price or the subscription is canceled, no price change information will be returned.
    */
  var priceChange: js.UndefOr[SubscriptionPriceChange] = js.native
  
  /** ISO 4217 currency code for the subscription price. For example, if the price is specified in British pounds sterling, price_currency_code is "GBP". */
  var priceCurrencyCode: js.UndefOr[String] = js.native
  
  /** The Google profile id of the user when the subscription was purchased. Only present for purchases made with 'Subscribe with Google'. */
  var profileId: js.UndefOr[String] = js.native
  
  /** The profile name of the user when the subscription was purchased. Only present for purchases made with 'Subscribe with Google'. */
  var profileName: js.UndefOr[String] = js.native
  
  /** The promotion code applied on this purchase. This field is only set if a vanity code promotion is applied when the subscription was purchased. */
  var promotionCode: js.UndefOr[String] = js.native
  
  /**
    * The type of promotion applied on this purchase. This field is only set if a promotion is applied when the subscription was purchased. Possible values are: 0. One time code 1. Vanity
    * code
    */
  var promotionType: js.UndefOr[Double] = js.native
  
  /**
    * The type of purchase of the subscription. This field is only set if this purchase was not made using the standard in-app billing flow. Possible values are: 0. Test (i.e. purchased
    * from a license testing account) 1. Promo (i.e. purchased using a promo code)
    */
  var purchaseType: js.UndefOr[Double] = js.native
  
  /** Time at which the subscription was granted, in milliseconds since the Epoch. */
  var startTimeMillis: js.UndefOr[String] = js.native
  
  /** The time at which the subscription was canceled by the user, in milliseconds since the epoch. Only present if cancelReason is 0. */
  var userCancellationTimeMillis: js.UndefOr[String] = js.native
}
object SubscriptionPurchase {
  
  @scala.inline
  def apply(): SubscriptionPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionPurchase]
  }
  
  @scala.inline
  implicit class SubscriptionPurchaseOps[Self <: SubscriptionPurchase] (val x: Self) extends AnyVal {
    
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
    def setAcknowledgementState(value: Double): Self = this.set("acknowledgementState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcknowledgementState: Self = this.set("acknowledgementState", js.undefined)
    
    @scala.inline
    def setAutoRenewing(value: Boolean): Self = this.set("autoRenewing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRenewing: Self = this.set("autoRenewing", js.undefined)
    
    @scala.inline
    def setAutoResumeTimeMillis(value: String): Self = this.set("autoResumeTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoResumeTimeMillis: Self = this.set("autoResumeTimeMillis", js.undefined)
    
    @scala.inline
    def setCancelReason(value: Double): Self = this.set("cancelReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelReason: Self = this.set("cancelReason", js.undefined)
    
    @scala.inline
    def setCancelSurveyResult(value: SubscriptionCancelSurveyResult): Self = this.set("cancelSurveyResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelSurveyResult: Self = this.set("cancelSurveyResult", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setDeveloperPayload(value: String): Self = this.set("developerPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloperPayload: Self = this.set("developerPayload", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    
    @scala.inline
    def setExpiryTimeMillis(value: String): Self = this.set("expiryTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiryTimeMillis: Self = this.set("expiryTimeMillis", js.undefined)
    
    @scala.inline
    def setExternalAccountId(value: String): Self = this.set("externalAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalAccountId: Self = this.set("externalAccountId", js.undefined)
    
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamilyName: Self = this.set("familyName", js.undefined)
    
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    
    @scala.inline
    def setIntroductoryPriceInfo(value: IntroductoryPriceInfo): Self = this.set("introductoryPriceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntroductoryPriceInfo: Self = this.set("introductoryPriceInfo", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLinkedPurchaseToken(value: String): Self = this.set("linkedPurchaseToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedPurchaseToken: Self = this.set("linkedPurchaseToken", js.undefined)
    
    @scala.inline
    def setObfuscatedExternalAccountId(value: String): Self = this.set("obfuscatedExternalAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObfuscatedExternalAccountId: Self = this.set("obfuscatedExternalAccountId", js.undefined)
    
    @scala.inline
    def setObfuscatedExternalProfileId(value: String): Self = this.set("obfuscatedExternalProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObfuscatedExternalProfileId: Self = this.set("obfuscatedExternalProfileId", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setPaymentState(value: Double): Self = this.set("paymentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentState: Self = this.set("paymentState", js.undefined)
    
    @scala.inline
    def setPriceAmountMicros(value: String): Self = this.set("priceAmountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceAmountMicros: Self = this.set("priceAmountMicros", js.undefined)
    
    @scala.inline
    def setPriceChange(value: SubscriptionPriceChange): Self = this.set("priceChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceChange: Self = this.set("priceChange", js.undefined)
    
    @scala.inline
    def setPriceCurrencyCode(value: String): Self = this.set("priceCurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceCurrencyCode: Self = this.set("priceCurrencyCode", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    
    @scala.inline
    def setProfileName(value: String): Self = this.set("profileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileName: Self = this.set("profileName", js.undefined)
    
    @scala.inline
    def setPromotionCode(value: String): Self = this.set("promotionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotionCode: Self = this.set("promotionCode", js.undefined)
    
    @scala.inline
    def setPromotionType(value: Double): Self = this.set("promotionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotionType: Self = this.set("promotionType", js.undefined)
    
    @scala.inline
    def setPurchaseType(value: Double): Self = this.set("purchaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseType: Self = this.set("purchaseType", js.undefined)
    
    @scala.inline
    def setStartTimeMillis(value: String): Self = this.set("startTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeMillis: Self = this.set("startTimeMillis", js.undefined)
    
    @scala.inline
    def setUserCancellationTimeMillis(value: String): Self = this.set("userCancellationTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserCancellationTimeMillis: Self = this.set("userCancellationTimeMillis", js.undefined)
  }
}
