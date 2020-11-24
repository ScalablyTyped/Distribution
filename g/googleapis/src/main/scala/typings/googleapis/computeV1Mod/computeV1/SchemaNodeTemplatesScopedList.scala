package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNodeTemplatesScopedList extends js.Object {
  
  /**
    * [Output Only] A list of node templates contained in this scope.
    */
  var nodeTemplates: js.UndefOr[js.Array[SchemaNodeTemplate]] = js.native
  
  /**
    * [Output Only] An informational warning that appears when the node
    * templates list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaNodeTemplatesScopedList {
  
  @scala.inline
  def apply(): SchemaNodeTemplatesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTemplatesScopedList]
  }
  
  @scala.inline
  implicit class SchemaNodeTemplatesScopedListOps[Self <: SchemaNodeTemplatesScopedList] (val x: Self) extends AnyVal {
    
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
    def setNodeTemplatesVarargs(value: SchemaNodeTemplate*): Self = this.set("nodeTemplates", js.Array(value :_*))
    
    @scala.inline
    def setNodeTemplates(value: js.Array[SchemaNodeTemplate]): Self = this.set("nodeTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeTemplates: Self = this.set("nodeTemplates", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
