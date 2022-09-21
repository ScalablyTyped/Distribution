package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAvailableUpdates extends StObject {
  
  /**
    * The latest version for in place update. The current appliance can be updated to this version using the API or m4c CLI.
    */
  var inPlaceUpdate: js.UndefOr[SchemaApplianceVersion] = js.undefined
  
  /**
    * The newest deployable version of the appliance. The current appliance can't be updated into this version, and the owner must manually deploy this OVA to a new appliance.
    */
  var newDeployableAppliance: js.UndefOr[SchemaApplianceVersion] = js.undefined
}
object SchemaAvailableUpdates {
  
  inline def apply(): SchemaAvailableUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAvailableUpdates]
  }
  
  extension [Self <: SchemaAvailableUpdates](x: Self) {
    
    inline def setInPlaceUpdate(value: SchemaApplianceVersion): Self = StObject.set(x, "inPlaceUpdate", value.asInstanceOf[js.Any])
    
    inline def setInPlaceUpdateUndefined: Self = StObject.set(x, "inPlaceUpdate", js.undefined)
    
    inline def setNewDeployableAppliance(value: SchemaApplianceVersion): Self = StObject.set(x, "newDeployableAppliance", value.asInstanceOf[js.Any])
    
    inline def setNewDeployableApplianceUndefined: Self = StObject.set(x, "newDeployableAppliance", js.undefined)
  }
}
