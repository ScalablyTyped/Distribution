package typings.jqueryFancytree.Fancytree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Data object similar to NodeData, but with additional options.
  * May be passed to FancytreeNode#applyPatch (Every property that is omitted (or set to undefined) will be ignored)  */
trait NodePatch extends StObject {
  
  /** (not yet implemented) */
  var appendChildren: js.UndefOr[NodeData] = js.undefined
  
  /** (not yet implemented) */
  var insertChildren: js.UndefOr[NodeData] = js.undefined
  
  /** (not yet implemented) */
  var replaceChildren: js.UndefOr[NodeData] = js.undefined
}
object NodePatch {
  
  inline def apply(): NodePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePatch]
  }
  
  extension [Self <: NodePatch](x: Self) {
    
    inline def setAppendChildren(value: NodeData): Self = StObject.set(x, "appendChildren", value.asInstanceOf[js.Any])
    
    inline def setAppendChildrenUndefined: Self = StObject.set(x, "appendChildren", js.undefined)
    
    inline def setInsertChildren(value: NodeData): Self = StObject.set(x, "insertChildren", value.asInstanceOf[js.Any])
    
    inline def setInsertChildrenUndefined: Self = StObject.set(x, "insertChildren", js.undefined)
    
    inline def setReplaceChildren(value: NodeData): Self = StObject.set(x, "replaceChildren", value.asInstanceOf[js.Any])
    
    inline def setReplaceChildrenUndefined: Self = StObject.set(x, "replaceChildren", js.undefined)
  }
}
