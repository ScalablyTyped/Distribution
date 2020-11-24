package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait SchemaService extends js.Object {
  
  /**
    * A list of API interfaces exported by this service. Only the `name` field
    * of the google.protobuf.Api needs to be provided by the configuration
    * author, as the remaining fields will be derived from the IDL during the
    * normalization process. It is an error to specify an API interface here
    * which cannot be resolved against the associated IDL files.
    */
  var apis: js.UndefOr[js.Array[SchemaApi]] = js.native
  
  /**
    * Auth configuration.
    */
  var authentication: js.UndefOr[SchemaAuthentication] = js.native
  
  /**
    * API backend configuration.
    */
  var backend: js.UndefOr[SchemaBackend] = js.native
  
  /**
    * Billing configuration.
    */
  var billing: js.UndefOr[SchemaBilling] = js.native
  
  /**
    * The semantic version of the service configuration. The config version
    * affects the interpretation of the service configuration. For example,
    * certain features are enabled by default for certain config versions. The
    * latest config version is `3`.
    */
  var configVersion: js.UndefOr[Double] = js.native
  
  /**
    * Context configuration.
    */
  var context: js.UndefOr[SchemaContext] = js.native
  
  /**
    * Configuration for the service control plane.
    */
  var control: js.UndefOr[SchemaControl] = js.native
  
  /**
    * Custom error configuration.
    */
  var customError: js.UndefOr[SchemaCustomError] = js.native
  
  /**
    * Additional API documentation.
    */
  var documentation: js.UndefOr[SchemaDocumentation] = js.native
  
  /**
    * Configuration for network endpoints.  If this is empty, then an endpoint
    * with the same name as the service is automatically generated to service
    * all defined APIs.
    */
  var endpoints: js.UndefOr[js.Array[SchemaEndpoint]] = js.native
  
  /**
    * A list of all enum types included in this API service.  Enums referenced
    * directly or indirectly by the `apis` are automatically included.  Enums
    * which are not referenced but shall be included should be listed here by
    * name. Example:      enums:     - name: google.someapi.v1.SomeEnum
    */
  var enums: js.UndefOr[js.Array[SchemaEnum]] = js.native
  
  /**
    * Experimental configuration.
    */
  var experimental: js.UndefOr[SchemaExperimental] = js.native
  
  /**
    * HTTP configuration.
    */
  var http: js.UndefOr[SchemaHttp] = js.native
  
  /**
    * A unique ID for a specific instance of this message, typically assigned
    * by the client for tracking purpose. If empty, the server may choose to
    * generate one instead. Must be no longer than 60 characters.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Logging configuration.
    */
  var logging: js.UndefOr[SchemaLogging] = js.native
  
  /**
    * Defines the logs used by this service.
    */
  var logs: js.UndefOr[js.Array[SchemaLogDescriptor]] = js.native
  
  /**
    * Defines the metrics used by this service.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetricDescriptor]] = js.native
  
  /**
    * Defines the monitored resources used by this service. This is required by
    * the Service.monitoring and Service.logging configurations.
    */
  var monitoredResources: js.UndefOr[js.Array[SchemaMonitoredResourceDescriptor]] = js.native
  
  /**
    * Monitoring configuration.
    */
  var monitoring: js.UndefOr[SchemaMonitoring] = js.native
  
  /**
    * The service name, which is a DNS-like logical identifier for the service,
    * such as `calendar.googleapis.com`. The service name typically goes
    * through DNS verification to make sure the owner of the service also owns
    * the DNS name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The Google project that owns this service.
    */
  var producerProjectId: js.UndefOr[String] = js.native
  
  /**
    * Quota configuration.
    */
  var quota: js.UndefOr[SchemaQuota] = js.native
  
  /**
    * Output only. The source information for this configuration if available.
    */
  var sourceInfo: js.UndefOr[SchemaSourceInfo] = js.native
  
  /**
    * System parameter configuration.
    */
  var systemParameters: js.UndefOr[SchemaSystemParameters] = js.native
  
  /**
    * A list of all proto message types included in this API service. It serves
    * similar purpose as [google.api.Service.types], except that these types
    * are not needed by user-defined APIs. Therefore, they will not show up in
    * the generated discovery doc. This field should only be used to define
    * system APIs in ESF.
    */
  var systemTypes: js.UndefOr[js.Array[SchemaType]] = js.native
  
  /**
    * The product title for this service.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * A list of all proto message types included in this API service. Types
    * referenced directly or indirectly by the `apis` are automatically
    * included.  Messages which are not referenced but shall be included, such
    * as types used by the `google.protobuf.Any` type, should be listed here by
    * name. Example:      types:     - name: google.protobuf.Int32
    */
  var types: js.UndefOr[js.Array[SchemaType]] = js.native
  
  /**
    * Configuration controlling usage of this service.
    */
  var usage: js.UndefOr[SchemaUsage] = js.native
}
object SchemaService {
  
  @scala.inline
  def apply(): SchemaService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaService]
  }
  
  @scala.inline
  implicit class SchemaServiceOps[Self <: SchemaService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApisVarargs(value: SchemaApi*): Self = this.set("apis", js.Array(value :_*))
    
    @scala.inline
    def setApis(value: js.Array[SchemaApi]): Self = this.set("apis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApis: Self = this.set("apis", js.undefined)
    
    @scala.inline
    def setAuthentication(value: SchemaAuthentication): Self = this.set("authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthentication: Self = this.set("authentication", js.undefined)
    
    @scala.inline
    def setBackend(value: SchemaBackend): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackend: Self = this.set("backend", js.undefined)
    
    @scala.inline
    def setBilling(value: SchemaBilling): Self = this.set("billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBilling: Self = this.set("billing", js.undefined)
    
    @scala.inline
    def setConfigVersion(value: Double): Self = this.set("configVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigVersion: Self = this.set("configVersion", js.undefined)
    
    @scala.inline
    def setContext(value: SchemaContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setControl(value: SchemaControl): Self = this.set("control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    
    @scala.inline
    def setCustomError(value: SchemaCustomError): Self = this.set("customError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomError: Self = this.set("customError", js.undefined)
    
    @scala.inline
    def setDocumentation(value: SchemaDocumentation): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: SchemaEndpoint*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: js.Array[SchemaEndpoint]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("endpoints", js.undefined)
    
    @scala.inline
    def setEnumsVarargs(value: SchemaEnum*): Self = this.set("enums", js.Array(value :_*))
    
    @scala.inline
    def setEnums(value: js.Array[SchemaEnum]): Self = this.set("enums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnums: Self = this.set("enums", js.undefined)
    
    @scala.inline
    def setExperimental(value: SchemaExperimental): Self = this.set("experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    
    @scala.inline
    def setHttp(value: SchemaHttp): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLogging(value: SchemaLogging): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setLogsVarargs(value: SchemaLogDescriptor*): Self = this.set("logs", js.Array(value :_*))
    
    @scala.inline
    def setLogs(value: js.Array[SchemaLogDescriptor]): Self = this.set("logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogs: Self = this.set("logs", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: SchemaMetricDescriptor*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[SchemaMetricDescriptor]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setMonitoredResourcesVarargs(value: SchemaMonitoredResourceDescriptor*): Self = this.set("monitoredResources", js.Array(value :_*))
    
    @scala.inline
    def setMonitoredResources(value: js.Array[SchemaMonitoredResourceDescriptor]): Self = this.set("monitoredResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoredResources: Self = this.set("monitoredResources", js.undefined)
    
    @scala.inline
    def setMonitoring(value: SchemaMonitoring): Self = this.set("monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoring: Self = this.set("monitoring", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProducerProjectId(value: String): Self = this.set("producerProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducerProjectId: Self = this.set("producerProjectId", js.undefined)
    
    @scala.inline
    def setQuota(value: SchemaQuota): Self = this.set("quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuota: Self = this.set("quota", js.undefined)
    
    @scala.inline
    def setSourceInfo(value: SchemaSourceInfo): Self = this.set("sourceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceInfo: Self = this.set("sourceInfo", js.undefined)
    
    @scala.inline
    def setSystemParameters(value: SchemaSystemParameters): Self = this.set("systemParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemParameters: Self = this.set("systemParameters", js.undefined)
    
    @scala.inline
    def setSystemTypesVarargs(value: SchemaType*): Self = this.set("systemTypes", js.Array(value :_*))
    
    @scala.inline
    def setSystemTypes(value: js.Array[SchemaType]): Self = this.set("systemTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemTypes: Self = this.set("systemTypes", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: SchemaType*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[SchemaType]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    
    @scala.inline
    def setUsage(value: SchemaUsage): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
}
