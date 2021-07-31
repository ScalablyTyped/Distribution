package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kgsearchV1Mod {
  
  object kgsearchV1 {
    
    /**
      * Knowledge Graph Search API
      *
      * Searches the Google Knowledge Graph for entities.
      *
      * @example
      * const {google} = require('googleapis');
      * const kgsearch = google.kgsearch('v1');
      *
      * @namespace kgsearch
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Kgsearch
      */
    @JSImport("googleapis/build/src/apis/kgsearch/v1", "kgsearch_v1.Kgsearch")
    @js.native
    class Kgsearch protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var entities: ResourceEntities = js.native
    }
    
    @JSImport("googleapis/build/src/apis/kgsearch/v1", "kgsearch_v1.Resource$Entities")
    @js.native
    class ResourceEntities protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * kgsearch.entities.search
        * @desc Searches Knowledge Graph for entities that match the constraints. A
        * list of matched entities will be returned in response, which will be in
        * JSON-LD format and compatible with http://schema.org
        * @alias kgsearch.entities.search
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string=} params.ids The list of entity id to be used for search instead of query string. To specify multiple ids in the HTTP request, repeat the parameter in the URL as in ...?ids=A&ids=B
        * @param {boolean=} params.indent Enables indenting of json results.
        * @param {string=} params.languages The list of language codes (defined in ISO 693) to run the query with, e.g. 'en'.
        * @param {integer=} params.limit Limits the number of entities to be returned.
        * @param {boolean=} params.prefix Enables prefix match against names and aliases of entities
        * @param {string=} params.query The literal query string for search.
        * @param {string=} params.types Restricts returned entities with these types, e.g. Person (as defined in http://schema.org/Person). If multiple types are specified, returned entities will contain one or more of these types.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def search(): GaxiosPromise[SchemaSearchResponse] = js.native
      def search(callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
      def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
      def search(params: ParamsResourceEntitiesSearch): GaxiosPromise[SchemaSearchResponse] = js.native
      def search(params: ParamsResourceEntitiesSearch, callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
      def search(
        params: ParamsResourceEntitiesSearch,
        options: BodyResponseCallback[SchemaSearchResponse],
        callback: BodyResponseCallback[SchemaSearchResponse]
      ): Unit = js.native
      def search(params: ParamsResourceEntitiesSearch, options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
      def search(
        params: ParamsResourceEntitiesSearch,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSearchResponse]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1")
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceEntitiesSearch
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * The list of entity id to be used for search instead of query string. To
        * specify multiple ids in the HTTP request, repeat the parameter in the URL
        * as in ...?ids=A&ids=B
        */
      var ids: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Enables indenting of json results.
        */
      var indent: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The list of language codes (defined in ISO 693) to run the query with,
        * e.g. 'en'.
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
        * Restricts returned entities with these types, e.g. Person (as defined in
        * http://schema.org/Person). If multiple types are specified, returned
        * entities will contain one or more of these types.
        */
      var types: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ParamsResourceEntitiesSearch {
      
      @scala.inline
      def apply(): ParamsResourceEntitiesSearch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceEntitiesSearch]
      }
      
      @scala.inline
      implicit class ParamsResourceEntitiesSearchMutableBuilder[Self <: ParamsResourceEntitiesSearch] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
        
        @scala.inline
        def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
        
        @scala.inline
        def setIndent(value: Boolean): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
        
        @scala.inline
        def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
        
        @scala.inline
        def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
        
        @scala.inline
        def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        @scala.inline
        def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        @scala.inline
        def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
        
        @scala.inline
        def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
        
        @scala.inline
        def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
      }
    }
    
    /**
      * Response message includes the context and a list of matching results which
      * contain the detail of associated entities.
      */
    trait SchemaSearchResponse extends StObject {
      
      /**
        * The local context applicable for the response. See more details at
        * http://www.w3.org/TR/json-ld/#context-definitions.
        */
      var `@context`: js.UndefOr[js.Any] = js.undefined
      
      /**
        * The schema type of top-level JSON-LD object, e.g. ItemList.
        */
      var `@type`: js.UndefOr[js.Any] = js.undefined
      
      /**
        * The item list of search results.
        */
      var itemListElement: js.UndefOr[js.Array[js.Any]] = js.undefined
    }
    object SchemaSearchResponse {
      
      @scala.inline
      def apply(): SchemaSearchResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSearchResponse]
      }
      
      @scala.inline
      implicit class SchemaSearchResponseMutableBuilder[Self <: SchemaSearchResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def `set@context`(value: js.Any): Self = StObject.set(x, "@context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `set@contextUndefined`: Self = StObject.set(x, "@context", js.undefined)
        
        @scala.inline
        def `set@type`(value: js.Any): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `set@typeUndefined`: Self = StObject.set(x, "@type", js.undefined)
        
        @scala.inline
        def setItemListElement(value: js.Array[js.Any]): Self = StObject.set(x, "itemListElement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemListElementUndefined: Self = StObject.set(x, "itemListElement", js.undefined)
        
        @scala.inline
        def setItemListElementVarargs(value: js.Any*): Self = StObject.set(x, "itemListElement", js.Array(value :_*))
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
        * JSONP
        */
      var callback: js.UndefOr[String] = js.undefined
      
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
        * Available to use for quota purposes for server-side applications. Can be
        * any arbitrary string assigned to a user, but should not exceed 40
        * characters.
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
      
      @scala.inline
      def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      @scala.inline
      implicit class StandardParametersMutableBuilder[Self <: StandardParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
        
        @scala.inline
        def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        @scala.inline
        def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        @scala.inline
        def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        @scala.inline
        def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        @scala.inline
        def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        @scala.inline
        def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
        
        @scala.inline
        def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      }
    }
  }
}
