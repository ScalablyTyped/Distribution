package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApigatewayApiConfig extends js.Object {
  
  /** Output only. Created time. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Optional. Display name. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Immutable. Gateway specific configuration. If not specified, backend authentication will be set to use OIDC authentication using the default compute service account. */
  var gatewayConfig: js.UndefOr[ApigatewayGatewayConfig] = js.native
  
  /** Optional. gRPC service definition files. If specified, openapi_documents must not be included. */
  var grpcServices: js.UndefOr[js.Array[ApigatewayApiConfigGrpcServiceDefinition]] = js.native
  
  /** Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.ApigatewayApiConfig with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https: //cloud.google.com/endpoints/docs/grpc/g //
    * rpc-service-config#service_configuration_overview for the expected file contents. If multiple files are specified, the files are merged with the following rules: * All singular
    * scalar fields are merged using "last one wins" semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these
    * rules for nested fields.
    */
  var managedServiceConfigs: js.UndefOr[js.Array[ApigatewayApiConfigFile]] = js.native
  
  /** Output only. Resource name of the API Config. Format: projects/{project}/locations/global/apis/{api}/configs/{api_config} */
  var name: js.UndefOr[String] = js.native
  
  /** Optional. OpenAPI specification documents. If specified, grpc_services and managed_service_config must not be included. */
  var openapiDocuments: js.UndefOr[js.Array[ApigatewayApiConfigOpenApiDocument]] = js.native
  
  /** Output only. The ID of the associated Service Config ( https://cloud.google.com/service-infrastructure/docs/glossary#config). */
  var serviceConfigId: js.UndefOr[String] = js.native
  
  /** Output only. State of the API Config. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. Updated time. */
  var updateTime: js.UndefOr[String] = js.native
}
object ApigatewayApiConfig {
  
  @scala.inline
  def apply(): ApigatewayApiConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayApiConfig]
  }
  
  @scala.inline
  implicit class ApigatewayApiConfigOps[Self <: ApigatewayApiConfig] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setGatewayConfig(value: ApigatewayGatewayConfig): Self = this.set("gatewayConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayConfig: Self = this.set("gatewayConfig", js.undefined)
    
    @scala.inline
    def setGrpcServicesVarargs(value: ApigatewayApiConfigGrpcServiceDefinition*): Self = this.set("grpcServices", js.Array(value :_*))
    
    @scala.inline
    def setGrpcServices(value: js.Array[ApigatewayApiConfigGrpcServiceDefinition]): Self = this.set("grpcServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrpcServices: Self = this.set("grpcServices", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.ApigatewayApiConfig with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setManagedServiceConfigsVarargs(value: ApigatewayApiConfigFile*): Self = this.set("managedServiceConfigs", js.Array(value :_*))
    
    @scala.inline
    def setManagedServiceConfigs(value: js.Array[ApigatewayApiConfigFile]): Self = this.set("managedServiceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedServiceConfigs: Self = this.set("managedServiceConfigs", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpenapiDocumentsVarargs(value: ApigatewayApiConfigOpenApiDocument*): Self = this.set("openapiDocuments", js.Array(value :_*))
    
    @scala.inline
    def setOpenapiDocuments(value: js.Array[ApigatewayApiConfigOpenApiDocument]): Self = this.set("openapiDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenapiDocuments: Self = this.set("openapiDocuments", js.undefined)
    
    @scala.inline
    def setServiceConfigId(value: String): Self = this.set("serviceConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceConfigId: Self = this.set("serviceConfigId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
