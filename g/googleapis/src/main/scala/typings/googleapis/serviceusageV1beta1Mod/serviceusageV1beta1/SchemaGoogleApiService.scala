package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `Service` is the root object of Google service configuration schema. It
  * describes basic information about a service, such as the name and the
  * title, and delegates other aspects to sub-sections. Each sub-section is
  * either a proto message or a repeated proto message that configures a
  * specific aspect, such as auth. See each proto message definition for
  * details.  Example:      type: google.api.Service     config_version: 3
  * name: calendar.googleapis.com     title: Google Calendar API     apis: -
  * name: google.calendar.v3.Calendar     authentication:       providers: -
  * id: google_calendar_auth         jwks_uri:
  * https://www.googleapis.com/oauth2/v1/certs         issuer:
  * https://securetoken.google.com       rules:       - selector: &quot;*&quot;
  * requirements:           provider_id: google_calendar_auth
  */
trait SchemaGoogleApiService extends StObject {
  
  /**
    * A list of API interfaces exported by this service. Only the `name` field
    * of the google.protobuf.Api needs to be provided by the configuration
    * author, as the remaining fields will be derived from the IDL during the
    * normalization process. It is an error to specify an API interface here
    * which cannot be resolved against the associated IDL files.
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
    * The semantic version of the service configuration. The config version
    * affects the interpretation of the service configuration. For example,
    * certain features are enabled by default for certain config versions. The
    * latest config version is `3`.
    */
  var configVersion: js.UndefOr[Double] = js.undefined
  
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
    * Configuration for network endpoints.  If this is empty, then an endpoint
    * with the same name as the service is automatically generated to service
    * all defined APIs.
    */
  var endpoints: js.UndefOr[js.Array[SchemaEndpoint]] = js.undefined
  
  /**
    * A list of all enum types included in this API service.  Enums referenced
    * directly or indirectly by the `apis` are automatically included.  Enums
    * which are not referenced but shall be included should be listed here by
    * name. Example:      enums:     - name: google.someapi.v1.SomeEnum
    */
  var enums: js.UndefOr[js.Array[SchemaEnum]] = js.undefined
  
  /**
    * Experimental configuration.
    */
  var experimental: js.UndefOr[SchemaExperimental] = js.undefined
  
  /**
    * HTTP configuration.
    */
  var http: js.UndefOr[SchemaHttp] = js.undefined
  
  /**
    * A unique ID for a specific instance of this message, typically assigned
    * by the client for tracking purpose. If empty, the server may choose to
    * generate one instead. Must be no longer than 60 characters.
    */
  var id: js.UndefOr[String] = js.undefined
  
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
    * Defines the monitored resources used by this service. This is required by
    * the Service.monitoring and Service.logging configurations.
    */
  var monitoredResources: js.UndefOr[js.Array[SchemaMonitoredResourceDescriptor]] = js.undefined
  
  /**
    * Monitoring configuration.
    */
  var monitoring: js.UndefOr[SchemaMonitoring] = js.undefined
  
  /**
    * The service name, which is a DNS-like logical identifier for the service,
    * such as `calendar.googleapis.com`. The service name typically goes
    * through DNS verification to make sure the owner of the service also owns
    * the DNS name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The Google project that owns this service.
    */
  var producerProjectId: js.UndefOr[String] = js.undefined
  
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
    * A list of all proto message types included in this API service. It serves
    * similar purpose as [google.api.Service.types], except that these types
    * are not needed by user-defined APIs. Therefore, they will not show up in
    * the generated discovery doc. This field should only be used to define
    * system APIs in ESF.
    */
  var systemTypes: js.UndefOr[js.Array[SchemaType]] = js.undefined
  
  /**
    * The product title for this service.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * A list of all proto message types included in this API service. Types
    * referenced directly or indirectly by the `apis` are automatically
    * included.  Messages which are not referenced but shall be included, such
    * as types used by the `google.protobuf.Any` type, should be listed here by
    * name. Example:      types:     - name: google.protobuf.Int32
    */
  var types: js.UndefOr[js.Array[SchemaType]] = js.undefined
  
  /**
    * Configuration controlling usage of this service.
    */
  var usage: js.UndefOr[SchemaUsage] = js.undefined
}
object SchemaGoogleApiService {
  
  @scala.inline
  def apply(): SchemaGoogleApiService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleApiService]
  }
  
  @scala.inline
  implicit class SchemaGoogleApiServiceMutableBuilder[Self <: SchemaGoogleApiService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApis(value: js.Array[SchemaApi]): Self = StObject.set(x, "apis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApisUndefined: Self = StObject.set(x, "apis", js.undefined)
    
    @scala.inline
    def setApisVarargs(value: SchemaApi*): Self = StObject.set(x, "apis", js.Array(value :_*))
    
    @scala.inline
    def setAuthentication(value: SchemaAuthentication): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
    
    @scala.inline
    def setBackend(value: SchemaBackend): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
    
    @scala.inline
    def setBilling(value: SchemaBilling): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    @scala.inline
    def setConfigVersion(value: Double): Self = StObject.set(x, "configVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigVersionUndefined: Self = StObject.set(x, "configVersion", js.undefined)
    
    @scala.inline
    def setContext(value: SchemaContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setControl(value: SchemaControl): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    @scala.inline
    def setCustomError(value: SchemaCustomError): Self = StObject.set(x, "customError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomErrorUndefined: Self = StObject.set(x, "customError", js.undefined)
    
    @scala.inline
    def setDocumentation(value: SchemaDocumentation): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setEndpoints(value: js.Array[SchemaEndpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: SchemaEndpoint*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEnums(value: js.Array[SchemaEnum]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
    
    @scala.inline
    def setEnumsVarargs(value: SchemaEnum*): Self = StObject.set(x, "enums", js.Array(value :_*))
    
    @scala.inline
    def setExperimental(value: SchemaExperimental): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    @scala.inline
    def setHttp(value: SchemaHttp): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLogging(value: SchemaLogging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setLogs(value: js.Array[SchemaLogDescriptor]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
    
    @scala.inline
    def setLogsVarargs(value: SchemaLogDescriptor*): Self = StObject.set(x, "logs", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[SchemaMetricDescriptor]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: SchemaMetricDescriptor*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setMonitoredResources(value: js.Array[SchemaMonitoredResourceDescriptor]): Self = StObject.set(x, "monitoredResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoredResourcesUndefined: Self = StObject.set(x, "monitoredResources", js.undefined)
    
    @scala.inline
    def setMonitoredResourcesVarargs(value: SchemaMonitoredResourceDescriptor*): Self = StObject.set(x, "monitoredResources", js.Array(value :_*))
    
    @scala.inline
    def setMonitoring(value: SchemaMonitoring): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProducerProjectId(value: String): Self = StObject.set(x, "producerProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerProjectIdUndefined: Self = StObject.set(x, "producerProjectId", js.undefined)
    
    @scala.inline
    def setQuota(value: SchemaQuota): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    @scala.inline
    def setSourceInfo(value: SchemaSourceInfo): Self = StObject.set(x, "sourceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceInfoUndefined: Self = StObject.set(x, "sourceInfo", js.undefined)
    
    @scala.inline
    def setSystemParameters(value: SchemaSystemParameters): Self = StObject.set(x, "systemParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemParametersUndefined: Self = StObject.set(x, "systemParameters", js.undefined)
    
    @scala.inline
    def setSystemTypes(value: js.Array[SchemaType]): Self = StObject.set(x, "systemTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemTypesUndefined: Self = StObject.set(x, "systemTypes", js.undefined)
    
    @scala.inline
    def setSystemTypesVarargs(value: SchemaType*): Self = StObject.set(x, "systemTypes", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[SchemaType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: SchemaType*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    @scala.inline
    def setUsage(value: SchemaUsage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
