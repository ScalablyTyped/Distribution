package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV1Beta1ImportProducerOverridesRequest extends StObject {
  
  /**
    * Whether to force the creation of the quota overrides. Setting the force parameter to 'true' ignores all quota safety checks that would fail the request. QuotaSafetyCheck lists all such validations.
    */
  var force: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The list of quota safety checks to ignore before the override mutation. Unlike 'force' field that ignores all the quota safety checks, the 'force_only' field ignores only the specified checks; other checks are still enforced. The 'force' and 'force_only' fields cannot both be set.
    */
  var forceOnly: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The import data is specified in the request message itself
    */
  var inlineSource: js.UndefOr[SchemaV1Beta1OverrideInlineSource] = js.undefined
}
object SchemaV1Beta1ImportProducerOverridesRequest {
  
  inline def apply(): SchemaV1Beta1ImportProducerOverridesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV1Beta1ImportProducerOverridesRequest]
  }
  
  extension [Self <: SchemaV1Beta1ImportProducerOverridesRequest](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceNull: Self = StObject.set(x, "force", null)
    
    inline def setForceOnly(value: js.Array[String]): Self = StObject.set(x, "forceOnly", value.asInstanceOf[js.Any])
    
    inline def setForceOnlyNull: Self = StObject.set(x, "forceOnly", null)
    
    inline def setForceOnlyUndefined: Self = StObject.set(x, "forceOnly", js.undefined)
    
    inline def setForceOnlyVarargs(value: String*): Self = StObject.set(x, "forceOnly", js.Array(value*))
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setInlineSource(value: SchemaV1Beta1OverrideInlineSource): Self = StObject.set(x, "inlineSource", value.asInstanceOf[js.Any])
    
    inline def setInlineSourceUndefined: Self = StObject.set(x, "inlineSource", js.undefined)
  }
}
