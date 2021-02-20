package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Accept
import typings.googleapis.anon.DiscoveryLink
import typings.googleapis.anon.Discriminant
import typings.googleapis.anon.Oauth2
import typings.googleapis.anon.ParameterName
import typings.googleapis.anon.Required
import typings.googleapis.anon.X16
import typings.googleapis.anon.`5`
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discoveryV1Mod {
  
  object discoveryV1 {
    
    /**
      * API Discovery Service
      *
      * Provides information about other Google APIs, such as what APIs are
      * available, the resource, and method details for each API.
      *
      * @example
      * const {google} = require('googleapis');
      * const discovery = google.discovery('v1');
      *
      * @namespace discovery
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Discovery
      */
    @JSImport("googleapis/build/src/apis/discovery/v1", "discovery_v1.Discovery")
    @js.native
    class Discovery protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var apis: ResourceApis = js.native
      
      var context: APIRequestContext = js.native
    }
    
    @JSImport("googleapis/build/src/apis/discovery/v1", "discovery_v1.Resource$Apis")
    @js.native
    class ResourceApis protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * discovery.apis.getRest
        * @desc Retrieve the description of a particular version of an api.
        * @alias discovery.apis.getRest
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.api The name of the API.
        * @param {string} params.version The version of the API.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def getRest(): GaxiosPromise[SchemaRestDescription] = js.native
      def getRest(callback: BodyResponseCallback[SchemaRestDescription]): Unit = js.native
      def getRest(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRestDescription] = js.native
      def getRest(params: ParamsResourceApisGetrest): GaxiosPromise[SchemaRestDescription] = js.native
      def getRest(params: ParamsResourceApisGetrest, callback: BodyResponseCallback[SchemaRestDescription]): Unit = js.native
      def getRest(
        params: ParamsResourceApisGetrest,
        options: BodyResponseCallback[SchemaRestDescription],
        callback: BodyResponseCallback[SchemaRestDescription]
      ): Unit = js.native
      def getRest(params: ParamsResourceApisGetrest, options: MethodOptions): GaxiosPromise[SchemaRestDescription] = js.native
      def getRest(
        params: ParamsResourceApisGetrest,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaRestDescription]
      ): Unit = js.native
      
      /**
        * discovery.apis.list
        * @desc Retrieve the list of APIs supported at this endpoint.
        * @alias discovery.apis.list
        * @memberOf! ()
        *
        * @param {object=} params Parameters for request
        * @param {string=} params.name Only include APIs with the given name.
        * @param {boolean=} params.preferred Return only the preferred version of an API.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[SchemaDirectoryList] = js.native
      def list(callback: BodyResponseCallback[SchemaDirectoryList]): Unit = js.native
      def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDirectoryList] = js.native
      def list(params: ParamsResourceApisList): GaxiosPromise[SchemaDirectoryList] = js.native
      def list(params: ParamsResourceApisList, callback: BodyResponseCallback[SchemaDirectoryList]): Unit = js.native
      def list(
        params: ParamsResourceApisList,
        options: BodyResponseCallback[SchemaDirectoryList],
        callback: BodyResponseCallback[SchemaDirectoryList]
      ): Unit = js.native
      def list(params: ParamsResourceApisList, options: MethodOptions): GaxiosPromise[SchemaDirectoryList] = js.native
      def list(
        params: ParamsResourceApisList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaDirectoryList]
      ): Unit = js.native
    }
    
    @js.native
    trait Options extends GlobalOptions {
      
      var version: v1 = js.native
    }
    object Options {
      
      @scala.inline
      def apply(version: v1): Options = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ParamsResourceApisGetrest extends StandardParameters {
      
      /**
        * The name of the API.
        */
      var api: js.UndefOr[String] = js.native
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The version of the API.
        */
      var version: js.UndefOr[String] = js.native
    }
    object ParamsResourceApisGetrest {
      
      @scala.inline
      def apply(): ParamsResourceApisGetrest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceApisGetrest]
      }
      
      @scala.inline
      implicit class ParamsResourceApisGetrestMutableBuilder[Self <: ParamsResourceApisGetrest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceApisList extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Only include APIs with the given name.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * Return only the preferred version of an API.
        */
      var preferred: js.UndefOr[Boolean] = js.native
    }
    object ParamsResourceApisList {
      
      @scala.inline
      def apply(): ParamsResourceApisList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceApisList]
      }
      
      @scala.inline
      implicit class ParamsResourceApisListMutableBuilder[Self <: ParamsResourceApisList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
      }
    }
    
    @js.native
    trait SchemaDirectoryList extends StObject {
      
      /**
        * Indicate the version of the Discovery API used to generate this doc.
        */
      var discoveryVersion: js.UndefOr[String] = js.native
      
      /**
        * The individual directory entries. One entry per api/version pair.
        */
      var items: js.UndefOr[js.Array[DiscoveryLink]] = js.native
      
      /**
        * The kind for this response.
        */
      var kind: js.UndefOr[String] = js.native
    }
    object SchemaDirectoryList {
      
      @scala.inline
      def apply(): SchemaDirectoryList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaDirectoryList]
      }
      
      @scala.inline
      implicit class SchemaDirectoryListMutableBuilder[Self <: SchemaDirectoryList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDiscoveryVersion(value: String): Self = StObject.set(x, "discoveryVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDiscoveryVersionUndefined: Self = StObject.set(x, "discoveryVersion", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[DiscoveryLink]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: DiscoveryLink*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    @js.native
    trait SchemaJsonSchema extends StObject {
      
      /**
        * The default value of this property (if one exists).
        */
      var default: js.UndefOr[String] = js.native
      
      /**
        * A reference to another schema. The value of this property is the
        * &quot;id&quot; of another schema.
        */
      @JSName("$ref")
      var $ref: js.UndefOr[String] = js.native
      
      /**
        * If this is a schema for an object, this property is the schema for any
        * additional properties with dynamic keys on this object.
        */
      var additionalProperties: js.UndefOr[SchemaJsonSchema] = js.native
      
      /**
        * Additional information about this property.
        */
      var annotations: js.UndefOr[Required] = js.native
      
      /**
        * A description of this object.
        */
      var description: js.UndefOr[String] = js.native
      
      /**
        * Values this parameter may take (if it is an enum).
        */
      var enum: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * The descriptions for the enums. Each position maps to the corresponding
        * value in the &quot;enum&quot; array.
        */
      var enumDescriptions: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * An additional regular expression or key that helps constrain the value.
        * For more details see:
        * http://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.23
        */
      var format: js.UndefOr[String] = js.native
      
      /**
        * Unique identifier for this schema.
        */
      var id: js.UndefOr[String] = js.native
      
      /**
        * If this is a schema for an array, this property is the schema for each
        * element in the array.
        */
      var items: js.UndefOr[SchemaJsonSchema] = js.native
      
      /**
        * Whether this parameter goes in the query or the path for REST requests.
        */
      var location: js.UndefOr[String] = js.native
      
      /**
        * The maximum value of this parameter.
        */
      var maximum: js.UndefOr[String] = js.native
      
      /**
        * The minimum value of this parameter.
        */
      var minimum: js.UndefOr[String] = js.native
      
      /**
        * The regular expression this parameter must conform to. Uses Java 6 regex
        * format:
        * http://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html
        */
      var pattern: js.UndefOr[String] = js.native
      
      /**
        * If this is a schema for an object, list the schema for each property of
        * this object.
        */
      var properties: js.UndefOr[StringDictionary[SchemaJsonSchema]] = js.native
      
      /**
        * The value is read-only, generated by the service. The value cannot be
        * modified by the client. If the value is included in a POST, PUT, or PATCH
        * request, it is ignored by the service.
        */
      var readOnly: js.UndefOr[Boolean] = js.native
      
      /**
        * Whether this parameter may appear multiple times.
        */
      var repeated: js.UndefOr[Boolean] = js.native
      
      /**
        * Whether the parameter is required.
        */
      var required: js.UndefOr[Boolean] = js.native
      
      /**
        * The value type for this schema. A list of values can be found here:
        * http://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.1
        */
      var `type`: js.UndefOr[String] = js.native
      
      /**
        * In a variant data type, the value of one property is used to determine
        * how to interpret the entire entity. Its value must exist in a map of
        * descriminant values to schema names.
        */
      var variant: js.UndefOr[Discriminant] = js.native
    }
    object SchemaJsonSchema {
      
      @scala.inline
      def apply(): SchemaJsonSchema = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaJsonSchema]
      }
      
      @scala.inline
      implicit class SchemaJsonSchemaMutableBuilder[Self <: SchemaJsonSchema] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
        
        @scala.inline
        def setAdditionalProperties(value: SchemaJsonSchema): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
        
        @scala.inline
        def setAnnotations(value: Required): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
        
        @scala.inline
        def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnumDescriptions(value: js.Array[String]): Self = StObject.set(x, "enumDescriptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnumDescriptionsUndefined: Self = StObject.set(x, "enumDescriptions", js.undefined)
        
        @scala.inline
        def setEnumDescriptionsVarargs(value: String*): Self = StObject.set(x, "enumDescriptions", js.Array(value :_*))
        
        @scala.inline
        def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
        
        @scala.inline
        def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
        
        @scala.inline
        def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setItems(value: SchemaJsonSchema): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setMaximum(value: String): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
        
        @scala.inline
        def setMinimum(value: String): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
        
        @scala.inline
        def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        
        @scala.inline
        def setProperties(value: StringDictionary[SchemaJsonSchema]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        
        @scala.inline
        def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
        
        @scala.inline
        def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRepeatedUndefined: Self = StObject.set(x, "repeated", js.undefined)
        
        @scala.inline
        def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setVariant(value: Discriminant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      }
    }
    
    @js.native
    trait SchemaRestDescription extends StObject {
      
      /**
        * Authentication information.
        */
      var auth: js.UndefOr[Oauth2] = js.native
      
      /**
        * [DEPRECATED] The base path for REST requests.
        */
      var basePath: js.UndefOr[String] = js.native
      
      /**
        * [DEPRECATED] The base URL for REST requests.
        */
      var baseUrl: js.UndefOr[String] = js.native
      
      /**
        * The path for REST batch requests.
        */
      var batchPath: js.UndefOr[String] = js.native
      
      /**
        * Indicates how the API name should be capitalized and split into various
        * parts. Useful for generating pretty class names.
        */
      var canonicalName: js.UndefOr[String] = js.native
      
      /**
        * The description of this API.
        */
      var description: js.UndefOr[String] = js.native
      
      /**
        * Indicate the version of the Discovery API used to generate this doc.
        */
      var discoveryVersion: js.UndefOr[String] = js.native
      
      /**
        * A link to human readable documentation for the API.
        */
      var documentationLink: js.UndefOr[String] = js.native
      
      /**
        * The ETag for this response.
        */
      var etag: js.UndefOr[String] = js.native
      
      /**
        * Enable exponential backoff for suitable methods in the generated clients.
        */
      var exponentialBackoffDefault: js.UndefOr[Boolean] = js.native
      
      /**
        * A list of supported features for this API.
        */
      var features: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * Links to 16x16 and 32x32 icons representing the API.
        */
      var icons: js.UndefOr[X16] = js.native
      
      /**
        * The ID of this API.
        */
      var id: js.UndefOr[String] = js.native
      
      /**
        * The kind for this response.
        */
      var kind: js.UndefOr[String] = js.native
      
      /**
        * Labels for the status of this API, such as labs or deprecated.
        */
      var labels: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * API-level methods for this API.
        */
      var methods: js.UndefOr[StringDictionary[SchemaRestMethod]] = js.native
      
      /**
        * The name of this API.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * The domain of the owner of this API. Together with the ownerName and a
        * packagePath values, this can be used to generate a library for this API
        * which would have a unique fully qualified name.
        */
      var ownerDomain: js.UndefOr[String] = js.native
      
      /**
        * The name of the owner of this API. See ownerDomain.
        */
      var ownerName: js.UndefOr[String] = js.native
      
      /**
        * The package of the owner of this API. See ownerDomain.
        */
      var packagePath: js.UndefOr[String] = js.native
      
      /**
        * Common parameters that apply across all apis.
        */
      var parameters: js.UndefOr[StringDictionary[SchemaJsonSchema]] = js.native
      
      /**
        * The protocol described by this document.
        */
      var protocol: js.UndefOr[String] = js.native
      
      /**
        * The resources in this API.
        */
      var resources: js.UndefOr[StringDictionary[SchemaRestResource]] = js.native
      
      /**
        * The version of this API.
        */
      var revision: js.UndefOr[String] = js.native
      
      /**
        * The root URL under which all API services live.
        */
      var rootUrl: js.UndefOr[String] = js.native
      
      /**
        * The schemas for this API.
        */
      var schemas: js.UndefOr[StringDictionary[SchemaJsonSchema]] = js.native
      
      /**
        * The base path for all REST requests.
        */
      var servicePath: js.UndefOr[String] = js.native
      
      /**
        * The title of this API.
        */
      var title: js.UndefOr[String] = js.native
      
      /**
        * The version of this API.
        */
      var version: js.UndefOr[String] = js.native
      
      var version_module: js.UndefOr[Boolean] = js.native
    }
    object SchemaRestDescription {
      
      @scala.inline
      def apply(): SchemaRestDescription = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaRestDescription]
      }
      
      @scala.inline
      implicit class SchemaRestDescriptionMutableBuilder[Self <: SchemaRestDescription] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: Oauth2): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
        
        @scala.inline
        def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
        
        @scala.inline
        def setBatchPath(value: String): Self = StObject.set(x, "batchPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBatchPathUndefined: Self = StObject.set(x, "batchPath", js.undefined)
        
        @scala.inline
        def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCanonicalNameUndefined: Self = StObject.set(x, "canonicalName", js.undefined)
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setDiscoveryVersion(value: String): Self = StObject.set(x, "discoveryVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDiscoveryVersionUndefined: Self = StObject.set(x, "discoveryVersion", js.undefined)
        
        @scala.inline
        def setDocumentationLink(value: String): Self = StObject.set(x, "documentationLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDocumentationLinkUndefined: Self = StObject.set(x, "documentationLink", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setExponentialBackoffDefault(value: Boolean): Self = StObject.set(x, "exponentialBackoffDefault", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExponentialBackoffDefaultUndefined: Self = StObject.set(x, "exponentialBackoffDefault", js.undefined)
        
        @scala.inline
        def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
        
        @scala.inline
        def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
        
        @scala.inline
        def setIcons(value: X16): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        @scala.inline
        def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
        
        @scala.inline
        def setMethods(value: StringDictionary[SchemaRestMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setOwnerDomain(value: String): Self = StObject.set(x, "ownerDomain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOwnerDomainUndefined: Self = StObject.set(x, "ownerDomain", js.undefined)
        
        @scala.inline
        def setOwnerName(value: String): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOwnerNameUndefined: Self = StObject.set(x, "ownerName", js.undefined)
        
        @scala.inline
        def setPackagePath(value: String): Self = StObject.set(x, "packagePath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPackagePathUndefined: Self = StObject.set(x, "packagePath", js.undefined)
        
        @scala.inline
        def setParameters(value: StringDictionary[SchemaJsonSchema]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
        
        @scala.inline
        def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
        
        @scala.inline
        def setResources(value: StringDictionary[SchemaRestResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
        
        @scala.inline
        def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
        
        @scala.inline
        def setRootUrl(value: String): Self = StObject.set(x, "rootUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRootUrlUndefined: Self = StObject.set(x, "rootUrl", js.undefined)
        
        @scala.inline
        def setSchemas(value: StringDictionary[SchemaJsonSchema]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
        
        @scala.inline
        def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServicePathUndefined: Self = StObject.set(x, "servicePath", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
        
        @scala.inline
        def setVersion_module(value: Boolean): Self = StObject.set(x, "version_module", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersion_moduleUndefined: Self = StObject.set(x, "version_module", js.undefined)
      }
    }
    
    @js.native
    trait SchemaRestMethod extends StObject {
      
      /**
        * Description of this method.
        */
      var description: js.UndefOr[String] = js.native
      
      /**
        * Whether this method requires an ETag to be specified. The ETag is sent as
        * an HTTP If-Match or If-None-Match header.
        */
      var etagRequired: js.UndefOr[Boolean] = js.native
      
      /**
        * HTTP method used by this method.
        */
      var httpMethod: js.UndefOr[String] = js.native
      
      /**
        * A unique ID for this method. This property can be used to match methods
        * between different versions of Discovery.
        */
      var id: js.UndefOr[String] = js.native
      
      /**
        * Media upload parameters.
        */
      var mediaUpload: js.UndefOr[Accept] = js.native
      
      /**
        * Ordered list of required parameters, serves as a hint to clients on how
        * to structure their method signatures. The array is ordered such that the
        * &quot;most-significant&quot; parameter appears first.
        */
      var parameterOrder: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * Details for all parameters in this method.
        */
      var parameters: js.UndefOr[StringDictionary[SchemaJsonSchema]] = js.native
      
      /**
        * The URI path of this REST method. Should be used in conjunction with the
        * basePath property at the api-level.
        */
      var path: js.UndefOr[String] = js.native
      
      /**
        * The schema for the request.
        */
      var request: js.UndefOr[ParameterName] = js.native
      
      /**
        * The schema for the response.
        */
      var response: js.UndefOr[`5`] = js.native
      
      /**
        * OAuth 2.0 scopes applicable to this method.
        */
      var scopes: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * Whether this method supports media downloads.
        */
      var supportsMediaDownload: js.UndefOr[Boolean] = js.native
      
      /**
        * Whether this method supports media uploads.
        */
      var supportsMediaUpload: js.UndefOr[Boolean] = js.native
      
      /**
        * Whether this method supports subscriptions.
        */
      var supportsSubscription: js.UndefOr[Boolean] = js.native
      
      /**
        * Indicates that downloads from this method should use the download service
        * URL (i.e. &quot;/download&quot;). Only applies if the method supports
        * media download.
        */
      var useMediaDownloadService: js.UndefOr[Boolean] = js.native
    }
    object SchemaRestMethod {
      
      @scala.inline
      def apply(): SchemaRestMethod = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaRestMethod]
      }
      
      @scala.inline
      implicit class SchemaRestMethodMutableBuilder[Self <: SchemaRestMethod] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setEtagRequired(value: Boolean): Self = StObject.set(x, "etagRequired", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagRequiredUndefined: Self = StObject.set(x, "etagRequired", js.undefined)
        
        @scala.inline
        def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setMediaUpload(value: Accept): Self = StObject.set(x, "mediaUpload", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMediaUploadUndefined: Self = StObject.set(x, "mediaUpload", js.undefined)
        
        @scala.inline
        def setParameterOrder(value: js.Array[String]): Self = StObject.set(x, "parameterOrder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParameterOrderUndefined: Self = StObject.set(x, "parameterOrder", js.undefined)
        
        @scala.inline
        def setParameterOrderVarargs(value: String*): Self = StObject.set(x, "parameterOrder", js.Array(value :_*))
        
        @scala.inline
        def setParameters(value: StringDictionary[SchemaJsonSchema]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setRequest(value: ParameterName): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
        
        @scala.inline
        def setResponse(value: `5`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
        
        @scala.inline
        def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
        
        @scala.inline
        def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
        
        @scala.inline
        def setSupportsMediaDownload(value: Boolean): Self = StObject.set(x, "supportsMediaDownload", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSupportsMediaDownloadUndefined: Self = StObject.set(x, "supportsMediaDownload", js.undefined)
        
        @scala.inline
        def setSupportsMediaUpload(value: Boolean): Self = StObject.set(x, "supportsMediaUpload", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSupportsMediaUploadUndefined: Self = StObject.set(x, "supportsMediaUpload", js.undefined)
        
        @scala.inline
        def setSupportsSubscription(value: Boolean): Self = StObject.set(x, "supportsSubscription", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSupportsSubscriptionUndefined: Self = StObject.set(x, "supportsSubscription", js.undefined)
        
        @scala.inline
        def setUseMediaDownloadService(value: Boolean): Self = StObject.set(x, "useMediaDownloadService", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseMediaDownloadServiceUndefined: Self = StObject.set(x, "useMediaDownloadService", js.undefined)
      }
    }
    
    @js.native
    trait SchemaRestResource extends StObject {
      
      /**
        * Methods on this resource.
        */
      var methods: js.UndefOr[StringDictionary[SchemaRestMethod]] = js.native
      
      /**
        * Sub-resources on this resource.
        */
      var resources: js.UndefOr[StringDictionary[SchemaRestResource]] = js.native
    }
    object SchemaRestResource {
      
      @scala.inline
      def apply(): SchemaRestResource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaRestResource]
      }
      
      @scala.inline
      implicit class SchemaRestResourceMutableBuilder[Self <: SchemaRestResource] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMethods(value: StringDictionary[SchemaRestMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
        
        @scala.inline
        def setResources(value: StringDictionary[SchemaRestResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      }
    }
    
    @js.native
    trait StandardParameters extends StObject {
      
      /**
        * Data format for the response.
        */
      var alt: js.UndefOr[String] = js.native
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.native
      
      /**
        * API key. Your API key identifies your project and provides you with API
        * access, quota, and reports. Required unless you provide an OAuth 2.0
        * token.
        */
      var key: js.UndefOr[String] = js.native
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.native
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.native
      
      /**
        * An opaque string that represents a user for quota purposes. Must not
        * exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.native
      
      /**
        * Deprecated. Please use quotaUser instead.
        */
      var userIp: js.UndefOr[String] = js.native
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
        def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
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
        def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
      }
    }
  }
}
