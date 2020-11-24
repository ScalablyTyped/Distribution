package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONEditorActionParams extends js.Object {
  
  @JSName("clone")
  var clone_FJSONEditorActionParams: js.UndefOr[JSONEditorNode] = js.native
  
  var endIndex: js.UndefOr[Double] = js.native
  
  var endParent: js.UndefOr[JSONEditorNode] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var newType: js.UndefOr[JSONEditorNodeType] = js.native
  
  var newValue: js.UndefOr[String] = js.native
  
  var node: js.UndefOr[JSONEditorNode] = js.native
  
  var oldType: js.UndefOr[JSONEditorNodeType] = js.native
  
  var oldValue: js.UndefOr[String] = js.native
  
  var parent: js.UndefOr[JSONEditorNode] = js.native
  
  var startIndex: js.UndefOr[Double] = js.native
  
  var startParent: js.UndefOr[JSONEditorNode] = js.native
}
object JSONEditorActionParams {
  
  @scala.inline
  def apply(): JSONEditorActionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorActionParams]
  }
  
  @scala.inline
  implicit class JSONEditorActionParamsOps[Self <: JSONEditorActionParams] (val x: Self) extends AnyVal {
    
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
    def setClone(value: JSONEditorNode): Self = this.set("clone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    
    @scala.inline
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    
    @scala.inline
    def setEndParent(value: JSONEditorNode): Self = this.set("endParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndParent: Self = this.set("endParent", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setNewType(value: JSONEditorNodeType): Self = this.set("newType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewType: Self = this.set("newType", js.undefined)
    
    @scala.inline
    def setNewValue(value: String): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    
    @scala.inline
    def setNode(value: JSONEditorNode): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setOldType(value: JSONEditorNodeType): Self = this.set("oldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldType: Self = this.set("oldType", js.undefined)
    
    @scala.inline
    def setOldValue(value: String): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
    
    @scala.inline
    def setParent(value: JSONEditorNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setStartParent(value: JSONEditorNode): Self = this.set("startParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartParent: Self = this.set("startParent", js.undefined)
  }
}
