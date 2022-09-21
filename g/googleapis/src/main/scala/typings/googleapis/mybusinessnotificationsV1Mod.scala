package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v1
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

object mybusinessnotificationsV1Mod {
  
  object mybusinessnotificationsV1 {
    
    @JSImport("googleapis/build/src/apis/mybusinessnotifications/v1", "mybusinessnotifications_v1.Mybusinessnotifications")
    @js.native
    open class Mybusinessnotifications protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var accounts: ResourceAccounts = js.native
      
      var context: APIRequestContext = js.native
    }
    
    @JSImport("googleapis/build/src/apis/mybusinessnotifications/v1", "mybusinessnotifications_v1.Resource$Accounts")
    @js.native
    open class ResourceAccounts protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def getNotificationSetting(): GaxiosPromise[SchemaNotificationSetting] = js.native
      def getNotificationSetting(callback: BodyResponseCallback[SchemaNotificationSetting]): Unit = js.native
      def getNotificationSetting(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNotificationSetting] = js.native
      def getNotificationSetting(params: ParamsResourceAccountsGetnotificationsetting): GaxiosPromise[SchemaNotificationSetting] = js.native
      def getNotificationSetting(
        params: ParamsResourceAccountsGetnotificationsetting,
        callback: BodyResponseCallback[SchemaNotificationSetting]
      ): Unit = js.native
      def getNotificationSetting(
        params: ParamsResourceAccountsGetnotificationsetting,
        options: BodyResponseCallback[Readable | SchemaNotificationSetting],
        callback: BodyResponseCallback[Readable | SchemaNotificationSetting]
      ): Unit = js.native
      def getNotificationSetting(params: ParamsResourceAccountsGetnotificationsetting, options: MethodOptions): GaxiosPromise[SchemaNotificationSetting] = js.native
      def getNotificationSetting(
        params: ParamsResourceAccountsGetnotificationsetting,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaNotificationSetting]
      ): Unit = js.native
      /**
        * Returns the pubsub notification settings for the account.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/mybusinessnotifications.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const mybusinessnotifications = google.mybusinessnotifications('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await mybusinessnotifications.accounts.getNotificationSetting({
        *     // Required. The resource name of the notification setting we are trying to fetch.
        *     name: 'accounts/my-account/notificationSetting',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "name": "my_name",
        *   //   "notificationTypes": [],
        *   //   "pubsubTopic": "my_pubsubTopic"
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
      def getNotificationSetting(params: ParamsResourceAccountsGetnotificationsetting, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def getNotificationSetting(
        params: ParamsResourceAccountsGetnotificationsetting,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def updateNotificationSetting(): GaxiosPromise[SchemaNotificationSetting] = js.native
      def updateNotificationSetting(callback: BodyResponseCallback[SchemaNotificationSetting]): Unit = js.native
      def updateNotificationSetting(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNotificationSetting] = js.native
      def updateNotificationSetting(params: ParamsResourceAccountsUpdatenotificationsetting): GaxiosPromise[SchemaNotificationSetting] = js.native
      def updateNotificationSetting(
        params: ParamsResourceAccountsUpdatenotificationsetting,
        callback: BodyResponseCallback[SchemaNotificationSetting]
      ): Unit = js.native
      def updateNotificationSetting(
        params: ParamsResourceAccountsUpdatenotificationsetting,
        options: BodyResponseCallback[Readable | SchemaNotificationSetting],
        callback: BodyResponseCallback[Readable | SchemaNotificationSetting]
      ): Unit = js.native
      def updateNotificationSetting(params: ParamsResourceAccountsUpdatenotificationsetting, options: MethodOptions): GaxiosPromise[SchemaNotificationSetting] = js.native
      def updateNotificationSetting(
        params: ParamsResourceAccountsUpdatenotificationsetting,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaNotificationSetting]
      ): Unit = js.native
      /**
        * Sets the pubsub notification setting for the account informing Google which topic to send pubsub notifications for. Use the notification_types field within notification_setting to manipulate the events an account wants to subscribe to. An account will only have one notification setting resource, and only one pubsub topic can be set. To delete the setting, update with an empty notification_types
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/mybusinessnotifications.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const mybusinessnotifications = google.mybusinessnotifications('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await mybusinessnotifications.accounts.updateNotificationSetting({
        *     // Required. The resource name this setting is for. This is of the form `accounts/{account_id\}/notificationSetting`.
        *     name: 'accounts/my-account/notificationSetting',
        *     // Required. The specific fields that should be updated. The only editable field is notification_setting.
        *     updateMask: 'placeholder-value',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "name": "my_name",
        *       //   "notificationTypes": [],
        *       //   "pubsubTopic": "my_pubsubTopic"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "name": "my_name",
        *   //   "notificationTypes": [],
        *   //   "pubsubTopic": "my_pubsubTopic"
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
      def updateNotificationSetting(params: ParamsResourceAccountsUpdatenotificationsetting, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def updateNotificationSetting(
        params: ParamsResourceAccountsUpdatenotificationsetting,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceAccountsGetnotificationsetting
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The resource name of the notification setting we are trying to fetch.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceAccountsGetnotificationsetting {
      
      inline def apply(): ParamsResourceAccountsGetnotificationsetting = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceAccountsGetnotificationsetting]
      }
      
      extension [Self <: ParamsResourceAccountsGetnotificationsetting](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait ParamsResourceAccountsUpdatenotificationsetting
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The resource name this setting is for. This is of the form `accounts/{account_id\}/notificationSetting`.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaNotificationSetting] = js.undefined
      
      /**
        * Required. The specific fields that should be updated. The only editable field is notification_setting.
        */
      var updateMask: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceAccountsUpdatenotificationsetting {
      
      inline def apply(): ParamsResourceAccountsUpdatenotificationsetting = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceAccountsUpdatenotificationsetting]
      }
      
      extension [Self <: ParamsResourceAccountsUpdatenotificationsetting](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setRequestBody(value: SchemaNotificationSetting): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
        
        inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
      }
    }
    
    trait SchemaNotificationSetting extends StObject {
      
      /**
        * Required. The resource name this setting is for. This is of the form `accounts/{account_id\}/notificationSetting`.
        */
      var name: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The types of notifications that will be sent to the Pub/Sub topic. To stop receiving notifications entirely, use NotificationSettings.UpdateNotificationSetting with an empty notification_types or set the pubsub_topic to an empty string.
        */
      var notificationTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      /**
        * Optional. The Google Pub/Sub topic that will receive notifications when locations managed by this account are updated. If unset, no notifications will be posted. The account mybusiness-api-pubsub@system.gserviceaccount.com must have at least Publish permissions on the Pub/Sub topic.
        */
      var pubsubTopic: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaNotificationSetting {
      
      inline def apply(): SchemaNotificationSetting = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaNotificationSetting]
      }
      
      extension [Self <: SchemaNotificationSetting](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNotificationTypes(value: js.Array[String]): Self = StObject.set(x, "notificationTypes", value.asInstanceOf[js.Any])
        
        inline def setNotificationTypesNull: Self = StObject.set(x, "notificationTypes", null)
        
        inline def setNotificationTypesUndefined: Self = StObject.set(x, "notificationTypes", js.undefined)
        
        inline def setNotificationTypesVarargs(value: String*): Self = StObject.set(x, "notificationTypes", js.Array(value*))
        
        inline def setPubsubTopic(value: String): Self = StObject.set(x, "pubsubTopic", value.asInstanceOf[js.Any])
        
        inline def setPubsubTopicNull: Self = StObject.set(x, "pubsubTopic", null)
        
        inline def setPubsubTopicUndefined: Self = StObject.set(x, "pubsubTopic", js.undefined)
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
