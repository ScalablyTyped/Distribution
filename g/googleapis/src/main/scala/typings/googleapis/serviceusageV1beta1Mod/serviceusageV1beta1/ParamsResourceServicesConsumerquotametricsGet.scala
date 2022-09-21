package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesConsumerquotametricsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the quota limit. An example name would be: `projects/123/services/serviceusage.googleapis.com/quotas/metrics/serviceusage.googleapis.com%2Fmutate_requests`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the level of detail for quota information in the response.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesConsumerquotametricsGet {
  
  inline def apply(): ParamsResourceServicesConsumerquotametricsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesConsumerquotametricsGet]
  }
  
  extension [Self <: ParamsResourceServicesConsumerquotametricsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
