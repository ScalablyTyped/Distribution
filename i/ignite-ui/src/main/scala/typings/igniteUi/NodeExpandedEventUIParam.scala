package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeExpandedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the expanded node object.
    */
  var node: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the tree.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object NodeExpandedEventUIParam {
  
  inline def apply(): NodeExpandedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeExpandedEventUIParam]
  }
  
  extension [Self <: NodeExpandedEventUIParam](x: Self) {
    
    inline def setNode(value: Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
