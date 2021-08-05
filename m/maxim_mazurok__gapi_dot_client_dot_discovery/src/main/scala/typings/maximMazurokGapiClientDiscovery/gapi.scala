package typings.maximMazurokGapiClientDiscovery

import org.scalablytyped.runtime.TopLevel
import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDiscovery.anon.Accept
import typings.maximMazurokGapiClientDiscovery.anon.Alt
import typings.maximMazurokGapiClientDiscovery.anon.Description
import typings.maximMazurokGapiClientDiscovery.anon.Discriminant
import typings.maximMazurokGapiClientDiscovery.anon.Fields
import typings.maximMazurokGapiClientDiscovery.anon.Oauth2
import typings.maximMazurokGapiClientDiscovery.anon.ParameterName
import typings.maximMazurokGapiClientDiscovery.anon.Required
import typings.maximMazurokGapiClientDiscovery.anon.X16
import typings.maximMazurokGapiClientDiscovery.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object discovery {
      
      @js.native
      trait ApisResource extends StObject {
        
        /** Retrieve the description of a particular version of an api. */
        def getRest(): Request[RestDescription] = js.native
        def getRest(request: Alt): Request[RestDescription] = js.native
        
        /** Retrieve the list of APIs supported at this endpoint. */
        def list(): Request[DirectoryList] = js.native
        def list(request: Fields): Request[DirectoryList] = js.native
      }
      
      trait DirectoryList extends StObject {
        
        /** Indicate the version of the Discovery API used to generate this doc. */
        var discoveryVersion: js.UndefOr[String] = js.undefined
        
        /** The individual directory entries. One entry per api/version pair. */
        var items: js.UndefOr[js.Array[Description]] = js.undefined
        
        /** The kind for this response. */
        var kind: js.UndefOr[String] = js.undefined
      }
      object DirectoryList {
        
        inline def apply(): DirectoryList = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[DirectoryList]
        }
        
        extension [Self <: DirectoryList](x: Self) {
          
          inline def setDiscoveryVersion(value: String): Self = StObject.set(x, "discoveryVersion", value.asInstanceOf[js.Any])
          
          inline def setDiscoveryVersionUndefined: Self = StObject.set(x, "discoveryVersion", js.undefined)
          
          inline def setItems(value: js.Array[Description]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
          inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
          
          inline def setItemsVarargs(value: Description*): Self = StObject.set(x, "items", js.Array(value :_*))
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        }
      }
      
      trait JsonSchema extends StObject {
        
        /** The default value of this property (if one exists). */
        var default: js.UndefOr[String] = js.undefined
        
        /** A reference to another schema. The value of this property is the "id" of another schema. */
        @JSName("$ref")
        var $ref: js.UndefOr[String] = js.undefined
        
        /** If this is a schema for an object, this property is the schema for any additional properties with dynamic keys on this object. */
        var additionalProperties: js.UndefOr[JsonSchema] = js.undefined
        
        /** Additional information about this property. */
        var annotations: js.UndefOr[Required] = js.undefined
        
        /** A description of this object. */
        var description: js.UndefOr[String] = js.undefined
        
        /** Values this parameter may take (if it is an enum). */
        var `enum`: js.UndefOr[js.Array[String]] = js.undefined
        
        /** The descriptions for the enums. Each position maps to the corresponding value in the "enum" array. */
        var enumDescriptions: js.UndefOr[js.Array[String]] = js.undefined
        
        /** An additional regular expression or key that helps constrain the value. For more details see: http://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.23 */
        var format: js.UndefOr[String] = js.undefined
        
        /** Unique identifier for this schema. */
        var id: js.UndefOr[String] = js.undefined
        
        /** If this is a schema for an array, this property is the schema for each element in the array. */
        var items: js.UndefOr[JsonSchema] = js.undefined
        
        /** Whether this parameter goes in the query or the path for REST requests. */
        var location: js.UndefOr[String] = js.undefined
        
        /** The maximum value of this parameter. */
        var maximum: js.UndefOr[String] = js.undefined
        
        /** The minimum value of this parameter. */
        var minimum: js.UndefOr[String] = js.undefined
        
        /** The regular expression this parameter must conform to. Uses Java 6 regex format: http://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html */
        var pattern: js.UndefOr[String] = js.undefined
        
        /** If this is a schema for an object, list the schema for each property of this object. */
        var properties: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.JsonSchema}
          */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.JsonSchema & TopLevel[js.Any]
              ] = js.undefined
        
        /**
          * The value is read-only, generated by the service. The value cannot be modified by the client. If the value is included in a POST, PUT, or PATCH request, it is ignored by the
          * service.
          */
        var readOnly: js.UndefOr[Boolean] = js.undefined
        
        /** Whether this parameter may appear multiple times. */
        var repeated: js.UndefOr[Boolean] = js.undefined
        
        /** Whether the parameter is required. */
        var required: js.UndefOr[Boolean] = js.undefined
        
        /** The value type for this schema. A list of values can be found here: http://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.1 */
        var `type`: js.UndefOr[String] = js.undefined
        
        /** In a variant data type, the value of one property is used to determine how to interpret the entire entity. Its value must exist in a map of descriminant values to schema names. */
        var variant: js.UndefOr[Discriminant] = js.undefined
      }
      object JsonSchema {
        
        inline def apply(): JsonSchema = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[JsonSchema]
        }
        
        extension [Self <: JsonSchema](x: Self) {
          
          inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
          
          inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
          
          inline def setAdditionalProperties(value: JsonSchema): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
          
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
          
          inline def setItems(value: JsonSchema): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
          inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
          
          inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
          
          inline def setMaximum(value: String): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
          
          inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
          
          inline def setMinimum(value: String): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
          
          inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
          
          inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
          
          inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
          
          inline def setProperties(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.JsonSchema}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.JsonSchema & TopLevel[js.Any]
          ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
          
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
      
      trait RestDescription extends StObject {
        
        /** Authentication information. */
        var auth: js.UndefOr[Oauth2] = js.undefined
        
        /** [DEPRECATED] The base path for REST requests. */
        var basePath: js.UndefOr[String] = js.undefined
        
        /** [DEPRECATED] The base URL for REST requests. */
        var baseUrl: js.UndefOr[String] = js.undefined
        
        /** The path for REST batch requests. */
        var batchPath: js.UndefOr[String] = js.undefined
        
        /** Indicates how the API name should be capitalized and split into various parts. Useful for generating pretty class names. */
        var canonicalName: js.UndefOr[String] = js.undefined
        
        /** The description of this API. */
        var description: js.UndefOr[String] = js.undefined
        
        /** Indicate the version of the Discovery API used to generate this doc. */
        var discoveryVersion: js.UndefOr[String] = js.undefined
        
        /** A link to human readable documentation for the API. */
        var documentationLink: js.UndefOr[String] = js.undefined
        
        /** The ETag for this response. */
        var etag: js.UndefOr[String] = js.undefined
        
        /** Enable exponential backoff for suitable methods in the generated clients. */
        var exponentialBackoffDefault: js.UndefOr[Boolean] = js.undefined
        
        /** A list of supported features for this API. */
        var features: js.UndefOr[js.Array[String]] = js.undefined
        
        /** Links to 16x16 and 32x32 icons representing the API. */
        var icons: js.UndefOr[X16] = js.undefined
        
        /** The ID of this API. */
        var id: js.UndefOr[String] = js.undefined
        
        /** The kind for this response. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** Labels for the status of this API, such as labs or deprecated. */
        var labels: js.UndefOr[js.Array[String]] = js.undefined
        
        /** API-level methods for this API. */
        var methods: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.RestMethod}
          */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestDescription & TopLevel[js.Any]
              ] = js.undefined
        
        /** The name of this API. */
        var name: js.UndefOr[String] = js.undefined
        
        /**
          * The domain of the owner of this API. Together with the ownerName and a packagePath values, this can be used to generate a library for this API which would have a unique fully
          * qualified name.
          */
        var ownerDomain: js.UndefOr[String] = js.undefined
        
        /** The name of the owner of this API. See ownerDomain. */
        var ownerName: js.UndefOr[String] = js.undefined
        
        /** The package of the owner of this API. See ownerDomain. */
        var packagePath: js.UndefOr[String] = js.undefined
        
        /** Common parameters that apply across all apis. */
        var parameters: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.JsonSchema}
          */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestDescription & TopLevel[js.Any]
              ] = js.undefined
        
        /** The protocol described by this document. */
        var protocol: js.UndefOr[String] = js.undefined
        
        /** The resources in this API. */
        var resources: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.RestResource}
          */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestDescription & TopLevel[js.Any]
              ] = js.undefined
        
        /** The version of this API. */
        var revision: js.UndefOr[String] = js.undefined
        
        /** The root URL under which all API services live. */
        var rootUrl: js.UndefOr[String] = js.undefined
        
        /** The schemas for this API. */
        var schemas: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.JsonSchema}
          */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestDescription & TopLevel[js.Any]
              ] = js.undefined
        
        /** The base path for all REST requests. */
        var servicePath: js.UndefOr[String] = js.undefined
        
        /** The title of this API. */
        var title: js.UndefOr[String] = js.undefined
        
        /** The version of this API. */
        var version: js.UndefOr[String] = js.undefined
        
        var version_module: js.UndefOr[Boolean] = js.undefined
      }
      object RestDescription {
        
        inline def apply(): RestDescription = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[RestDescription]
        }
        
        extension [Self <: RestDescription](x: Self) {
          
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
          
          inline def setMethods(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.RestMethod}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestDescription & TopLevel[js.Any]
          ): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
          
          inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setOwnerDomain(value: String): Self = StObject.set(x, "ownerDomain", value.asInstanceOf[js.Any])
          
          inline def setOwnerDomainUndefined: Self = StObject.set(x, "ownerDomain", js.undefined)
          
          inline def setOwnerName(value: String): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
          
          inline def setOwnerNameUndefined: Self = StObject.set(x, "ownerName", js.undefined)
          
          inline def setPackagePath(value: String): Self = StObject.set(x, "packagePath", value.asInstanceOf[js.Any])
          
          inline def setPackagePathUndefined: Self = StObject.set(x, "packagePath", js.undefined)
          
          inline def setParameters(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.JsonSchema}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestDescription & TopLevel[js.Any]
          ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
          
          inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
          
          inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
          
          inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
          
          inline def setResources(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.RestResource}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestDescription & TopLevel[js.Any]
          ): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
          
          inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
          
          inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
          
          inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
          
          inline def setRootUrl(value: String): Self = StObject.set(x, "rootUrl", value.asInstanceOf[js.Any])
          
          inline def setRootUrlUndefined: Self = StObject.set(x, "rootUrl", js.undefined)
          
          inline def setSchemas(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.JsonSchema}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestDescription & TopLevel[js.Any]
          ): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
          
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
      
      trait RestMethod extends StObject {
        
        /** Description of this method. */
        var description: js.UndefOr[String] = js.undefined
        
        /** Whether this method requires an ETag to be specified. The ETag is sent as an HTTP If-Match or If-None-Match header. */
        var etagRequired: js.UndefOr[Boolean] = js.undefined
        
        /** HTTP method used by this method. */
        var httpMethod: js.UndefOr[String] = js.undefined
        
        /** A unique ID for this method. This property can be used to match methods between different versions of Discovery. */
        var id: js.UndefOr[String] = js.undefined
        
        /** Media upload parameters. */
        var mediaUpload: js.UndefOr[Accept] = js.undefined
        
        /**
          * Ordered list of required parameters, serves as a hint to clients on how to structure their method signatures. The array is ordered such that the "most-significant" parameter appears
          * first.
          */
        var parameterOrder: js.UndefOr[js.Array[String]] = js.undefined
        
        /** Details for all parameters in this method. */
        var parameters: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.JsonSchema}
          */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestMethod & TopLevel[js.Any]
              ] = js.undefined
        
        /** The URI path of this REST method. Should be used in conjunction with the basePath property at the api-level. */
        var path: js.UndefOr[String] = js.undefined
        
        /** The schema for the request. */
        var request: js.UndefOr[ParameterName] = js.undefined
        
        /** The schema for the response. */
        var response: js.UndefOr[`0`] = js.undefined
        
        /** OAuth 2.0 scopes applicable to this method. */
        var scopes: js.UndefOr[js.Array[String]] = js.undefined
        
        /** Whether this method supports media downloads. */
        var supportsMediaDownload: js.UndefOr[Boolean] = js.undefined
        
        /** Whether this method supports media uploads. */
        var supportsMediaUpload: js.UndefOr[Boolean] = js.undefined
        
        /** Whether this method supports subscriptions. */
        var supportsSubscription: js.UndefOr[Boolean] = js.undefined
        
        /** Indicates that downloads from this method should use the download service URL (i.e. "/download"). Only applies if the method supports media download. */
        var useMediaDownloadService: js.UndefOr[Boolean] = js.undefined
      }
      object RestMethod {
        
        inline def apply(): RestMethod = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[RestMethod]
        }
        
        extension [Self <: RestMethod](x: Self) {
          
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
          
          inline def setParameters(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.JsonSchema}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestMethod & TopLevel[js.Any]
          ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
          
          inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
          
          inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
          
          inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
          
          inline def setRequest(value: ParameterName): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
          
          inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
          
          inline def setResponse(value: `0`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
          
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
      
      trait RestResource extends StObject {
        
        /** Methods on this resource. */
        var methods: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.RestMethod}
          */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestResource & TopLevel[js.Any]
              ] = js.undefined
        
        /** Sub-resources on this resource. */
        var resources: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.RestResource}
          */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestResource & TopLevel[js.Any]
              ] = js.undefined
      }
      object RestResource {
        
        inline def apply(): RestResource = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[RestResource]
        }
        
        extension [Self <: RestResource](x: Self) {
          
          inline def setMethods(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.RestMethod}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestResource & TopLevel[js.Any]
          ): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
          
          inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
          
          inline def setResources(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.RestResource}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestResource & TopLevel[js.Any]
          ): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
          
          inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
        }
      }
    }
  }
}
