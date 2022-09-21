package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNodesNodesMove
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the node to move.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSasPortalMoveNodeRequest] = js.undefined
}
object ParamsResourceNodesNodesMove {
  
  inline def apply(): ParamsResourceNodesNodesMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNodesNodesMove]
  }
  
  extension [Self <: ParamsResourceNodesNodesMove](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaSasPortalMoveNodeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
