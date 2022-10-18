package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

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
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Output only. Resource name of the Gateway. Format: projects/{project}/locations/{location}/gateways/{gateway} */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The current state of the Gateway. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Updated time. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object ApigatewayGateway {
  
  inline def apply(): ApigatewayGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayGateway]
  }
  
  extension [Self <: ApigatewayGateway](x: Self) {
    
    inline def setApiConfig(value: String): Self = StObject.set(x, "apiConfig", value.asInstanceOf[js.Any])
    
    inline def setApiConfigUndefined: Self = StObject.set(x, "apiConfig", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDefaultHostname(value: String): Self = StObject.set(x, "defaultHostname", value.asInstanceOf[js.Any])
    
    inline def setDefaultHostnameUndefined: Self = StObject.set(x, "defaultHostname", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
