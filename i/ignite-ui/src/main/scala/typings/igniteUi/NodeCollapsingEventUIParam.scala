package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeCollapsingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the node object about to collapse.
    */
  var node: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the tree.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object NodeCollapsingEventUIParam {
  
  @scala.inline
  def apply(): NodeCollapsingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeCollapsingEventUIParam]
  }
  
  @scala.inline
  implicit class NodeCollapsingEventUIParamMutableBuilder[Self <: NodeCollapsingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: js.Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
