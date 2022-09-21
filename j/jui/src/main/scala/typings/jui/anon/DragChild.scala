package typings.jui.anon

import typings.jui.mod.UITreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragChild extends StObject {
  
  /**
    * @cfg {Boolean} [drag=false]
    * It is possible to drag the movement of a node.
    */
  var drag: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @cfg {Boolean} [dragChild=true]
    * It is possible to drag the node movement but the node is not changed to a child node of the target node.
    */
  var dragChild: js.UndefOr[Boolean] = js.undefined
  
  var event: js.UndefOr[Any] = js.undefined
  
  /**
    * @cfg {NodeObject} [root=null]
    * Adds a root node (required).
    */
  var root: js.UndefOr[UITreeNode] = js.undefined
  
  /**
    * @cfg {Boolean} [rootFold=false]
    * Folds up a root node.
    */
  var rootFold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @cfg {Boolean} [rootHide=false]
    * Hides a root node.
    */
  var rootHide: js.UndefOr[Boolean] = js.undefined
  
  var tpl: js.UndefOr[Any] = js.undefined
}
object DragChild {
  
  inline def apply(): DragChild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragChild]
  }
  
  extension [Self <: DragChild](x: Self) {
    
    inline def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragChild(value: Boolean): Self = StObject.set(x, "dragChild", value.asInstanceOf[js.Any])
    
    inline def setDragChildUndefined: Self = StObject.set(x, "dragChild", js.undefined)
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setRoot(value: UITreeNode): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFold(value: Boolean): Self = StObject.set(x, "rootFold", value.asInstanceOf[js.Any])
    
    inline def setRootFoldUndefined: Self = StObject.set(x, "rootFold", js.undefined)
    
    inline def setRootHide(value: Boolean): Self = StObject.set(x, "rootHide", value.asInstanceOf[js.Any])
    
    inline def setRootHideUndefined: Self = StObject.set(x, "rootHide", js.undefined)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setTpl(value: Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
  }
}
