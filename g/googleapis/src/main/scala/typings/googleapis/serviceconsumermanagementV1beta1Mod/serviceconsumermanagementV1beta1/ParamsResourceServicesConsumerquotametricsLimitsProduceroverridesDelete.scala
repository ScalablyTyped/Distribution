package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Whether to force the deletion of the quota override. Setting the force parameter to 'true' ignores all quota safety checks that would fail the request. QuotaSafetyCheck lists all such validations.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of quota safety checks to ignore before the override mutation. Unlike 'force' field that ignores all the quota safety checks, the 'force_only' field ignores only the specified checks; other checks are still enforced. The 'force' and 'force_only' fields cannot both be set.
    */
  var forceOnly: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The resource name of the override to delete. An example name would be: `services/compute.googleapis.com/projects/123/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/producerOverrides/4a3f2c1d`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesDelete {
  
  inline def apply(): ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesDelete]
  }
  
  extension [Self <: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesDelete](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceOnly(value: js.Array[String]): Self = StObject.set(x, "forceOnly", value.asInstanceOf[js.Any])
    
    inline def setForceOnlyUndefined: Self = StObject.set(x, "forceOnly", js.undefined)
    
    inline def setForceOnlyVarargs(value: String*): Self = StObject.set(x, "forceOnly", js.Array(value*))
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
