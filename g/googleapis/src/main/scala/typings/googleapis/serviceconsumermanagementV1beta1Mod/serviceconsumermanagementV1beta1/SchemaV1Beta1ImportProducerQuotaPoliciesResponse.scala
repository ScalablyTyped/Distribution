package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV1Beta1ImportProducerQuotaPoliciesResponse extends StObject {
  
  /**
    * The policies that were created from the imported data.
    */
  var policies: js.UndefOr[js.Array[SchemaV1Beta1ProducerQuotaPolicy]] = js.undefined
}
object SchemaV1Beta1ImportProducerQuotaPoliciesResponse {
  
  inline def apply(): SchemaV1Beta1ImportProducerQuotaPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV1Beta1ImportProducerQuotaPoliciesResponse]
  }
  
  extension [Self <: SchemaV1Beta1ImportProducerQuotaPoliciesResponse](x: Self) {
    
    inline def setPolicies(value: js.Array[SchemaV1Beta1ProducerQuotaPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: SchemaV1Beta1ProducerQuotaPolicy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
