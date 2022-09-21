package typings.googleapis.policysimulatorV1Mod.policysimulatorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicysimulatorV1ReplayDiff extends StObject {
  
  /**
    * A summary and comparison of the principal's access under the current (baseline) policies and the proposed (simulated) policies for a single access tuple. The evaluation of the principal's access is reported in the AccessState field.
    */
  var accessDiff: js.UndefOr[SchemaGoogleCloudPolicysimulatorV1AccessStateDiff] = js.undefined
}
object SchemaGoogleCloudPolicysimulatorV1ReplayDiff {
  
  inline def apply(): SchemaGoogleCloudPolicysimulatorV1ReplayDiff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicysimulatorV1ReplayDiff]
  }
  
  extension [Self <: SchemaGoogleCloudPolicysimulatorV1ReplayDiff](x: Self) {
    
    inline def setAccessDiff(value: SchemaGoogleCloudPolicysimulatorV1AccessStateDiff): Self = StObject.set(x, "accessDiff", value.asInstanceOf[js.Any])
    
    inline def setAccessDiffUndefined: Self = StObject.set(x, "accessDiff", js.undefined)
  }
}
