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

object kgsearchV1Mod {
  
  object kgsearchV1 {
    
    @JSImport("googleapis/build/src/apis/kgsearch/v1", "kgsearch_v1.Kgsearch")
    @js.native
    open class Kgsearch protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var entities: ResourceEntities = js.native
    }
    
    @JSImport("googleapis/build/src/apis/kgsearch/v1", "kgsearch_v1.Resource$Entities")
    @js.native
    open class ResourceEntities protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def search(): GaxiosPromise[SchemaSearchResponse] = js.native
      def search(callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
      def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
      def search(params: ParamsResourceEntitiesSearch): GaxiosPromise[SchemaSearchResponse] = js.native
      def search(params: ParamsResourceEntitiesSearch, callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
      def search(
        params: ParamsResourceEntitiesSearch,
        options: BodyResponseCallback[Readable | SchemaSearchResponse],
        callback: BodyResponseCallback[Readable | SchemaSearchResponse]
      ): Unit = js.native
      def search(params: ParamsResourceEntitiesSearch, options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
      def search(
        params: ParamsResourceEntitiesSearch,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSearchResponse]
      ): Unit = js.native
      /**
        * Searches Knowledge Graph for entities that match the constraints. A list of matched entities will be returned in response, which will be in JSON-LD format and compatible with http://schema.org
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/kgsearch.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const kgsearch = google.kgsearch('v1');
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
        *   const res = await kgsearch.entities.search({
        *     // The list of entity id to be used for search instead of query string. To specify multiple ids in the HTTP request, repeat the parameter in the URL as in ...?ids=A&ids=B
        *     ids: 'placeholder-value',
        *     // Enables indenting of json results.
        *     indent: 'placeholder-value',
        *     // The list of language codes (defined in ISO 693) to run the query with, e.g. 'en'.
        *     languages: 'placeholder-value',
        *     // Limits the number of entities to be returned.
        *     limit: 'placeholder-value',
        *     // Enables prefix match against names and aliases of entities
        *     prefix: 'placeholder-value',
        *     // The literal query string for search.
        *     query: 'placeholder-value',
        *     // Restricts returned entities with these types, e.g. Person (as defined in http://schema.org/Person). If multiple types are specified, returned entities will contain one or more of these types.
        *     types: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "@context": {},
        *   //   "@type": {},
        *   //   "itemListElement": []
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
      def search(params: ParamsResourceEntitiesSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def search(
        params: ParamsResourceEntitiesSearch,
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
    
    trait ParamsResourceEntitiesSearch
      extends StObject
         with StandardParameters {
      
      /**
        * The list of entity id to be used for search instead of query string. To specify multiple ids in the HTTP request, repeat the parameter in the URL as in ...?ids=A&ids=B
        */
      var ids: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Enables indenting of json results.
        */
      var indent: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The list of language codes (defined in ISO 693) to run the query with, e.g. 'en'.
        */
      var languages: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Limits the number of entities to be returned.
        */
      var limit: js.UndefOr[Double] = js.undefined
      
      /**
        * Enables prefix match against names and aliases of entities
        */
      var prefix: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The literal query string for search.
        */
      var query: js.UndefOr[String] = js.undefined
      
      /**
        * Restricts returned entities with these types, e.g. Person (as defined in http://schema.org/Person). If multiple types are specified, returned entities will contain one or more of these types.
        */
      var types: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ParamsResourceEntitiesSearch {
      
      inline def apply(): ParamsResourceEntitiesSearch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceEntitiesSearch]
      }
      
      extension [Self <: ParamsResourceEntitiesSearch](x: Self) {
        
        inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
        
        inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
        
        inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
        
        inline def setIndent(value: Boolean): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
        
        inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
        
        inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
        
        inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
        
        inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value*))
        
        inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        inline def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
        
        inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
        
        inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
        
        inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
      }
    }
    
    trait SchemaSearchResponse extends StObject {
      
      /**
        * The local context applicable for the response. See more details at http://www.w3.org/TR/json-ld/#context-definitions.
        */
      var `@context`: js.UndefOr[Any | Null] = js.undefined
      
      /**
        * The schema type of top-level JSON-LD object, e.g. ItemList.
        */
      var `@type`: js.UndefOr[Any | Null] = js.undefined
      
      /**
        * The item list of search results.
        */
      var itemListElement: js.UndefOr[js.Array[Any] | Null] = js.undefined
    }
    object SchemaSearchResponse {
      
      inline def apply(): SchemaSearchResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSearchResponse]
      }
      
      extension [Self <: SchemaSearchResponse](x: Self) {
        
        inline def `set@context`(value: Any): Self = StObject.set(x, "@context", value.asInstanceOf[js.Any])
        
        inline def `set@contextNull`: Self = StObject.set(x, "@context", null)
        
        inline def `set@contextUndefined`: Self = StObject.set(x, "@context", js.undefined)
        
        inline def `set@type`(value: Any): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
        
        inline def `set@typeNull`: Self = StObject.set(x, "@type", null)
        
        inline def `set@typeUndefined`: Self = StObject.set(x, "@type", js.undefined)
        
        inline def setItemListElement(value: js.Array[Any]): Self = StObject.set(x, "itemListElement", value.asInstanceOf[js.Any])
        
        inline def setItemListElementNull: Self = StObject.set(x, "itemListElement", null)
        
        inline def setItemListElementUndefined: Self = StObject.set(x, "itemListElement", js.undefined)
        
        inline def setItemListElementVarargs(value: Any*): Self = StObject.set(x, "itemListElement", js.Array(value*))
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
