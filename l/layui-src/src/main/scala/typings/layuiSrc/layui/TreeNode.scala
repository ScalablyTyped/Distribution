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
  
  @scala.inline
  def apply(): TreeNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeNode]
  }
  
  @scala.inline
  implicit class TreeNodeMutableBuilder[Self <: TreeNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: TreeNode | js.Array[TreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: TreeNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
  }
}
