package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementGatekeeperDeploymentState extends StObject {
  
  /**
    * Status of gatekeeper-audit deployment.
    */
  var gatekeeperAudit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of gatekeeper-controller-manager pod.
    */
  var gatekeeperControllerManagerState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the pod serving the mutation webhook.
    */
  var gatekeeperMutation: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementGatekeeperDeploymentState {
  
  inline def apply(): SchemaConfigManagementGatekeeperDeploymentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementGatekeeperDeploymentState]
  }
  
  extension [Self <: SchemaConfigManagementGatekeeperDeploymentState](x: Self) {
    
    inline def setGatekeeperAudit(value: String): Self = StObject.set(x, "gatekeeperAudit", value.asInstanceOf[js.Any])
    
    inline def setGatekeeperAuditNull: Self = StObject.set(x, "gatekeeperAudit", null)
    
    inline def setGatekeeperAuditUndefined: Self = StObject.set(x, "gatekeeperAudit", js.undefined)
    
    inline def setGatekeeperControllerManagerState(value: String): Self = StObject.set(x, "gatekeeperControllerManagerState", value.asInstanceOf[js.Any])
    
    inline def setGatekeeperControllerManagerStateNull: Self = StObject.set(x, "gatekeeperControllerManagerState", null)
    
    inline def setGatekeeperControllerManagerStateUndefined: Self = StObject.set(x, "gatekeeperControllerManagerState", js.undefined)
    
    inline def setGatekeeperMutation(value: String): Self = StObject.set(x, "gatekeeperMutation", value.asInstanceOf[js.Any])
    
    inline def setGatekeeperMutationNull: Self = StObject.set(x, "gatekeeperMutation", null)
    
    inline def setGatekeeperMutationUndefined: Self = StObject.set(x, "gatekeeperMutation", js.undefined)
  }
}
