package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewNode extends StObject {
  
  // Will change to be true after insert into Native dom.
  var _isMounted: Boolean
  
  // Relation nodes.
  var childNodes: js.Array[ViewNode]
  
  // Index number in children, will update at traverseChildren method.
  var index: Double
  
  // Component meta information, such as native component will use.
  var meta: NodeMeta
  
  var nextSibling: ViewNode | Null
  
  var nodeId: Double
  
  var parentNode: ViewNode | Null
  
  var prevSibling: ViewNode | Null
}
object ViewNode {
  
  inline def apply(_isMounted: Boolean, childNodes: js.Array[ViewNode], index: Double, meta: NodeMeta, nodeId: Double): ViewNode = {
    val __obj = js.Dynamic.literal(_isMounted = _isMounted.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], nextSibling = null, parentNode = null, prevSibling = null)
    __obj.asInstanceOf[ViewNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewNode] (val x: Self) extends AnyVal {
    
    inline def setChildNodes(value: js.Array[ViewNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    inline def setChildNodesVarargs(value: ViewNode*): Self = StObject.set(x, "childNodes", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: NodeMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setNextSibling(value: ViewNode): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    inline def setNextSiblingNull: Self = StObject.set(x, "nextSibling", null)
    
    inline def setNodeId(value: Double): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setParentNode(value: ViewNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
    
    inline def setPrevSibling(value: ViewNode): Self = StObject.set(x, "prevSibling", value.asInstanceOf[js.Any])
    
    inline def setPrevSiblingNull: Self = StObject.set(x, "prevSibling", null)
    
    inline def set_isMounted(value: Boolean): Self = StObject.set(x, "_isMounted", value.asInstanceOf[js.Any])
  }
}
