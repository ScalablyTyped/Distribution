package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Whether to force the creation of the quota override. Setting the force parameter to 'true' ignores all quota safety checks that would fail the request. QuotaSafetyCheck lists all such validations.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of quota safety checks to ignore before the override mutation. Unlike 'force' field that ignores all the quota safety checks, the 'force_only' field ignores only the specified checks; other checks are still enforced. The 'force' and 'force_only' fields cannot both be set.
    */
  var forceOnly: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The resource name of the parent quota limit, returned by a ListConsumerQuotaMetrics or GetConsumerQuotaMetric call. An example name would be: `services/compute.googleapis.com/projects/123/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaV1Beta1QuotaOverride] = js.undefined
}
object ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesCreate {
  
  inline def apply(): ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesCreate]
  }
  
  extension [Self <: ParamsResourceServicesConsumerquotametricsLimitsProduceroverridesCreate](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceOnly(value: js.Array[String]): Self = StObject.set(x, "forceOnly", value.asInstanceOf[js.Any])
    
    inline def setForceOnlyUndefined: Self = StObject.set(x, "forceOnly", js.undefined)
    
    inline def setForceOnlyVarargs(value: String*): Self = StObject.set(x, "forceOnly", js.Array(value*))
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaV1Beta1QuotaOverride): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
