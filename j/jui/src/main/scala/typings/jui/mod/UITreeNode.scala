package typings.jui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UITreeNode extends js.Object {
  
  /** List of child nodes of a specified node */
  var children: js.UndefOr[js.Array[UITreeNode]] = js.native
  
  /** Data of a specified node */
  var data: js.UndefOr[js.Array[_]] = js.native
  
  /** Depth of a specified node */
  var depth: js.UndefOr[Double] = js.native
  
  /** LI element of a specified node */
  var element: js.UndefOr[js.Any] = js.native
  
  /** Index of a specified node  */
  var index: js.UndefOr[Double] = js.native
  
  /** Unique number of a specifiede node at the current depth */
  var nodenum: js.UndefOr[Double] = js.native
  
  /** Variable that refers to the parent of the current node */
  var parent: js.UndefOr[UITreeNode] = js.native
  
  /** State value that indicates whether a child node is shown or hidden */
  var `type`: js.UndefOr[String] = js.native
}
object UITreeNode {
  
  @scala.inline
  def apply(): UITreeNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UITreeNode]
  }
  
  @scala.inline
  implicit class UITreeNodeOps[Self <: UITreeNode] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: UITreeNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[UITreeNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setNodenum(value: Double): Self = this.set("nodenum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodenum: Self = this.set("nodenum", js.undefined)
    
    @scala.inline
    def setParent(value: UITreeNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
