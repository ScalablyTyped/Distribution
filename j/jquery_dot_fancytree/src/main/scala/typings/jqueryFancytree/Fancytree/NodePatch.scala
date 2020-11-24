package typings.jqueryFancytree.Fancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Data object similar to NodeData, but with additional options.
  * May be passed to FancytreeNode#applyPatch (Every property that is omitted (or set to undefined) will be ignored)  */
@js.native
trait NodePatch extends js.Object {
  
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
  implicit class NodePatchOps[Self <: NodePatch] (val x: Self) extends AnyVal {
    
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
    def setAppendChildren(value: NodeData): Self = this.set("appendChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendChildren: Self = this.set("appendChildren", js.undefined)
    
    @scala.inline
    def setInsertChildren(value: NodeData): Self = this.set("insertChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertChildren: Self = this.set("insertChildren", js.undefined)
    
    @scala.inline
    def setReplaceChildren(value: NodeData): Self = this.set("replaceChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceChildren: Self = this.set("replaceChildren", js.undefined)
  }
}
