package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveProjectRequest extends StObject {
  
  /** Required. The new parent to move the Project under. */
  var destinationParent: js.UndefOr[String] = js.undefined
}
object MoveProjectRequest {
  
  inline def apply(): MoveProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveProjectRequest]
  }
  
  extension [Self <: MoveProjectRequest](x: Self) {
    
    inline def setDestinationParent(value: String): Self = StObject.set(x, "destinationParent", value.asInstanceOf[js.Any])
    
    inline def setDestinationParentUndefined: Self = StObject.set(x, "destinationParent", js.undefined)
  }
}
