package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaService extends StObject {
  
  /**
    * A list of API interfaces exported by this service. Only the `name` field of the google.protobuf.Api needs to be provided by the configuration author, as the remaining fields will be derived from the IDL during the normalization process. It is an error to specify an API interface here which cannot be resolved against the associated IDL files.
    */
  var apis: js.UndefOr[js.Array[SchemaApi]] = js.undefined
  
  /**
    * Auth configuration.
    */
  var authentication: js.UndefOr[SchemaAuthentication] = js.undefined
  
  /**
    * API backend configuration.
    */
  var backend: js.UndefOr[SchemaBackend] = js.undefined
  
  /**
    * Billing configuration.
    */
  var billing: js.UndefOr[SchemaBilling] = js.undefined
  
  /**
    * Obsolete. Do not use. This field has no semantic meaning. The service config compiler always sets this field to `3`.
    */
  var configVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Context configuration.
    */
  var context: js.UndefOr[SchemaContext] = js.undefined
  
  /**
    * Configuration for the service control plane.
    */
  var control: js.UndefOr[SchemaControl] = js.undefined
  
  /**
    * Custom error configuration.
    */
  var customError: js.UndefOr[SchemaCustomError] = js.undefined
  
  /**
    * Additional API documentation.
    */
  var documentation: js.UndefOr[SchemaDocumentation] = js.undefined
  
  /**
    * Configuration for network endpoints. If this is empty, then an endpoint with the same name as the service is automatically generated to service all defined APIs.
    */
  var endpoints: js.UndefOr[js.Array[SchemaEndpoint]] = js.undefined
  
  /**
    * A list of all enum types included in this API service. Enums referenced directly or indirectly by the `apis` are automatically included. Enums which are not referenced but shall be included should be listed here by name by the configuration author. Example: enums: - name: google.someapi.v1.SomeEnum
    */
  var enums: js.UndefOr[js.Array[SchemaEnum]] = js.undefined
  
  /**
    * HTTP configuration.
    */
  var http: js.UndefOr[SchemaHttp] = js.undefined
  
  /**
    * A unique ID for a specific instance of this message, typically assigned by the client for tracking purpose. Must be no longer than 63 characters and only lower case letters, digits, '.', '_' and '-' are allowed. If empty, the server may choose to generate one instead.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Logging configuration.
    */
  var logging: js.UndefOr[SchemaLogging] = js.undefined
  
  /**
    * Defines the logs used by this service.
    */
  var logs: js.UndefOr[js.Array[SchemaLogDescriptor]] = js.undefined
  
  /**
    * Defines the metrics used by this service.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetricDescriptor]] = js.undefined
  
  /**
    * Defines the monitored resources used by this service. This is required by the Service.monitoring and Service.logging configurations.
    */
  var monitoredResources: js.UndefOr[js.Array[SchemaMonitoredResourceDescriptor]] = js.undefined
  
  /**
    * Monitoring configuration.
    */
  var monitoring: js.UndefOr[SchemaMonitoring] = js.undefined
  
  /**
    * The service name, which is a DNS-like logical identifier for the service, such as `calendar.googleapis.com`. The service name typically goes through DNS verification to make sure the owner of the service also owns the DNS name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Google project that owns this service.
    */
  var producerProjectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Quota configuration.
    */
  var quota: js.UndefOr[SchemaQuota] = js.undefined
  
  /**
    * Output only. The source information for this configuration if available.
    */
  var sourceInfo: js.UndefOr[SchemaSourceInfo] = js.undefined
  
  /**
    * System parameter configuration.
    */
  var systemParameters: js.UndefOr[SchemaSystemParameters] = js.undefined
  
  /**
    * A list of all proto message types included in this API service. It serves similar purpose as [google.api.Service.types], except that these types are not needed by user-defined APIs. Therefore, they will not show up in the generated discovery doc. This field should only be used to define system APIs in ESF.
    */
  var systemTypes: js.UndefOr[js.Array[SchemaType]] = js.undefined
  
  /**
    * The product title for this service, it is the name displayed in Google Cloud Console.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of all proto message types included in this API service. Types referenced directly or indirectly by the `apis` are automatically included. Messages which are not referenced but shall be included, such as types used by the `google.protobuf.Any` type, should be listed here by name by the configuration author. Example: types: - name: google.protobuf.Int32
    */
  var types: js.UndefOr[js.Array[SchemaType]] = js.undefined
  
  /**
    * Configuration controlling usage of this service.
    */
  var usage: js.UndefOr[SchemaUsage] = js.undefined
}
object SchemaService {
  
  inline def apply(): SchemaService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaService]
  }
  
  extension [Self <: SchemaService](x: Self) {
    
    inline def setApis(value: js.Array[SchemaApi]): Self = StObject.set(x, "apis", value.asInstanceOf[js.Any])
    
    inline def setApisUndefined: Self = StObject.set(x, "apis", js.undefined)
    
    inline def setApisVarargs(value: SchemaApi*): Self = StObject.set(x, "apis", js.Array(value*))
    
    inline def setAuthentication(value: SchemaAuthentication): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
    
    inline def setBackend(value: SchemaBackend): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
    
    inline def setBilling(value: SchemaBilling): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    inline def setConfigVersion(value: Double): Self = StObject.set(x, "configVersion", value.asInstanceOf[js.Any])
    
    inline def setConfigVersionNull: Self = StObject.set(x, "configVersion", null)
    
    inline def setConfigVersionUndefined: Self = StObject.set(x, "configVersion", js.undefined)
    
    inline def setContext(value: SchemaContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setControl(value: SchemaControl): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setCustomError(value: SchemaCustomError): Self = StObject.set(x, "customError", value.asInstanceOf[js.Any])
    
    inline def setCustomErrorUndefined: Self = StObject.set(x, "customError", js.undefined)
    
    inline def setDocumentation(value: SchemaDocumentation): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setEndpoints(value: js.Array[SchemaEndpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: SchemaEndpoint*): Self = StObject.set(x, "endpoints", js.Array(value*))
    
    inline def setEnums(value: js.Array[SchemaEnum]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    inline def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
    
    inline def setEnumsVarargs(value: SchemaEnum*): Self = StObject.set(x, "enums", js.Array(value*))
    
    inline def setHttp(value: SchemaHttp): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLogging(value: SchemaLogging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setLogs(value: js.Array[SchemaLogDescriptor]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    inline def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
    
    inline def setLogsVarargs(value: SchemaLogDescriptor*): Self = StObject.set(x, "logs", js.Array(value*))
    
    inline def setMetrics(value: js.Array[SchemaMetricDescriptor]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaMetricDescriptor*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setMonitoredResources(value: js.Array[SchemaMonitoredResourceDescriptor]): Self = StObject.set(x, "monitoredResources", value.asInstanceOf[js.Any])
    
    inline def setMonitoredResourcesUndefined: Self = StObject.set(x, "monitoredResources", js.undefined)
    
    inline def setMonitoredResourcesVarargs(value: SchemaMonitoredResourceDescriptor*): Self = StObject.set(x, "monitoredResources", js.Array(value*))
    
    inline def setMonitoring(value: SchemaMonitoring): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProducerProjectId(value: String): Self = StObject.set(x, "producerProjectId", value.asInstanceOf[js.Any])
    
    inline def setProducerProjectIdNull: Self = StObject.set(x, "producerProjectId", null)
    
    inline def setProducerProjectIdUndefined: Self = StObject.set(x, "producerProjectId", js.undefined)
    
    inline def setQuota(value: SchemaQuota): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    inline def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    inline def setSourceInfo(value: SchemaSourceInfo): Self = StObject.set(x, "sourceInfo", value.asInstanceOf[js.Any])
    
    inline def setSourceInfoUndefined: Self = StObject.set(x, "sourceInfo", js.undefined)
    
    inline def setSystemParameters(value: SchemaSystemParameters): Self = StObject.set(x, "systemParameters", value.asInstanceOf[js.Any])
    
    inline def setSystemParametersUndefined: Self = StObject.set(x, "systemParameters", js.undefined)
    
    inline def setSystemTypes(value: js.Array[SchemaType]): Self = StObject.set(x, "systemTypes", value.asInstanceOf[js.Any])
    
    inline def setSystemTypesUndefined: Self = StObject.set(x, "systemTypes", js.undefined)
    
    inline def setSystemTypesVarargs(value: SchemaType*): Self = StObject.set(x, "systemTypes", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTypes(value: js.Array[SchemaType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: SchemaType*): Self = StObject.set(x, "types", js.Array(value*))
    
    inline def setUsage(value: SchemaUsage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
