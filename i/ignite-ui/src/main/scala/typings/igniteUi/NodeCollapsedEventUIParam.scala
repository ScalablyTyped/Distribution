package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeCollapsedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the collapsed node object.
    */
  var node: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the tree.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object NodeCollapsedEventUIParam {
  
  inline def apply(): NodeCollapsedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeCollapsedEventUIParam]
  }
  
  extension [Self <: NodeCollapsedEventUIParam](x: Self) {
    
    inline def setNode(value: js.Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
