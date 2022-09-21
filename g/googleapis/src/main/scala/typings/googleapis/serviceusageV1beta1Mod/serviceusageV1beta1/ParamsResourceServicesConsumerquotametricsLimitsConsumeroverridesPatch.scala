package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesConsumerquotametricsLimitsConsumeroverridesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Whether to force the update of the quota override. Setting the force parameter to 'true' ignores all quota safety checks that would fail the request. QuotaSafetyCheck lists all such validations.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of quota safety checks to ignore before the override mutation. Unlike 'force' field that ignores all the quota safety checks, the 'force_only' field ignores only the specified checks; other checks are still enforced. The 'force' and 'force_only' fields cannot both be set.
    */
  var forceOnly: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The resource name of the override to update. An example name would be: `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/consumerOverrides/4a3f2c1d`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaQuotaOverride] = js.undefined
  
  /**
    * Update only the specified fields of the override. If unset, all fields will be updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesConsumerquotametricsLimitsConsumeroverridesPatch {
  
  inline def apply(): ParamsResourceServicesConsumerquotametricsLimitsConsumeroverridesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesConsumerquotametricsLimitsConsumeroverridesPatch]
  }
  
  extension [Self <: ParamsResourceServicesConsumerquotametricsLimitsConsumeroverridesPatch](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceOnly(value: js.Array[String]): Self = StObject.set(x, "forceOnly", value.asInstanceOf[js.Any])
    
    inline def setForceOnlyUndefined: Self = StObject.set(x, "forceOnly", js.undefined)
    
    inline def setForceOnlyVarargs(value: String*): Self = StObject.set(x, "forceOnly", js.Array(value*))
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaQuotaOverride): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
