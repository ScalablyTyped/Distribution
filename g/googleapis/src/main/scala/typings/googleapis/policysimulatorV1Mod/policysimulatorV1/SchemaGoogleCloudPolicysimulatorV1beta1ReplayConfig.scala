package typings.googleapis.policysimulatorV1Mod.policysimulatorV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicysimulatorV1beta1ReplayConfig extends StObject {
  
  /**
    * The logs to use as input for the Replay.
    */
  var logSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A mapping of the resources that you want to simulate policies for and the policies that you want to simulate. Keys are the full resource names for the resources. For example, `//cloudresourcemanager.googleapis.com/projects/my-project`. For examples of full resource names for Google Cloud services, see https://cloud.google.com/iam/help/troubleshooter/full-resource-names. Values are Policy objects representing the policies that you want to simulate. Replays automatically take into account any IAM policies inherited through the resource hierarchy, and any policies set on descendant resources. You do not need to include these policies in the policy overlay.
    */
  var policyOverlay: js.UndefOr[StringDictionary[SchemaGoogleIamV1Policy] | Null] = js.undefined
}
object SchemaGoogleCloudPolicysimulatorV1beta1ReplayConfig {
  
  inline def apply(): SchemaGoogleCloudPolicysimulatorV1beta1ReplayConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicysimulatorV1beta1ReplayConfig]
  }
  
  extension [Self <: SchemaGoogleCloudPolicysimulatorV1beta1ReplayConfig](x: Self) {
    
    inline def setLogSource(value: String): Self = StObject.set(x, "logSource", value.asInstanceOf[js.Any])
    
    inline def setLogSourceNull: Self = StObject.set(x, "logSource", null)
    
    inline def setLogSourceUndefined: Self = StObject.set(x, "logSource", js.undefined)
    
    inline def setPolicyOverlay(value: StringDictionary[SchemaGoogleIamV1Policy]): Self = StObject.set(x, "policyOverlay", value.asInstanceOf[js.Any])
    
    inline def setPolicyOverlayNull: Self = StObject.set(x, "policyOverlay", null)
    
    inline def setPolicyOverlayUndefined: Self = StObject.set(x, "policyOverlay", js.undefined)
  }
}
