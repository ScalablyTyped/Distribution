package typings.layuiSrc.layui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeOption extends js.Object {
  
  var click: js.UndefOr[js.Function1[/* node */ TreeNode, Unit]] = js.native
  
  var elem: js.UndefOr[String] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var nodes: js.UndefOr[TreeNode | js.Array[TreeNode]] = js.native
  
  var skin: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[String] = js.native
}
object TreeOption {
  
  @scala.inline
  def apply(): TreeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeOption]
  }
  
  @scala.inline
  implicit class TreeOptionOps[Self <: TreeOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClick(value: /* node */ TreeNode => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setElem(value: String): Self = this.set("elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElem: Self = this.set("elem", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: TreeNode*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: TreeNode | js.Array[TreeNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    
    @scala.inline
    def setSkin(value: String): Self = this.set("skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
