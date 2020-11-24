package typings.knockout.mod

import typings.knockout.mod.utils.MappingOptions
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingTemplateOptions
  extends TemplateOptions[js.Any]
     with MappingOptions[js.Any] {
  
  var as: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var foreach: js.UndefOr[js.Array[_]] = js.native
  
  var `if`: js.UndefOr[Boolean] = js.native
  
  var ifnot: js.UndefOr[Boolean] = js.native
  
  var includeDestroyed: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String | (js.Function1[/* val */ js.Any, String])] = js.native
  
  var nodes: js.UndefOr[js.Array[Node]] = js.native
}
object BindingTemplateOptions {
  
  @scala.inline
  def apply(): BindingTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingTemplateOptions]
  }
  
  @scala.inline
  implicit class BindingTemplateOptionsOps[Self <: BindingTemplateOptions] (val x: Self) extends AnyVal {
    
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
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setForeachVarargs(value: js.Any*): Self = this.set("foreach", js.Array(value :_*))
    
    @scala.inline
    def setForeach(value: js.Array[_]): Self = this.set("foreach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeach: Self = this.set("foreach", js.undefined)
    
    @scala.inline
    def setIf(value: Boolean): Self = this.set("if", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIf: Self = this.set("if", js.undefined)
    
    @scala.inline
    def setIfnot(value: Boolean): Self = this.set("ifnot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfnot: Self = this.set("ifnot", js.undefined)
    
    @scala.inline
    def setIncludeDestroyed(value: Boolean): Self = this.set("includeDestroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDestroyed: Self = this.set("includeDestroyed", js.undefined)
    
    @scala.inline
    def setNameFunction1(value: /* val */ js.Any => String): Self = this.set("name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String | (js.Function1[/* val */ js.Any, String])): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: Node*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
  }
}
