package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.googleapisStrings.v1_1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v11Mod {
  
  object androidpublisherV11 {
    
    /**
      * Google Play Developer API
      *
      * Accesses Android application developers&#39; Google Play accounts.
      *
      * @example
      * const {google} = require('googleapis');
      * const androidpublisher = google.androidpublisher('v1.1');
      *
      * @namespace androidpublisher
      * @type {Function}
      * @version v1.1
      * @variation v1.1
      * @param {object=} options Options for Androidpublisher
      */
    @JSImport("googleapis/build/src/apis/androidpublisher/v1.1", "androidpublisher_v1_1.Androidpublisher")
    @js.native
    class Androidpublisher protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var inapppurchases: ResourceInapppurchases = js.native
      
      var purchases: ResourcePurchases = js.native
    }
    
    @JSImport("googleapis/build/src/apis/androidpublisher/v1.1", "androidpublisher_v1_1.Resource$Inapppurchases")
    @js.native
    class ResourceInapppurchases protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * androidpublisher.inapppurchases.get
        * @desc Checks the purchase and consumption status of an inapp item.
        * @alias androidpublisher.inapppurchases.get
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.packageName The package name of the application the inapp product was sold in (for example, 'com.some.thing').
        * @param {string} params.productId The inapp product SKU (for example, 'com.some.thing.inapp1').
        * @param {string} params.token The token provided to the user's device when the inapp product was purchased.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def get(): GaxiosPromise[SchemaInappPurchase] = js.native
      def get(callback: BodyResponseCallback[SchemaInappPurchase]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInappPurchase] = js.native
      def get(params: ParamsResourceInapppurchasesGet): GaxiosPromise[SchemaInappPurchase] = js.native
      def get(params: ParamsResourceInapppurchasesGet, callback: BodyResponseCallback[SchemaInappPurchase]): Unit = js.native
      def get(
        params: ParamsResourceInapppurchasesGet,
        options: BodyResponseCallback[SchemaInappPurchase],
        callback: BodyResponseCallback[SchemaInappPurchase]
      ): Unit = js.native
      def get(params: ParamsResourceInapppurchasesGet, options: MethodOptions): GaxiosPromise[SchemaInappPurchase] = js.native
      def get(
        params: ParamsResourceInapppurchasesGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaInappPurchase]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/androidpublisher/v1.1", "androidpublisher_v1_1.Resource$Purchases")
    @js.native
    class ResourcePurchases protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      /**
        * androidpublisher.purchases.cancel
        * @desc Cancels a user's subscription purchase. The subscription remains
        * valid until its expiration time.
        * @alias androidpublisher.purchases.cancel
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.packageName The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
        * @param {string} params.subscriptionId The purchased subscription ID (for example, 'monthly001').
        * @param {string} params.token The token provided to the user's device when the subscription was purchased.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def cancel(): GaxiosPromise[Unit] = js.native
      def cancel(callback: BodyResponseCallback[Unit]): Unit = js.native
      def cancel(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
      def cancel(params: ParamsResourcePurchasesCancel): GaxiosPromise[Unit] = js.native
      def cancel(params: ParamsResourcePurchasesCancel, callback: BodyResponseCallback[Unit]): Unit = js.native
      def cancel(
        params: ParamsResourcePurchasesCancel,
        options: BodyResponseCallback[Unit],
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
      def cancel(params: ParamsResourcePurchasesCancel, options: MethodOptions): GaxiosPromise[Unit] = js.native
      def cancel(
        params: ParamsResourcePurchasesCancel,
        options: MethodOptions,
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
      
      var context: APIRequestContext = js.native
      
      /**
        * androidpublisher.purchases.get
        * @desc Checks whether a user's subscription purchase is valid and returns
        * its expiry time.
        * @alias androidpublisher.purchases.get
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.packageName The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
        * @param {string} params.subscriptionId The purchased subscription ID (for example, 'monthly001').
        * @param {string} params.token The token provided to the user's device when the subscription was purchased.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def get(): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
      def get(callback: BodyResponseCallback[SchemaSubscriptionPurchase]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
      def get(params: ParamsResourcePurchasesGet): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
      def get(params: ParamsResourcePurchasesGet, callback: BodyResponseCallback[SchemaSubscriptionPurchase]): Unit = js.native
      def get(
        params: ParamsResourcePurchasesGet,
        options: BodyResponseCallback[SchemaSubscriptionPurchase],
        callback: BodyResponseCallback[SchemaSubscriptionPurchase]
      ): Unit = js.native
      def get(params: ParamsResourcePurchasesGet, options: MethodOptions): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
      def get(
        params: ParamsResourcePurchasesGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSubscriptionPurchase]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1_1
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1_1")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1_1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceInapppurchasesGet
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * The package name of the application the inapp product was sold in (for
        * example, 'com.some.thing').
        */
      var packageName: js.UndefOr[String] = js.undefined
      
      /**
        * The inapp product SKU (for example, 'com.some.thing.inapp1').
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * The token provided to the user's device when the inapp product was
        * purchased.
        */
      var token: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceInapppurchasesGet {
      
      inline def apply(): ParamsResourceInapppurchasesGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceInapppurchasesGet]
      }
      
      extension [Self <: ParamsResourceInapppurchasesGet](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
        
        inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
        
        inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      }
    }
    
    trait ParamsResourcePurchasesCancel
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * The package name of the application for which this subscription was
        * purchased (for example, 'com.some.thing').
        */
      var packageName: js.UndefOr[String] = js.undefined
      
      /**
        * The purchased subscription ID (for example, 'monthly001').
        */
      var subscriptionId: js.UndefOr[String] = js.undefined
      
      /**
        * The token provided to the user's device when the subscription was
        * purchased.
        */
      var token: js.UndefOr[String] = js.undefined
    }
    object ParamsResourcePurchasesCancel {
      
      inline def apply(): ParamsResourcePurchasesCancel = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourcePurchasesCancel]
      }
      
      extension [Self <: ParamsResourcePurchasesCancel](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
        
        inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
        
        inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
        
        inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
        
        inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      }
    }
    
    trait ParamsResourcePurchasesGet
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * The package name of the application for which this subscription was
        * purchased (for example, 'com.some.thing').
        */
      var packageName: js.UndefOr[String] = js.undefined
      
      /**
        * The purchased subscription ID (for example, 'monthly001').
        */
      var subscriptionId: js.UndefOr[String] = js.undefined
      
      /**
        * The token provided to the user's device when the subscription was
        * purchased.
        */
      var token: js.UndefOr[String] = js.undefined
    }
    object ParamsResourcePurchasesGet {
      
      inline def apply(): ParamsResourcePurchasesGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourcePurchasesGet]
      }
      
      extension [Self <: ParamsResourcePurchasesGet](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
        
        inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
        
        inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
        
        inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
        
        inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      }
    }
    
    /**
      * An InappPurchase resource indicates the status of a user&#39;s inapp
      * product purchase.
      */
    trait SchemaInappPurchase extends StObject {
      
      /**
        * The consumption state of the inapp product. Possible values are:   - Yet
        * to be consumed  - Consumed
        */
      var consumptionState: js.UndefOr[Double] = js.undefined
      
      /**
        * A developer-specified string that contains supplemental information about
        * an order.
        */
      var developerPayload: js.UndefOr[String] = js.undefined
      
      /**
        * This kind represents an inappPurchase object in the androidpublisher
        * service.
        */
      var kind: js.UndefOr[String] = js.undefined
      
      /**
        * The order id associated with the purchase of the inapp product.
        */
      var orderId: js.UndefOr[String] = js.undefined
      
      /**
        * The purchase state of the order. Possible values are:   - Purchased  -
        * Canceled
        */
      var purchaseState: js.UndefOr[Double] = js.undefined
      
      /**
        * The time the product was purchased, in milliseconds since the epoch (Jan
        * 1, 1970).
        */
      var purchaseTime: js.UndefOr[String] = js.undefined
      
      /**
        * The type of purchase of the inapp product. This field is only set if this
        * purchase was not made using the standard in-app billing flow. Possible
        * values are:   - Test (i.e. purchased from a license testing account)  -
        * Promo (i.e. purchased using a promo code)  - Rewarded (i.e. from watching
        * a video ad instead of paying)
        */
      var purchaseType: js.UndefOr[Double] = js.undefined
    }
    object SchemaInappPurchase {
      
      inline def apply(): SchemaInappPurchase = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaInappPurchase]
      }
      
      extension [Self <: SchemaInappPurchase](x: Self) {
        
        inline def setConsumptionState(value: Double): Self = StObject.set(x, "consumptionState", value.asInstanceOf[js.Any])
        
        inline def setConsumptionStateUndefined: Self = StObject.set(x, "consumptionState", js.undefined)
        
        inline def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
        
        inline def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
        
        inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
        
        inline def setPurchaseState(value: Double): Self = StObject.set(x, "purchaseState", value.asInstanceOf[js.Any])
        
        inline def setPurchaseStateUndefined: Self = StObject.set(x, "purchaseState", js.undefined)
        
        inline def setPurchaseTime(value: String): Self = StObject.set(x, "purchaseTime", value.asInstanceOf[js.Any])
        
        inline def setPurchaseTimeUndefined: Self = StObject.set(x, "purchaseTime", js.undefined)
        
        inline def setPurchaseType(value: Double): Self = StObject.set(x, "purchaseType", value.asInstanceOf[js.Any])
        
        inline def setPurchaseTypeUndefined: Self = StObject.set(x, "purchaseType", js.undefined)
      }
    }
    
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
        * Time at which the subscription was granted, in milliseconds since the
        * Epoch.
        */
      var initiationTimestampMsec: js.UndefOr[String] = js.undefined
      
      /**
        * This kind represents a subscriptionPurchase object in the
        * androidpublisher service.
        */
      var kind: js.UndefOr[String] = js.undefined
      
      /**
        * Time at which the subscription will expire, in milliseconds since the
        * Epoch.
        */
      var validUntilTimestampMsec: js.UndefOr[String] = js.undefined
    }
    object SchemaSubscriptionPurchase {
      
      inline def apply(): SchemaSubscriptionPurchase = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSubscriptionPurchase]
      }
      
      extension [Self <: SchemaSubscriptionPurchase](x: Self) {
        
        inline def setAutoRenewing(value: Boolean): Self = StObject.set(x, "autoRenewing", value.asInstanceOf[js.Any])
        
        inline def setAutoRenewingUndefined: Self = StObject.set(x, "autoRenewing", js.undefined)
        
        inline def setInitiationTimestampMsec(value: String): Self = StObject.set(x, "initiationTimestampMsec", value.asInstanceOf[js.Any])
        
        inline def setInitiationTimestampMsecUndefined: Self = StObject.set(x, "initiationTimestampMsec", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setValidUntilTimestampMsec(value: String): Self = StObject.set(x, "validUntilTimestampMsec", value.asInstanceOf[js.Any])
        
        inline def setValidUntilTimestampMsecUndefined: Self = StObject.set(x, "validUntilTimestampMsec", js.undefined)
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * Data format for the response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.undefined
      
      /**
        * API key. Your API key identifies your project and provides you with API
        * access, quota, and reports. Required unless you provide an OAuth 2.0
        * token.
        */
      var key: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.undefined
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.undefined
      
      /**
        * An opaque string that represents a user for quota purposes. Must not
        * exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.undefined
      
      /**
        * Deprecated. Please use quotaUser instead.
        */
      var userIp: js.UndefOr[String] = js.undefined
    }
    object StandardParameters {
      
      inline def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      extension [Self <: StandardParameters](x: Self) {
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
        
        inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
      }
    }
  }
}
