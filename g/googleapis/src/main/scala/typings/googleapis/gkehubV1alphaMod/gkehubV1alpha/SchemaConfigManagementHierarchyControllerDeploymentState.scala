package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementHierarchyControllerDeploymentState extends StObject {
  
  /**
    * The deployment state for Hierarchy Controller extension (e.g. v0.7.0-hc.1)
    */
  var `extension`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The deployment state for open source HNC (e.g. v0.7.0-hc.0)
    */
  var hnc: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementHierarchyControllerDeploymentState {
  
  inline def apply(): SchemaConfigManagementHierarchyControllerDeploymentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementHierarchyControllerDeploymentState]
  }
  
  extension [Self <: SchemaConfigManagementHierarchyControllerDeploymentState](x: Self) {
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionNull: Self = StObject.set(x, "extension", null)
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setHnc(value: String): Self = StObject.set(x, "hnc", value.asInstanceOf[js.Any])
    
    inline def setHncNull: Self = StObject.set(x, "hnc", null)
    
    inline def setHncUndefined: Self = StObject.set(x, "hnc", js.undefined)
  }
}
