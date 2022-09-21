package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocalControllerState extends StObject {
  
  /**
    * Description represents the human readable description of the current state of the local PE controller
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * InstallationState represents the state of deployment of the local PE controller in the cluster.
    */
  var installationState: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocalControllerState {
  
  inline def apply(): SchemaLocalControllerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalControllerState]
  }
  
  extension [Self <: SchemaLocalControllerState](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInstallationState(value: String): Self = StObject.set(x, "installationState", value.asInstanceOf[js.Any])
    
    inline def setInstallationStateNull: Self = StObject.set(x, "installationState", null)
    
    inline def setInstallationStateUndefined: Self = StObject.set(x, "installationState", js.undefined)
  }
}
