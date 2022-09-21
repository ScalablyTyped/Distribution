package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalMoveDeploymentRequest extends StObject {
  
  /**
    * Required. The name of the new parent resource node or customer to reparent the deployment under.
    */
  var destination: js.UndefOr[String | Null] = js.undefined
}
object SchemaSasPortalMoveDeploymentRequest {
  
  inline def apply(): SchemaSasPortalMoveDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalMoveDeploymentRequest]
  }
  
  extension [Self <: SchemaSasPortalMoveDeploymentRequest](x: Self) {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationNull: Self = StObject.set(x, "destination", null)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
