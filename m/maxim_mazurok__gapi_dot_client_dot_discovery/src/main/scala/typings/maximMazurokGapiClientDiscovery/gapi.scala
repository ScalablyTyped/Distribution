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
        
        @scala.inline
        def apply(): DirectoryList = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[DirectoryList]
        }
        
        @scala.inline
        implicit class DirectoryListMutableBuilder[Self <: DirectoryList] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDiscoveryVersion(value: String): Self = StObject.set(x, "discoveryVersion", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDiscoveryVersionUndefined: Self = StObject.set(x, "discoveryVersion", js.undefined)
          
          @scala.inline
          def setItems(value: js.Array[Description]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
          
          @scala.inline
          def setItemsVarargs(value: Description*): Self = StObject.set(x, "items", js.Array(value :_*))
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
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
        
        @scala.inline
        def apply(): JsonSchema = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[JsonSchema]
        }
        
        @scala.inline
        implicit class JsonSchemaMutableBuilder[Self <: JsonSchema] (val x: Self) extends AnyVal {
          
          @scala.inline
          def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
          
          @scala.inline
          def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
          
          @scala.inline
          def setAdditionalProperties(value: JsonSchema): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
          
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
          def setItems(value: JsonSchema): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
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
          def setProperties(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.JsonSchema}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.JsonSchema & TopLevel[js.Any]
          ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
          
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
        
        @scala.inline
        def apply(): RestDescription = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[RestDescription]
        }
        
        @scala.inline
        implicit class RestDescriptionMutableBuilder[Self <: RestDescription] (val x: Self) extends AnyVal {
          
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
          def setMethods(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.RestMethod}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestDescription & TopLevel[js.Any]
          ): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
          
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
          def setParameters(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.JsonSchema}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestDescription & TopLevel[js.Any]
          ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
          
          @scala.inline
          def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
          
          @scala.inline
          def setResources(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.RestResource}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestDescription & TopLevel[js.Any]
          ): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
          
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
          def setSchemas(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.JsonSchema}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestDescription & TopLevel[js.Any]
          ): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
          
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
        
        @scala.inline
        def apply(): RestMethod = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[RestMethod]
        }
        
        @scala.inline
        implicit class RestMethodMutableBuilder[Self <: RestMethod] (val x: Self) extends AnyVal {
          
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
          def setParameters(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.JsonSchema}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestMethod & TopLevel[js.Any]
          ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
          
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
          def setResponse(value: `0`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
          
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
        
        @scala.inline
        def apply(): RestResource = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[RestResource]
        }
        
        @scala.inline
        implicit class RestResourceMutableBuilder[Self <: RestResource] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethods(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.RestMethod}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestResource & TopLevel[js.Any]
          ): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
          
          @scala.inline
          def setResources(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.discovery.gapi.client.discovery.RestResource}
            */ typings.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.RestResource & TopLevel[js.Any]
          ): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
        }
      }
    }
  }
}
