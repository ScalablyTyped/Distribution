package typings.layuiSrc.layui

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeNode
  extends StObject
     with /* propName */ StringDictionary[js.Any] {
  
  var children: js.UndefOr[TreeNode | js.Array[TreeNode]] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var spread: js.UndefOr[Boolean] = js.undefined
}
object TreeNode {
  
  inline def apply(): TreeNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeNode]
  }
  
  extension [Self <: TreeNode](x: Self) {
    
    inline def setChildren(value: TreeNode | js.Array[TreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: TreeNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
  }
}
