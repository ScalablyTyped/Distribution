package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v1Dot1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.googleapisCommon.mod.Compute
import typings.googleapisCommon.mod.GoogleAuth
import typings.googleapisCommon.mod.JWT
import typings.googleapisCommon.mod.OAuth2Client
import typings.googleapisCommon.mod.UserRefreshClient
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v11Mod {
  
  object androidpublisherV11 {
    
    @JSImport("googleapis/build/src/apis/androidpublisher/v1.1", "androidpublisher_v1_1.Androidpublisher")
    @js.native
    open class Androidpublisher protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var inapppurchases: ResourceInapppurchases = js.native
    }
    
    @JSImport("googleapis/build/src/apis/androidpublisher/v1.1", "androidpublisher_v1_1.Resource$Inapppurchases")
    @js.native
    open class ResourceInapppurchases protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def get(): GaxiosPromise[SchemaInappPurchase] = js.native
      def get(callback: BodyResponseCallback[SchemaInappPurchase]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInappPurchase] = js.native
      def get(params: ParamsResourceInapppurchasesGet): GaxiosPromise[SchemaInappPurchase] = js.native
      def get(params: ParamsResourceInapppurchasesGet, callback: BodyResponseCallback[SchemaInappPurchase]): Unit = js.native
      def get(
        params: ParamsResourceInapppurchasesGet,
        options: BodyResponseCallback[Readable | SchemaInappPurchase],
        callback: BodyResponseCallback[Readable | SchemaInappPurchase]
      ): Unit = js.native
      def get(params: ParamsResourceInapppurchasesGet, options: MethodOptions): GaxiosPromise[SchemaInappPurchase] = js.native
      def get(
        params: ParamsResourceInapppurchasesGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaInappPurchase]
      ): Unit = js.native
      /**
        * androidpublisher.inapppurchases.get
        * @desc Checks the purchase and consumption status of an inapp item.
        * @example
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const androidpublisher = google.androidpublisher('v1.1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await androidpublisher.inapppurchases.get({
        *     // The package name of the application the inapp product was sold in (for example, 'com.some.thing').
        *     packageName: 'placeholder-value',
        *     // The inapp product SKU (for example, 'com.some.thing.inapp1').
        *     productId: 'placeholder-value',
        *     // The token provided to the user's device when the inapp product was purchased.
        *     token: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "consumptionState": 0,
        *   //   "developerPayload": "my_developerPayload",
        *   //   "kind": "my_kind",
        *   //   "orderId": "my_orderId",
        *   //   "purchaseState": 0,
        *   //   "purchaseTime": "my_purchaseTime",
        *   //   "purchaseType": 0
        *   // }
        * }
        *
        * main().catch(e => {
        *   console.error(e);
        *   throw e;
        * });
        *
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
      def get(params: ParamsResourceInapppurchasesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceInapppurchasesGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1Dot1
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1.1")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1Dot1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceInapppurchasesGet
      extends StObject
         with StandardParameters {
      
      /**
        * The package name of the application the inapp product was sold in (for example, 'com.some.thing').
        */
      var packageName: js.UndefOr[String] = js.undefined
      
      /**
        * The inapp product SKU (for example, 'com.some.thing.inapp1').
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * The token provided to the user's device when the inapp product was purchased.
        */
      var token: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceInapppurchasesGet {
      
      inline def apply(): ParamsResourceInapppurchasesGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceInapppurchasesGet]
      }
      
      extension [Self <: ParamsResourceInapppurchasesGet](x: Self) {
        
        inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
        
        inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
        
        inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      }
    }
    
    trait SchemaInappPurchase extends StObject {
      
      /**
        * The consumption state of the inapp product. Possible values are:   - Yet to be consumed  - Consumed
        */
      var consumptionState: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * A developer-specified string that contains supplemental information about an order.
        */
      var developerPayload: js.UndefOr[String | Null] = js.undefined
      
      /**
        * This kind represents an inappPurchase object in the androidpublisher service.
        */
      var kind: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The order id associated with the purchase of the inapp product.
        */
      var orderId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The purchase state of the order. Possible values are:   - Purchased  - Canceled  - Pending
        */
      var purchaseState: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The time the product was purchased, in milliseconds since the epoch (Jan 1, 1970).
        */
      var purchaseTime: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The type of purchase of the inapp product. This field is only set if this purchase was not made using the standard in-app billing flow. Possible values are:   - Test (i.e. purchased from a license testing account)  - Promo (i.e. purchased using a promo code)  - Rewarded (i.e. from watching a video ad instead of paying)
        */
      var purchaseType: js.UndefOr[Double | Null] = js.undefined
    }
    object SchemaInappPurchase {
      
      inline def apply(): SchemaInappPurchase = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaInappPurchase]
      }
      
      extension [Self <: SchemaInappPurchase](x: Self) {
        
        inline def setConsumptionState(value: Double): Self = StObject.set(x, "consumptionState", value.asInstanceOf[js.Any])
        
        inline def setConsumptionStateNull: Self = StObject.set(x, "consumptionState", null)
        
        inline def setConsumptionStateUndefined: Self = StObject.set(x, "consumptionState", js.undefined)
        
        inline def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
        
        inline def setDeveloperPayloadNull: Self = StObject.set(x, "developerPayload", null)
        
        inline def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindNull: Self = StObject.set(x, "kind", null)
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
        
        inline def setOrderIdNull: Self = StObject.set(x, "orderId", null)
        
        inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
        
        inline def setPurchaseState(value: Double): Self = StObject.set(x, "purchaseState", value.asInstanceOf[js.Any])
        
        inline def setPurchaseStateNull: Self = StObject.set(x, "purchaseState", null)
        
        inline def setPurchaseStateUndefined: Self = StObject.set(x, "purchaseState", js.undefined)
        
        inline def setPurchaseTime(value: String): Self = StObject.set(x, "purchaseTime", value.asInstanceOf[js.Any])
        
        inline def setPurchaseTimeNull: Self = StObject.set(x, "purchaseTime", null)
        
        inline def setPurchaseTimeUndefined: Self = StObject.set(x, "purchaseTime", js.undefined)
        
        inline def setPurchaseType(value: Double): Self = StObject.set(x, "purchaseType", value.asInstanceOf[js.Any])
        
        inline def setPurchaseTypeNull: Self = StObject.set(x, "purchaseType", null)
        
        inline def setPurchaseTypeUndefined: Self = StObject.set(x, "purchaseType", js.undefined)
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * Data format for the response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[
            String | OAuth2Client | JWT | Compute | UserRefreshClient | GoogleAuth[JSONClient]
          ] = js.undefined
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.undefined
      
      /**
        * API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
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
        * An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
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
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient | GoogleAuth[JSONClient]): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
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
