package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalMoveNodeRequest extends StObject {
  
  /**
    * Required. The name of the new parent resource node or customer to reparent the node under.
    */
  var destination: js.UndefOr[String | Null] = js.undefined
}
object SchemaSasPortalMoveNodeRequest {
  
  inline def apply(): SchemaSasPortalMoveNodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalMoveNodeRequest]
  }
  
  extension [Self <: SchemaSasPortalMoveNodeRequest](x: Self) {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationNull: Self = StObject.set(x, "destination", null)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
