package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementPolicyControllerState extends StObject {
  
  /**
    * The state about the policy controller installation.
    */
  var deploymentState: js.UndefOr[SchemaConfigManagementGatekeeperDeploymentState] = js.undefined
  
  /**
    * The version of Gatekeeper Policy Controller deployed.
    */
  var version: js.UndefOr[SchemaConfigManagementPolicyControllerVersion] = js.undefined
}
object SchemaConfigManagementPolicyControllerState {
  
  inline def apply(): SchemaConfigManagementPolicyControllerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementPolicyControllerState]
  }
  
  extension [Self <: SchemaConfigManagementPolicyControllerState](x: Self) {
    
    inline def setDeploymentState(value: SchemaConfigManagementGatekeeperDeploymentState): Self = StObject.set(x, "deploymentState", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStateUndefined: Self = StObject.set(x, "deploymentState", js.undefined)
    
    inline def setVersion(value: SchemaConfigManagementPolicyControllerVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
