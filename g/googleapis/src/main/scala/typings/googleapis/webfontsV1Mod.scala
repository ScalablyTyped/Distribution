package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
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

object webfontsV1Mod {
  
  object webfontsV1 {
    
    @JSImport("googleapis/build/src/apis/webfonts/v1", "webfonts_v1.Resource$Webfonts")
    @js.native
    open class ResourceWebfonts protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def list(): GaxiosPromise[SchemaWebfontList] = js.native
      def list(callback: BodyResponseCallback[SchemaWebfontList]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebfontList] = js.native
      def list(params: ParamsResourceWebfontsList): GaxiosPromise[SchemaWebfontList] = js.native
      def list(params: ParamsResourceWebfontsList, callback: BodyResponseCallback[SchemaWebfontList]): Unit = js.native
      def list(
        params: ParamsResourceWebfontsList,
        options: BodyResponseCallback[Readable | SchemaWebfontList],
        callback: BodyResponseCallback[Readable | SchemaWebfontList]
      ): Unit = js.native
      def list(params: ParamsResourceWebfontsList, options: MethodOptions): GaxiosPromise[SchemaWebfontList] = js.native
      def list(
        params: ParamsResourceWebfontsList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaWebfontList]
      ): Unit = js.native
      /**
        * Retrieves the list of fonts currently served by the Google Fonts Developer API.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/webfonts.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const webfonts = google.webfonts('v1');
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
        *   const res = await webfonts.webfonts.list({
        *     // Enables sorting of the list.
        *     sort: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "items": [],
        *   //   "kind": "my_kind"
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
      def list(params: ParamsResourceWebfontsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceWebfontsList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/webfonts/v1", "webfonts_v1.Webfonts")
    @js.native
    open class Webfonts protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var webfonts: ResourceWebfonts = js.native
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
    
    trait ParamsResourceWebfontsList
      extends StObject
         with StandardParameters {
      
      /**
        * Enables sorting of the list.
        */
      var sort: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceWebfontsList {
      
      inline def apply(): ParamsResourceWebfontsList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceWebfontsList]
      }
      
      extension [Self <: ParamsResourceWebfontsList](x: Self) {
        
        inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
        
        inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      }
    }
    
    trait SchemaWebfont extends StObject {
      
      /**
        * The category of the font.
        */
      var category: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The name of the font.
        */
      var family: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The font files (with all supported scripts) for each one of the available variants, as a key : value map.
        */
      var files: js.UndefOr[StringDictionary[String] | Null] = js.undefined
      
      /**
        * This kind represents a webfont object in the webfonts service.
        */
      var kind: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The date (format "yyyy-MM-dd") the font was modified for the last time.
        */
      var lastModified: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The scripts supported by the font.
        */
      var subsets: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      /**
        * The available variants for the font.
        */
      var variants: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      /**
        * The font version.
        */
      var version: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaWebfont {
      
      inline def apply(): SchemaWebfont = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaWebfont]
      }
      
      extension [Self <: SchemaWebfont](x: Self) {
        
        inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        inline def setCategoryNull: Self = StObject.set(x, "category", null)
        
        inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
        
        inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
        
        inline def setFamilyNull: Self = StObject.set(x, "family", null)
        
        inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
        
        inline def setFiles(value: StringDictionary[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
        
        inline def setFilesNull: Self = StObject.set(x, "files", null)
        
        inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindNull: Self = StObject.set(x, "kind", null)
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
        
        inline def setLastModifiedNull: Self = StObject.set(x, "lastModified", null)
        
        inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
        
        inline def setSubsets(value: js.Array[String]): Self = StObject.set(x, "subsets", value.asInstanceOf[js.Any])
        
        inline def setSubsetsNull: Self = StObject.set(x, "subsets", null)
        
        inline def setSubsetsUndefined: Self = StObject.set(x, "subsets", js.undefined)
        
        inline def setSubsetsVarargs(value: String*): Self = StObject.set(x, "subsets", js.Array(value*))
        
        inline def setVariants(value: js.Array[String]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
        
        inline def setVariantsNull: Self = StObject.set(x, "variants", null)
        
        inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
        
        inline def setVariantsVarargs(value: String*): Self = StObject.set(x, "variants", js.Array(value*))
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionNull: Self = StObject.set(x, "version", null)
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    trait SchemaWebfontList extends StObject {
      
      /**
        * The list of fonts currently served by the Google Fonts API.
        */
      var items: js.UndefOr[js.Array[SchemaWebfont]] = js.undefined
      
      /**
        * This kind represents a list of webfont objects in the webfonts service.
        */
      var kind: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaWebfontList {
      
      inline def apply(): SchemaWebfontList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaWebfontList]
      }
      
      extension [Self <: SchemaWebfontList](x: Self) {
        
        inline def setItems(value: js.Array[SchemaWebfont]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: SchemaWebfont*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindNull: Self = StObject.set(x, "kind", null)
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
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
