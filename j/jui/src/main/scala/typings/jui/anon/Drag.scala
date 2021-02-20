package typings.jui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drag extends StObject {
  
  /**
    * @cfg {Boolean} [drag=false]
    * Changes the tab location through dragging
    */
  var drag: js.UndefOr[Boolean] = js.native
  
  var event: js.UndefOr[js.Any] = js.native
  
  /**
    * @cfg {Integer} [index=0]
    * Sets an enabled tab
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * @cfg {Array} nodes
    * Sets a tab list to data rather than markup
    */
  var nodes: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * @cfg {String/DOMElement} [target=""]
    * Determines a selector in the area to become the content of a tab
    */
  var target: js.UndefOr[String | js.Any] = js.native
  
  var tpl: js.UndefOr[js.Any] = js.native
}
object Drag {
  
  @scala.inline
  def apply(): Drag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Drag]
  }
  
  @scala.inline
  implicit class DragMutableBuilder[Self <: Drag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setNodes(value: js.Array[_]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: js.Any*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: String | js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
  }
}
