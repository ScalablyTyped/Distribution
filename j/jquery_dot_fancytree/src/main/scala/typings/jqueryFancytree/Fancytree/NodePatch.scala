package typings.jqueryFancytree.Fancytree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Data object similar to NodeData, but with additional options.
  * May be passed to FancytreeNode#applyPatch (Every property that is omitted (or set to undefined) will be ignored)  */
@js.native
trait NodePatch extends StObject {
  
  /** (not yet implemented) */
  var appendChildren: js.UndefOr[NodeData] = js.native
  
  /** (not yet implemented) */
  var insertChildren: js.UndefOr[NodeData] = js.native
  
  /** (not yet implemented) */
  var replaceChildren: js.UndefOr[NodeData] = js.native
}
object NodePatch {
  
  @scala.inline
  def apply(): NodePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePatch]
  }
  
  @scala.inline
  implicit class NodePatchMutableBuilder[Self <: NodePatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendChildren(value: NodeData): Self = StObject.set(x, "appendChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendChildrenUndefined: Self = StObject.set(x, "appendChildren", js.undefined)
    
    @scala.inline
    def setInsertChildren(value: NodeData): Self = StObject.set(x, "insertChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertChildrenUndefined: Self = StObject.set(x, "insertChildren", js.undefined)
    
    @scala.inline
    def setReplaceChildren(value: NodeData): Self = StObject.set(x, "replaceChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceChildrenUndefined: Self = StObject.set(x, "replaceChildren", js.undefined)
  }
}
