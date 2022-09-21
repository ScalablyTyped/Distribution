package typings.googleapis.policysimulatorV1beta1Mod.policysimulatorV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicysimulatorV1beta1ReplayDiff extends StObject {
  
  /**
    * A summary and comparison of the member's access under the current (baseline) policies and the proposed (simulated) policies for a single access tuple. The evaluation of the member's access is reported in the AccessState field.
    */
  var accessDiff: js.UndefOr[SchemaGoogleCloudPolicysimulatorV1beta1AccessStateDiff] = js.undefined
}
object SchemaGoogleCloudPolicysimulatorV1beta1ReplayDiff {
  
  inline def apply(): SchemaGoogleCloudPolicysimulatorV1beta1ReplayDiff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicysimulatorV1beta1ReplayDiff]
  }
  
  extension [Self <: SchemaGoogleCloudPolicysimulatorV1beta1ReplayDiff](x: Self) {
    
    inline def setAccessDiff(value: SchemaGoogleCloudPolicysimulatorV1beta1AccessStateDiff): Self = StObject.set(x, "accessDiff", value.asInstanceOf[js.Any])
    
    inline def setAccessDiffUndefined: Self = StObject.set(x, "accessDiff", js.undefined)
  }
}
