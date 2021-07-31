package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApigatewayApi extends StObject {
  
  /** Output only. Created time. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Optional. Display name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.ApigatewayApi & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * Optional. Immutable. The name of a Google Managed Service ( https://cloud.google.com/service-infrastructure/docs/glossary#managed). If not specified, a new Service will
    * automatically be created in the same project as this API.
    */
  var managedService: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource name of the API. Format: projects/{project}/locations/global/apis/{api} */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. State of the API. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Updated time. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object ApigatewayApi {
  
  @scala.inline
  def apply(): ApigatewayApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayApi]
  }
  
  @scala.inline
  implicit class ApigatewayApiMutableBuilder[Self <: ApigatewayApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.ApigatewayApi & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setManagedService(value: String): Self = StObject.set(x, "managedService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedServiceUndefined: Self = StObject.set(x, "managedService", js.undefined)
    
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
