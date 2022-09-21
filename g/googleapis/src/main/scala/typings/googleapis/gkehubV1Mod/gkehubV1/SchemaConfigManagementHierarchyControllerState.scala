package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementHierarchyControllerState extends StObject {
  
  /**
    * The deployment state for Hierarchy Controller
    */
  var state: js.UndefOr[SchemaConfigManagementHierarchyControllerDeploymentState] = js.undefined
  
  /**
    * The version for Hierarchy Controller
    */
  var version: js.UndefOr[SchemaConfigManagementHierarchyControllerVersion] = js.undefined
}
object SchemaConfigManagementHierarchyControllerState {
  
  inline def apply(): SchemaConfigManagementHierarchyControllerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementHierarchyControllerState]
  }
  
  extension [Self <: SchemaConfigManagementHierarchyControllerState](x: Self) {
    
    inline def setState(value: SchemaConfigManagementHierarchyControllerDeploymentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVersion(value: SchemaConfigManagementHierarchyControllerVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
