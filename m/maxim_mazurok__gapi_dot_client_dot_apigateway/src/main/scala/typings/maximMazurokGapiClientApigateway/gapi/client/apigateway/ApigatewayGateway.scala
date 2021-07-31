package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApigatewayGateway extends StObject {
  
  /** Required. Resource name of the API Config for this Gateway. Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig} */
  var apiConfig: js.UndefOr[String] = js.undefined
  
  /** Output only. Created time. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The default API Gateway host name of the form `{gateway_id}-{hash}.{region_code}.gateway.dev`. */
  var defaultHostname: js.UndefOr[String] = js.undefined
  
  /** Optional. Display name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.ApigatewayGateway & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. Resource name of the Gateway. Format: projects/{project}/locations/{location}/gateways/{gateway} */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The current state of the Gateway. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Updated time. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object ApigatewayGateway {
  
  @scala.inline
  def apply(): ApigatewayGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayGateway]
  }
  
  @scala.inline
  implicit class ApigatewayGatewayMutableBuilder[Self <: ApigatewayGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiConfig(value: String): Self = StObject.set(x, "apiConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiConfigUndefined: Self = StObject.set(x, "apiConfig", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDefaultHostname(value: String): Self = StObject.set(x, "defaultHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHostnameUndefined: Self = StObject.set(x, "defaultHostname", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.ApigatewayGateway & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
