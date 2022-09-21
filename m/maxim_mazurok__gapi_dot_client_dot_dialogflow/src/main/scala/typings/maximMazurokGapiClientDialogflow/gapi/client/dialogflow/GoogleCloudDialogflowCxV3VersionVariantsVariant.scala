package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3VersionVariantsVariant extends StObject {
  
  /** Whether the variant is for the control group. */
  var isControlGroup: js.UndefOr[Boolean] = js.undefined
  
  /** Percentage of the traffic which should be routed to this version of flow. Traffic allocation for a single flow must sum up to 1.0. */
  var trafficAllocation: js.UndefOr[Double] = js.undefined
  
  /** The name of the flow version. Format: `projects//locations//agents//flows//versions/`. */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3VersionVariantsVariant {
  
  inline def apply(): GoogleCloudDialogflowCxV3VersionVariantsVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3VersionVariantsVariant]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3VersionVariantsVariant](x: Self) {
    
    inline def setIsControlGroup(value: Boolean): Self = StObject.set(x, "isControlGroup", value.asInstanceOf[js.Any])
    
    inline def setIsControlGroupUndefined: Self = StObject.set(x, "isControlGroup", js.undefined)
    
    inline def setTrafficAllocation(value: Double): Self = StObject.set(x, "trafficAllocation", value.asInstanceOf[js.Any])
    
    inline def setTrafficAllocationUndefined: Self = StObject.set(x, "trafficAllocation", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
