package typings.jui.anon

import typings.jui.mod.UITreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragChild extends StObject {
  
  /**
    * @cfg {Boolean} [drag=false]
    * It is possible to drag the movement of a node.
    */
  var drag: js.UndefOr[Boolean] = js.native
  
  /**
    * @cfg {Boolean} [dragChild=true]
    * It is possible to drag the node movement but the node is not changed to a child node of the target node.
    */
  var dragChild: js.UndefOr[Boolean] = js.native
  
  var event: js.UndefOr[js.Any] = js.native
  
  /**
    * @cfg {NodeObject} [root=null]
    * Adds a root node (required).
    */
  var root: js.UndefOr[UITreeNode] = js.native
  
  /**
    * @cfg {Boolean} [rootFold=false]
    * Folds up a root node.
    */
  var rootFold: js.UndefOr[Boolean] = js.native
  
  /**
    * @cfg {Boolean} [rootHide=false]
    * Hides a root node.
    */
  var rootHide: js.UndefOr[Boolean] = js.native
  
  var tpl: js.UndefOr[js.Any] = js.native
}
object DragChild {
  
  @scala.inline
  def apply(): DragChild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragChild]
  }
  
  @scala.inline
  implicit class DragChildMutableBuilder[Self <: DragChild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragChild(value: Boolean): Self = StObject.set(x, "dragChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragChildUndefined: Self = StObject.set(x, "dragChild", js.undefined)
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setRoot(value: UITreeNode): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFold(value: Boolean): Self = StObject.set(x, "rootFold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFoldUndefined: Self = StObject.set(x, "rootFold", js.undefined)
    
    @scala.inline
    def setRootHide(value: Boolean): Self = StObject.set(x, "rootHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootHideUndefined: Self = StObject.set(x, "rootHide", js.undefined)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
  }
}
