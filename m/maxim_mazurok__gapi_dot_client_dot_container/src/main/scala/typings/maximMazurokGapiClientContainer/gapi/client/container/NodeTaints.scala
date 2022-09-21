package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeTaints extends StObject {
  
  /** List of node taints. */
  var taints: js.UndefOr[js.Array[NodeTaint]] = js.undefined
}
object NodeTaints {
  
  inline def apply(): NodeTaints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeTaints]
  }
  
  extension [Self <: NodeTaints](x: Self) {
    
    inline def setTaints(value: js.Array[NodeTaint]): Self = StObject.set(x, "taints", value.asInstanceOf[js.Any])
    
    inline def setTaintsUndefined: Self = StObject.set(x, "taints", js.undefined)
    
    inline def setTaintsVarargs(value: NodeTaint*): Self = StObject.set(x, "taints", js.Array(value*))
  }
}
