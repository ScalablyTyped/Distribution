package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v3
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.googleapisCommon.mod.BaseExternalAccountClient
import typings.googleapisCommon.mod.Compute
import typings.googleapisCommon.mod.GoogleAuth
import typings.googleapisCommon.mod.JWT
import typings.googleapisCommon.mod.OAuth2Client
import typings.googleapisCommon.mod.UserRefreshClient
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexingV3Mod {
  
  object indexingV3 {
    
    @JSImport("googleapis/build/src/apis/indexing/v3", "indexing_v3.Indexing")
    @js.native
    open class Indexing protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var urlNotifications: ResourceUrlnotifications = js.native
    }
    
    @JSImport("googleapis/build/src/apis/indexing/v3", "indexing_v3.Resource$Urlnotifications")
    @js.native
    open class ResourceUrlnotifications protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def getMetadata(): GaxiosPromise[SchemaUrlNotificationMetadata] = js.native
      def getMetadata(callback: BodyResponseCallback[SchemaUrlNotificationMetadata]): Unit = js.native
      def getMetadata(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUrlNotificationMetadata] = js.native
      def getMetadata(params: ParamsResourceUrlnotificationsGetmetadata): GaxiosPromise[SchemaUrlNotificationMetadata] = js.native
      def getMetadata(
        params: ParamsResourceUrlnotificationsGetmetadata,
        callback: BodyResponseCallback[SchemaUrlNotificationMetadata]
      ): Unit = js.native
      def getMetadata(
        params: ParamsResourceUrlnotificationsGetmetadata,
        options: BodyResponseCallback[Readable | SchemaUrlNotificationMetadata],
        callback: BodyResponseCallback[Readable | SchemaUrlNotificationMetadata]
      ): Unit = js.native
      def getMetadata(params: ParamsResourceUrlnotificationsGetmetadata, options: MethodOptions): GaxiosPromise[SchemaUrlNotificationMetadata] = js.native
      def getMetadata(
        params: ParamsResourceUrlnotificationsGetmetadata,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaUrlNotificationMetadata]
      ): Unit = js.native
      /**
        * Gets metadata about a Web Document. This method can _only_ be used to query URLs that were previously seen in successful Indexing API notifications. Includes the latest `UrlNotification` received via this API.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/indexing.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const indexing = google.indexing('v3');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/indexing'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await indexing.urlNotifications.getMetadata({
        *     // URL that is being queried.
        *     url: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "latestRemove": {},
        *   //   "latestUpdate": {},
        *   //   "url": "my_url"
        *   // }
        * }
        *
        * main().catch(e => {
        *   console.error(e);
        *   throw e;
        * });
        *
        * ```
        *
        * @param params - Parameters for request
        * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param callback - Optional callback that handles the response.
        * @returns A promise if used with async/await, or void if used with a callback.
        */
      def getMetadata(params: ParamsResourceUrlnotificationsGetmetadata, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def getMetadata(
        params: ParamsResourceUrlnotificationsGetmetadata,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def publish(): GaxiosPromise[SchemaPublishUrlNotificationResponse] = js.native
      def publish(callback: BodyResponseCallback[SchemaPublishUrlNotificationResponse]): Unit = js.native
      def publish(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPublishUrlNotificationResponse] = js.native
      def publish(params: ParamsResourceUrlnotificationsPublish): GaxiosPromise[SchemaPublishUrlNotificationResponse] = js.native
      def publish(
        params: ParamsResourceUrlnotificationsPublish,
        callback: BodyResponseCallback[SchemaPublishUrlNotificationResponse]
      ): Unit = js.native
      def publish(
        params: ParamsResourceUrlnotificationsPublish,
        options: BodyResponseCallback[Readable | SchemaPublishUrlNotificationResponse],
        callback: BodyResponseCallback[Readable | SchemaPublishUrlNotificationResponse]
      ): Unit = js.native
      def publish(params: ParamsResourceUrlnotificationsPublish, options: MethodOptions): GaxiosPromise[SchemaPublishUrlNotificationResponse] = js.native
      def publish(
        params: ParamsResourceUrlnotificationsPublish,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaPublishUrlNotificationResponse]
      ): Unit = js.native
      /**
        * Notifies that a URL has been updated or deleted.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/indexing.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const indexing = google.indexing('v3');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/indexing'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await indexing.urlNotifications.publish({
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "notifyTime": "my_notifyTime",
        *       //   "type": "my_type",
        *       //   "url": "my_url"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "urlNotificationMetadata": {}
        *   // }
        * }
        *
        * main().catch(e => {
        *   console.error(e);
        *   throw e;
        * });
        *
        * ```
        *
        * @param params - Parameters for request
        * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param callback - Optional callback that handles the response.
        * @returns A promise if used with async/await, or void if used with a callback.
        */
      def publish(params: ParamsResourceUrlnotificationsPublish, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def publish(
        params: ParamsResourceUrlnotificationsPublish,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v3
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v3")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v3): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceUrlnotificationsGetmetadata
      extends StObject
         with StandardParameters {
      
      /**
        * URL that is being queried.
        */
      var url: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceUrlnotificationsGetmetadata {
      
      inline def apply(): ParamsResourceUrlnotificationsGetmetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceUrlnotificationsGetmetadata]
      }
      
      extension [Self <: ParamsResourceUrlnotificationsGetmetadata](x: Self) {
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait ParamsResourceUrlnotificationsPublish
      extends StObject
         with StandardParameters {
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaUrlNotification] = js.undefined
    }
    object ParamsResourceUrlnotificationsPublish {
      
      inline def apply(): ParamsResourceUrlnotificationsPublish = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceUrlnotificationsPublish]
      }
      
      extension [Self <: ParamsResourceUrlnotificationsPublish](x: Self) {
        
        inline def setRequestBody(value: SchemaUrlNotification): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait SchemaPublishUrlNotificationResponse extends StObject {
      
      /**
        * Description of the notification events received for this URL.
        */
      var urlNotificationMetadata: js.UndefOr[SchemaUrlNotificationMetadata] = js.undefined
    }
    object SchemaPublishUrlNotificationResponse {
      
      inline def apply(): SchemaPublishUrlNotificationResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaPublishUrlNotificationResponse]
      }
      
      extension [Self <: SchemaPublishUrlNotificationResponse](x: Self) {
        
        inline def setUrlNotificationMetadata(value: SchemaUrlNotificationMetadata): Self = StObject.set(x, "urlNotificationMetadata", value.asInstanceOf[js.Any])
        
        inline def setUrlNotificationMetadataUndefined: Self = StObject.set(x, "urlNotificationMetadata", js.undefined)
      }
    }
    
    trait SchemaUrlNotification extends StObject {
      
      /**
        * Creation timestamp for this notification. Users should _not_ specify it, the field is ignored at the request time.
        */
      var notifyTime: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The URL life cycle event that Google is being notified about.
        */
      var `type`: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The object of this notification. The URL must be owned by the publisher of this notification and, in case of `URL_UPDATED` notifications, it _must_ be crawlable by Google.
        */
      var url: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaUrlNotification {
      
      inline def apply(): SchemaUrlNotification = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaUrlNotification]
      }
      
      extension [Self <: SchemaUrlNotification](x: Self) {
        
        inline def setNotifyTime(value: String): Self = StObject.set(x, "notifyTime", value.asInstanceOf[js.Any])
        
        inline def setNotifyTimeNull: Self = StObject.set(x, "notifyTime", null)
        
        inline def setNotifyTimeUndefined: Self = StObject.set(x, "notifyTime", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeNull: Self = StObject.set(x, "type", null)
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlNull: Self = StObject.set(x, "url", null)
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait SchemaUrlNotificationMetadata extends StObject {
      
      /**
        * Latest notification received with type `URL_REMOVED`.
        */
      var latestRemove: js.UndefOr[SchemaUrlNotification] = js.undefined
      
      /**
        * Latest notification received with type `URL_UPDATED`.
        */
      var latestUpdate: js.UndefOr[SchemaUrlNotification] = js.undefined
      
      /**
        * URL to which this metadata refers.
        */
      var url: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaUrlNotificationMetadata {
      
      inline def apply(): SchemaUrlNotificationMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaUrlNotificationMetadata]
      }
      
      extension [Self <: SchemaUrlNotificationMetadata](x: Self) {
        
        inline def setLatestRemove(value: SchemaUrlNotification): Self = StObject.set(x, "latestRemove", value.asInstanceOf[js.Any])
        
        inline def setLatestRemoveUndefined: Self = StObject.set(x, "latestRemove", js.undefined)
        
        inline def setLatestUpdate(value: SchemaUrlNotification): Self = StObject.set(x, "latestUpdate", value.asInstanceOf[js.Any])
        
        inline def setLatestUpdateUndefined: Self = StObject.set(x, "latestUpdate", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlNull: Self = StObject.set(x, "url", null)
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * V1 error format.
        */
      @JSName("$.xgafv")
      var $Dotxgafv: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth access token.
        */
      var access_token: js.UndefOr[String] = js.undefined
      
      /**
        * Data format for response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[
            String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
          ] = js.undefined
      
      /**
        * JSONP
        */
      var callback: js.UndefOr[String] = js.undefined
      
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
        * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.undefined
      
      /**
        * Legacy upload protocol for media (e.g. "media", "multipart").
        */
      var uploadType: js.UndefOr[String] = js.undefined
      
      /**
        * Upload protocol for media (e.g. "raw", "multipart").
        */
      var upload_protocol: js.UndefOr[String] = js.undefined
    }
    object StandardParameters {
      
      inline def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      extension [Self <: StandardParameters](x: Self) {
        
        inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
        
        inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
        
        inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setAuth(
          value: String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
        ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
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
        
        inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
        
        inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
        
        inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
        
        inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      }
    }
  }
}
