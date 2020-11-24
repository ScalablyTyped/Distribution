package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroupsScopedList extends js.Object {
  
  /** [Output Only] A list of node groups contained in this scope. */
  var nodeGroups: js.UndefOr[js.Array[NodeGroup]] = js.native
  
  /** [Output Only] An informational warning that appears when the nodeGroup list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object NodeGroupsScopedList {
  
  @scala.inline
  def apply(): NodeGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupsScopedList]
  }
  
  @scala.inline
  implicit class NodeGroupsScopedListOps[Self <: NodeGroupsScopedList] (val x: Self) extends AnyVal {
    
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
    def setNodeGroupsVarargs(value: NodeGroup*): Self = this.set("nodeGroups", js.Array(value :_*))
    
    @scala.inline
    def setNodeGroups(value: js.Array[NodeGroup]): Self = this.set("nodeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeGroups: Self = this.set("nodeGroups", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
