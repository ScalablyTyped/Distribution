package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.anon.Body
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

object playcustomappV1Mod {
  
  object playcustomappV1 {
    
    @JSImport("googleapis/build/src/apis/playcustomapp/v1", "playcustomapp_v1.Playcustomapp")
    @js.native
    open class Playcustomapp protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var accounts: ResourceAccounts = js.native
      
      var context: APIRequestContext = js.native
    }
    
    @JSImport("googleapis/build/src/apis/playcustomapp/v1", "playcustomapp_v1.Resource$Accounts")
    @js.native
    open class ResourceAccounts protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var customApps: ResourceAccountsCustomapps = js.native
    }
    
    @JSImport("googleapis/build/src/apis/playcustomapp/v1", "playcustomapp_v1.Resource$Accounts$Customapps")
    @js.native
    open class ResourceAccountsCustomapps protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def create(): GaxiosPromise[SchemaCustomApp] = js.native
      def create(callback: BodyResponseCallback[SchemaCustomApp]): Unit = js.native
      def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomApp] = js.native
      def create(params: ParamsResourceAccountsCustomappsCreate): GaxiosPromise[SchemaCustomApp] = js.native
      def create(params: ParamsResourceAccountsCustomappsCreate, callback: BodyResponseCallback[SchemaCustomApp]): Unit = js.native
      def create(
        params: ParamsResourceAccountsCustomappsCreate,
        options: BodyResponseCallback[Readable | SchemaCustomApp],
        callback: BodyResponseCallback[Readable | SchemaCustomApp]
      ): Unit = js.native
      def create(params: ParamsResourceAccountsCustomappsCreate, options: MethodOptions): GaxiosPromise[SchemaCustomApp] = js.native
      def create(
        params: ParamsResourceAccountsCustomappsCreate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaCustomApp]
      ): Unit = js.native
      /**
        * Creates a new custom app.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/playcustomapp.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const playcustomapp = google.playcustomapp('v1');
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
        *   const res = await playcustomapp.accounts.customApps.create({
        *     // Developer account ID.
        *     account: 'placeholder-value',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "languageCode": "my_languageCode",
        *       //   "organizations": [],
        *       //   "packageName": "my_packageName",
        *       //   "title": "my_title"
        *       // }
        *     },
        *     media: {
        *       mimeType: 'placeholder-value',
        *       body: 'placeholder-value',
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "languageCode": "my_languageCode",
        *   //   "organizations": [],
        *   //   "packageName": "my_packageName",
        *   //   "title": "my_title"
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
      def create(params: ParamsResourceAccountsCustomappsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def create(
        params: ParamsResourceAccountsCustomappsCreate,
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
    
    trait ParamsResourceAccountsCustomappsCreate
      extends StObject
         with StandardParameters {
      
      /**
        * Developer account ID.
        */
      var account: js.UndefOr[String] = js.undefined
      
      /**
        * Media metadata
        */
      var media: js.UndefOr[Body] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaCustomApp] = js.undefined
    }
    object ParamsResourceAccountsCustomappsCreate {
      
      inline def apply(): ParamsResourceAccountsCustomappsCreate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceAccountsCustomappsCreate]
      }
      
      extension [Self <: ParamsResourceAccountsCustomappsCreate](x: Self) {
        
        inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
        
        inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
        
        inline def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
        
        inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
        
        inline def setRequestBody(value: SchemaCustomApp): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait SchemaCustomApp extends StObject {
      
      /**
        * Default listing language in BCP 47 format.
        */
      var languageCode: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Organizations to which the custom app should be made available. If the request contains any organizations, then the app will be restricted to only these organizations. To support the organization linked to the developer account, the organization ID should be provided explicitly together with other organizations. If no organizations are provided, then the app is only available to the organization linked to the developer account.
        */
      var organizations: js.UndefOr[js.Array[SchemaOrganization]] = js.undefined
      
      /**
        * Output only. Package name of the created Android app. Only present in the API response.
        */
      var packageName: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Title for the Android app.
        */
      var title: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaCustomApp {
      
      inline def apply(): SchemaCustomApp = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaCustomApp]
      }
      
      extension [Self <: SchemaCustomApp](x: Self) {
        
        inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
        
        inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
        
        inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
        
        inline def setOrganizations(value: js.Array[SchemaOrganization]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
        
        inline def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
        
        inline def setOrganizationsVarargs(value: SchemaOrganization*): Self = StObject.set(x, "organizations", js.Array(value*))
        
        inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
        
        inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
        
        inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleNull: Self = StObject.set(x, "title", null)
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait SchemaOrganization extends StObject {
      
      /**
        * Required. ID of the organization.
        */
      var organizationId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Optional. A human-readable name of the organization, to help recognize the organization.
        */
      var organizationName: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaOrganization {
      
      inline def apply(): SchemaOrganization = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaOrganization]
      }
      
      extension [Self <: SchemaOrganization](x: Self) {
        
        inline def setOrganizationId(value: String): Self = StObject.set(x, "organizationId", value.asInstanceOf[js.Any])
        
        inline def setOrganizationIdNull: Self = StObject.set(x, "organizationId", null)
        
        inline def setOrganizationIdUndefined: Self = StObject.set(x, "organizationId", js.undefined)
        
        inline def setOrganizationName(value: String): Self = StObject.set(x, "organizationName", value.asInstanceOf[js.Any])
        
        inline def setOrganizationNameNull: Self = StObject.set(x, "organizationName", null)
        
        inline def setOrganizationNameUndefined: Self = StObject.set(x, "organizationName", js.undefined)
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
