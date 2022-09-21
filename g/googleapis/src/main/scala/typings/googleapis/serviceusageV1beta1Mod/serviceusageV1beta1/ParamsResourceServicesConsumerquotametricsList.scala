package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesConsumerquotametricsList
  extends StObject
     with StandardParameters {
  
  /**
    * Requested size of the next page of data.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token identifying which result to start with; returned by a previous list call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Parent of the quotas resource. Some example names would be: `projects/123/services/serviceconsumermanagement.googleapis.com` `folders/345/services/serviceconsumermanagement.googleapis.com` `organizations/456/services/serviceconsumermanagement.googleapis.com`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the level of detail for quota information in the response.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesConsumerquotametricsList {
  
  inline def apply(): ParamsResourceServicesConsumerquotametricsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesConsumerquotametricsList]
  }
  
  extension [Self <: ParamsResourceServicesConsumerquotametricsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
