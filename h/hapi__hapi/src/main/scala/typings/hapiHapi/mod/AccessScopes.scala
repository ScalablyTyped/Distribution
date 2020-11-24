package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessScopes extends js.Object {
  
  var forbidden: js.UndefOr[js.Array[String]] = js.native
  
  var required: js.UndefOr[js.Array[String]] = js.native
  
  var selection: js.UndefOr[js.Array[String]] = js.native
}
object AccessScopes {
  
  @scala.inline
  def apply(): AccessScopes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessScopes]
  }
  
  @scala.inline
  implicit class AccessScopesOps[Self <: AccessScopes] (val x: Self) extends AnyVal {
    
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
    def setForbiddenVarargs(value: String*): Self = this.set("forbidden", js.Array(value :_*))
    
    @scala.inline
    def setForbidden(value: js.Array[String]): Self = this.set("forbidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForbidden: Self = this.set("forbidden", js.undefined)
    
    @scala.inline
    def setRequiredVarargs(value: String*): Self = this.set("required", js.Array(value :_*))
    
    @scala.inline
    def setRequired(value: js.Array[String]): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setSelectionVarargs(value: String*): Self = this.set("selection", js.Array(value :_*))
    
    @scala.inline
    def setSelection(value: js.Array[String]): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
  }
}
