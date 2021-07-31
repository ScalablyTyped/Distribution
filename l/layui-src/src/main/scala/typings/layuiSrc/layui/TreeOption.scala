package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeOption extends StObject {
  
  var click: js.UndefOr[js.Function1[/* node */ TreeNode, Unit]] = js.undefined
  
  var elem: js.UndefOr[String] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var nodes: js.UndefOr[TreeNode | js.Array[TreeNode]] = js.undefined
  
  var skin: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object TreeOption {
  
  @scala.inline
  def apply(): TreeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeOption]
  }
  
  @scala.inline
  implicit class TreeOptionMutableBuilder[Self <: TreeOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: /* node */ TreeNode => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setElem(value: String): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setNodes(value: TreeNode | js.Array[TreeNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: TreeNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setSkin(value: String): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
