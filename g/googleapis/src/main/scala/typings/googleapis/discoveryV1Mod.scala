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
      def getRest(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRestDescription] = js.native
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
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDirectoryList] = js.native
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
    
    trait ParamsResourceApisGetrest
      extends StObject
         with StandardParameters {
      
      /**
        * The name of the API.
        */
      var api: js.UndefOr[String] = js.undefined
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * The version of the API.
        */
      var version: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceApisGetrest {
      
      inline def apply(): ParamsResourceApisGetrest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceApisGetrest]
      }
      
      extension [Self <: ParamsResourceApisGetrest](x: Self) {
        
        inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
        
        inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    trait ParamsResourceApisList
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Only include APIs with the given name.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Return only the preferred version of an API.
        */
      var preferred: js.UndefOr[Boolean] = js.undefined
    }
    object ParamsResourceApisList {
      
      inline def apply(): ParamsResourceApisList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceApisList]
      }
      
      extension [Self <: ParamsResourceApisList](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
        
        inline def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
      }
    }
    
    trait SchemaDirectoryList extends StObject {
      
      /**
        * Indicate the version of the Discovery API used to generate this doc.
        */
      var discoveryVersion: js.UndefOr[String] = js.undefined
      
      /**
        * The individual directory entries. One entry per api/version pair.
        */
      var items: js.UndefOr[js.Array[DiscoveryLink]] = js.undefined
      
      /**
        * The kind for this response.
        */
      var kind: js.UndefOr[String] = js.undefined
    }
    object SchemaDirectoryList {
      
      inline def apply(): SchemaDirectoryList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaDirectoryList]
      }
      
      extension [Self <: SchemaDirectoryList](x: Self) {
        
        inline def setDiscoveryVersion(value: String): Self = StObject.set(x, "discoveryVersion", value.asInstanceOf[js.Any])
        
        inline def setDiscoveryVersionUndefined: Self = StObject.set(x, "discoveryVersion", js.undefined)
        
        inline def setItems(value: js.Array[DiscoveryLink]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: DiscoveryLink*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait SchemaJsonSchema extends StObject {
      
      /**
        * The default value of this property (if one exists).
        */
      var default: js.UndefOr[String] = js.undefined
      
      /**
        * A reference to another schema. The value of this property is the
        * &quot;id&quot; of another schema.
        */
      @JSName("$ref")
      var $ref: js.UndefOr[String] = js.undefined
      
      /**
        * If this is a schema for an object, this property is the schema for any
        * additional properties with dynamic keys on this object.
        */
      var additionalProperties: js.UndefOr[SchemaJsonSchema] = js.undefined
      
      /**
        * Additional information about this property.
        */
      var annotations: js.UndefOr[Required] = js.undefined
      
      /**
        * A description of this object.
        */
      var description: js.UndefOr[String] = js.undefined
      
      /**
        * Values this parameter may take (if it is an enum).
        */
      var `enum`: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The descriptions for the enums. Each position maps to the corresponding
        * value in the &quot;enum&quot; array.
        */
      var enumDescriptions: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * An additional regular expression or key that helps constrain the value.
        * For more details see:
        * http://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.23
        */
      var format: js.UndefOr[String] = js.undefined
      
      /**
        * Unique identifier for this schema.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * If this is a schema for an array, this property is the schema for each
        * element in the array.
        */
      var items: js.UndefOr[SchemaJsonSchema] = js.undefined
      
      /**
        * Whether this parameter goes in the query or the path for REST requests.
        */
      var location: js.UndefOr[String] = js.undefined
      
      /**
        * The maximum value of this parameter.
        */
      var maximum: js.UndefOr[String] = js.undefined
      
      /**
        * The minimum value of this parameter.
        */
      var minimum: js.UndefOr[String] = js.undefined
      
      /**
        * The regular expression this parameter must conform to. Uses Java 6 regex
        * format:
        * http://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html
        */
      var pattern: js.UndefOr[String] = js.undefined
      
      /**
        * If this is a schema for an object, list the schema for each property of
        * this object.
        */
      var properties: js.UndefOr[StringDictionary[SchemaJsonSchema]] = js.undefined
      
      /**
        * The value is read-only, generated by the service. The value cannot be
        * modified by the client. If the value is included in a POST, PUT, or PATCH
        * request, it is ignored by the service.
        */
      var readOnly: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether this parameter may appear multiple times.
        */
      var repeated: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether the parameter is required.
        */
      var required: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The value type for this schema. A list of values can be found here:
        * http://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.1
        */
      var `type`: js.UndefOr[String] = js.undefined
      
      /**
        * In a variant data type, the value of one property is used to determine
        * how to interpret the entire entity. Its value must exist in a map of
        * descriminant values to schema names.
        */
      var variant: js.UndefOr[Discriminant] = js.undefined
    }
    object SchemaJsonSchema {
      
      inline def apply(): SchemaJsonSchema = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaJsonSchema]
      }
      
      extension [Self <: SchemaJsonSchema](x: Self) {
        
        inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
        
        inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
        
        inline def setAdditionalProperties(value: SchemaJsonSchema): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
        
        inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
        
        inline def setAnnotations(value: Required): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
        
        inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
        
        inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
        
        inline def setEnumDescriptions(value: js.Array[String]): Self = StObject.set(x, "enumDescriptions", value.asInstanceOf[js.Any])
        
        inline def setEnumDescriptionsUndefined: Self = StObject.set(x, "enumDescriptions", js.undefined)
        
        inline def setEnumDescriptionsVarargs(value: String*): Self = StObject.set(x, "enumDescriptions", js.Array(value :_*))
        
        inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
        
        inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
        
        inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setItems(value: SchemaJsonSchema): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setMaximum(value: String): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
        
        inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
        
        inline def setMinimum(value: String): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
        
        inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
        
        inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        
        inline def setProperties(value: StringDictionary[SchemaJsonSchema]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        
        inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
        
        inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
        
        inline def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
        
        inline def setRepeatedUndefined: Self = StObject.set(x, "repeated", js.undefined)
        
        inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
        
        inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setVariant(value: Discriminant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
        
        inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      }
    }
    
    trait SchemaRestDescription extends StObject {
      
      /**
        * Authentication information.
        */
      var auth: js.UndefOr[Oauth2] = js.undefined
      
      /**
        * [DEPRECATED] The base path for REST requests.
        */
      var basePath: js.UndefOr[String] = js.undefined
      
      /**
        * [DEPRECATED] The base URL for REST requests.
        */
      var baseUrl: js.UndefOr[String] = js.undefined
      
      /**
        * The path for REST batch requests.
        */
      var batchPath: js.UndefOr[String] = js.undefined
      
      /**
        * Indicates how the API name should be capitalized and split into various
        * parts. Useful for generating pretty class names.
        */
      var canonicalName: js.UndefOr[String] = js.undefined
      
      /**
        * The description of this API.
        */
      var description: js.UndefOr[String] = js.undefined
      
      /**
        * Indicate the version of the Discovery API used to generate this doc.
        */
      var discoveryVersion: js.UndefOr[String] = js.undefined
      
      /**
        * A link to human readable documentation for the API.
        */
      var documentationLink: js.UndefOr[String] = js.undefined
      
      /**
        * The ETag for this response.
        */
      var etag: js.UndefOr[String] = js.undefined
      
      /**
        * Enable exponential backoff for suitable methods in the generated clients.
        */
      var exponentialBackoffDefault: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A list of supported features for this API.
        */
      var features: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Links to 16x16 and 32x32 icons representing the API.
        */
      var icons: js.UndefOr[X16] = js.undefined
      
      /**
        * The ID of this API.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * The kind for this response.
        */
      var kind: js.UndefOr[String] = js.undefined
      
      /**
        * Labels for the status of this API, such as labs or deprecated.
        */
      var labels: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * API-level methods for this API.
        */
      var methods: js.UndefOr[StringDictionary[SchemaRestMethod]] = js.undefined
      
      /**
        * The name of this API.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * The domain of the owner of this API. Together with the ownerName and a
        * packagePath values, this can be used to generate a library for this API
        * which would have a unique fully qualified name.
        */
      var ownerDomain: js.UndefOr[String] = js.undefined
      
      /**
        * The name of the owner of this API. See ownerDomain.
        */
      var ownerName: js.UndefOr[String] = js.undefined
      
      /**
        * The package of the owner of this API. See ownerDomain.
        */
      var packagePath: js.UndefOr[String] = js.undefined
      
      /**
        * Common parameters that apply across all apis.
        */
      var parameters: js.UndefOr[StringDictionary[SchemaJsonSchema]] = js.undefined
      
      /**
        * The protocol described by this document.
        */
      var protocol: js.UndefOr[String] = js.undefined
      
      /**
        * The resources in this API.
        */
      var resources: js.UndefOr[StringDictionary[SchemaRestResource]] = js.undefined
      
      /**
        * The version of this API.
        */
      var revision: js.UndefOr[String] = js.undefined
      
      /**
        * The root URL under which all API services live.
        */
      var rootUrl: js.UndefOr[String] = js.undefined
      
      /**
        * The schemas for this API.
        */
      var schemas: js.UndefOr[StringDictionary[SchemaJsonSchema]] = js.undefined
      
      /**
        * The base path for all REST requests.
        */
      var servicePath: js.UndefOr[String] = js.undefined
      
      /**
        * The title of this API.
        */
      var title: js.UndefOr[String] = js.undefined
      
      /**
        * The version of this API.
        */
      var version: js.UndefOr[String] = js.undefined
      
      var version_module: js.UndefOr[Boolean] = js.undefined
    }
    object SchemaRestDescription {
      
      inline def apply(): SchemaRestDescription = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaRestDescription]
      }
      
      extension [Self <: SchemaRestDescription](x: Self) {
        
        inline def setAuth(value: Oauth2): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
        
        inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
        
        inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
        
        inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
        
        inline def setBatchPath(value: String): Self = StObject.set(x, "batchPath", value.asInstanceOf[js.Any])
        
        inline def setBatchPathUndefined: Self = StObject.set(x, "batchPath", js.undefined)
        
        inline def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
        
        inline def setCanonicalNameUndefined: Self = StObject.set(x, "canonicalName", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setDiscoveryVersion(value: String): Self = StObject.set(x, "discoveryVersion", value.asInstanceOf[js.Any])
        
        inline def setDiscoveryVersionUndefined: Self = StObject.set(x, "discoveryVersion", js.undefined)
        
        inline def setDocumentationLink(value: String): Self = StObject.set(x, "documentationLink", value.asInstanceOf[js.Any])
        
        inline def setDocumentationLinkUndefined: Self = StObject.set(x, "documentationLink", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setExponentialBackoffDefault(value: Boolean): Self = StObject.set(x, "exponentialBackoffDefault", value.asInstanceOf[js.Any])
        
        inline def setExponentialBackoffDefaultUndefined: Self = StObject.set(x, "exponentialBackoffDefault", js.undefined)
        
        inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
        
        inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
        
        inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
        
        inline def setIcons(value: X16): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
        
        inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
        
        inline def setMethods(value: StringDictionary[SchemaRestMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
        
        inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setOwnerDomain(value: String): Self = StObject.set(x, "ownerDomain", value.asInstanceOf[js.Any])
        
        inline def setOwnerDomainUndefined: Self = StObject.set(x, "ownerDomain", js.undefined)
        
        inline def setOwnerName(value: String): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
        
        inline def setOwnerNameUndefined: Self = StObject.set(x, "ownerName", js.undefined)
        
        inline def setPackagePath(value: String): Self = StObject.set(x, "packagePath", value.asInstanceOf[js.Any])
        
        inline def setPackagePathUndefined: Self = StObject.set(x, "packagePath", js.undefined)
        
        inline def setParameters(value: StringDictionary[SchemaJsonSchema]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
        
        inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
        
        inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
        
        inline def setResources(value: StringDictionary[SchemaRestResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
        
        inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
        
        inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
        
        inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
        
        inline def setRootUrl(value: String): Self = StObject.set(x, "rootUrl", value.asInstanceOf[js.Any])
        
        inline def setRootUrlUndefined: Self = StObject.set(x, "rootUrl", js.undefined)
        
        inline def setSchemas(value: StringDictionary[SchemaJsonSchema]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
        
        inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
        
        inline def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
        
        inline def setServicePathUndefined: Self = StObject.set(x, "servicePath", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
        
        inline def setVersion_module(value: Boolean): Self = StObject.set(x, "version_module", value.asInstanceOf[js.Any])
        
        inline def setVersion_moduleUndefined: Self = StObject.set(x, "version_module", js.undefined)
      }
    }
    
    trait SchemaRestMethod extends StObject {
      
      /**
        * Description of this method.
        */
      var description: js.UndefOr[String] = js.undefined
      
      /**
        * Whether this method requires an ETag to be specified. The ETag is sent as
        * an HTTP If-Match or If-None-Match header.
        */
      var etagRequired: js.UndefOr[Boolean] = js.undefined
      
      /**
        * HTTP method used by this method.
        */
      var httpMethod: js.UndefOr[String] = js.undefined
      
      /**
        * A unique ID for this method. This property can be used to match methods
        * between different versions of Discovery.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * Media upload parameters.
        */
      var mediaUpload: js.UndefOr[Accept] = js.undefined
      
      /**
        * Ordered list of required parameters, serves as a hint to clients on how
        * to structure their method signatures. The array is ordered such that the
        * &quot;most-significant&quot; parameter appears first.
        */
      var parameterOrder: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Details for all parameters in this method.
        */
      var parameters: js.UndefOr[StringDictionary[SchemaJsonSchema]] = js.undefined
      
      /**
        * The URI path of this REST method. Should be used in conjunction with the
        * basePath property at the api-level.
        */
      var path: js.UndefOr[String] = js.undefined
      
      /**
        * The schema for the request.
        */
      var request: js.UndefOr[ParameterName] = js.undefined
      
      /**
        * The schema for the response.
        */
      var response: js.UndefOr[`5`] = js.undefined
      
      /**
        * OAuth 2.0 scopes applicable to this method.
        */
      var scopes: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Whether this method supports media downloads.
        */
      var supportsMediaDownload: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether this method supports media uploads.
        */
      var supportsMediaUpload: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether this method supports subscriptions.
        */
      var supportsSubscription: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Indicates that downloads from this method should use the download service
        * URL (i.e. &quot;/download&quot;). Only applies if the method supports
        * media download.
        */
      var useMediaDownloadService: js.UndefOr[Boolean] = js.undefined
    }
    object SchemaRestMethod {
      
      inline def apply(): SchemaRestMethod = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaRestMethod]
      }
      
      extension [Self <: SchemaRestMethod](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setEtagRequired(value: Boolean): Self = StObject.set(x, "etagRequired", value.asInstanceOf[js.Any])
        
        inline def setEtagRequiredUndefined: Self = StObject.set(x, "etagRequired", js.undefined)
        
        inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
        
        inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setMediaUpload(value: Accept): Self = StObject.set(x, "mediaUpload", value.asInstanceOf[js.Any])
        
        inline def setMediaUploadUndefined: Self = StObject.set(x, "mediaUpload", js.undefined)
        
        inline def setParameterOrder(value: js.Array[String]): Self = StObject.set(x, "parameterOrder", value.asInstanceOf[js.Any])
        
        inline def setParameterOrderUndefined: Self = StObject.set(x, "parameterOrder", js.undefined)
        
        inline def setParameterOrderVarargs(value: String*): Self = StObject.set(x, "parameterOrder", js.Array(value :_*))
        
        inline def setParameters(value: StringDictionary[SchemaJsonSchema]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setRequest(value: ParameterName): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
        
        inline def setResponse(value: `5`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
        
        inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
        
        inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
        
        inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
        
        inline def setSupportsMediaDownload(value: Boolean): Self = StObject.set(x, "supportsMediaDownload", value.asInstanceOf[js.Any])
        
        inline def setSupportsMediaDownloadUndefined: Self = StObject.set(x, "supportsMediaDownload", js.undefined)
        
        inline def setSupportsMediaUpload(value: Boolean): Self = StObject.set(x, "supportsMediaUpload", value.asInstanceOf[js.Any])
        
        inline def setSupportsMediaUploadUndefined: Self = StObject.set(x, "supportsMediaUpload", js.undefined)
        
        inline def setSupportsSubscription(value: Boolean): Self = StObject.set(x, "supportsSubscription", value.asInstanceOf[js.Any])
        
        inline def setSupportsSubscriptionUndefined: Self = StObject.set(x, "supportsSubscription", js.undefined)
        
        inline def setUseMediaDownloadService(value: Boolean): Self = StObject.set(x, "useMediaDownloadService", value.asInstanceOf[js.Any])
        
        inline def setUseMediaDownloadServiceUndefined: Self = StObject.set(x, "useMediaDownloadService", js.undefined)
      }
    }
    
    trait SchemaRestResource extends StObject {
      
      /**
        * Methods on this resource.
        */
      var methods: js.UndefOr[StringDictionary[SchemaRestMethod]] = js.undefined
      
      /**
        * Sub-resources on this resource.
        */
      var resources: js.UndefOr[StringDictionary[SchemaRestResource]] = js.undefined
    }
    object SchemaRestResource {
      
      inline def apply(): SchemaRestResource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaRestResource]
      }
      
      extension [Self <: SchemaRestResource](x: Self) {
        
        inline def setMethods(value: StringDictionary[SchemaRestMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
        
        inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
        
        inline def setResources(value: StringDictionary[SchemaRestResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
        
        inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
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
