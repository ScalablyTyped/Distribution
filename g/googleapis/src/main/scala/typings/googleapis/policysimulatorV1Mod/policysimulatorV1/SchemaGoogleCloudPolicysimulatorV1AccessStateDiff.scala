package typings.googleapis.policysimulatorV1Mod.policysimulatorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicysimulatorV1AccessStateDiff extends StObject {
  
  /**
    * How the principal's access, specified in the AccessState field, changed between the current (baseline) policies and proposed (simulated) policies.
    */
  var accessChange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The results of evaluating the access tuple under the current (baseline) policies. If the AccessState couldn't be fully evaluated, this field explains why.
    */
  var baseline: js.UndefOr[SchemaGoogleCloudPolicysimulatorV1ExplainedAccess] = js.undefined
  
  /**
    * The results of evaluating the access tuple under the proposed (simulated) policies. If the AccessState couldn't be fully evaluated, this field explains why.
    */
  var simulated: js.UndefOr[SchemaGoogleCloudPolicysimulatorV1ExplainedAccess] = js.undefined
}
object SchemaGoogleCloudPolicysimulatorV1AccessStateDiff {
  
  inline def apply(): SchemaGoogleCloudPolicysimulatorV1AccessStateDiff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicysimulatorV1AccessStateDiff]
  }
  
  extension [Self <: SchemaGoogleCloudPolicysimulatorV1AccessStateDiff](x: Self) {
    
    inline def setAccessChange(value: String): Self = StObject.set(x, "accessChange", value.asInstanceOf[js.Any])
    
    inline def setAccessChangeNull: Self = StObject.set(x, "accessChange", null)
    
    inline def setAccessChangeUndefined: Self = StObject.set(x, "accessChange", js.undefined)
    
    inline def setBaseline(value: SchemaGoogleCloudPolicysimulatorV1ExplainedAccess): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    inline def setSimulated(value: SchemaGoogleCloudPolicysimulatorV1ExplainedAccess): Self = StObject.set(x, "simulated", value.asInstanceOf[js.Any])
    
    inline def setSimulatedUndefined: Self = StObject.set(x, "simulated", js.undefined)
  }
}
