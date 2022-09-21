package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3VersionVariantsVariant extends StObject {
  
  /**
    * Whether the variant is for the control group.
    */
  var isControlGroup: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Percentage of the traffic which should be routed to this version of flow. Traffic allocation for a single flow must sum up to 1.0.
    */
  var trafficAllocation: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the flow version. Format: `projects//locations//agents//flows//versions/`.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3VersionVariantsVariant {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3VersionVariantsVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3VersionVariantsVariant]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3VersionVariantsVariant](x: Self) {
    
    inline def setIsControlGroup(value: Boolean): Self = StObject.set(x, "isControlGroup", value.asInstanceOf[js.Any])
    
    inline def setIsControlGroupNull: Self = StObject.set(x, "isControlGroup", null)
    
    inline def setIsControlGroupUndefined: Self = StObject.set(x, "isControlGroup", js.undefined)
    
    inline def setTrafficAllocation(value: Double): Self = StObject.set(x, "trafficAllocation", value.asInstanceOf[js.Any])
    
    inline def setTrafficAllocationNull: Self = StObject.set(x, "trafficAllocation", null)
    
    inline def setTrafficAllocationUndefined: Self = StObject.set(x, "trafficAllocation", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
