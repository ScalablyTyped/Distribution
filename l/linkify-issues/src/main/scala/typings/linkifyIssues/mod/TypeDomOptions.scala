package typings.linkifyIssues.mod

import typings.linkifyIssues.linkifyIssuesStrings.dom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeDomOptions extends Options {
  
  @JSName("type")
  var type_TypeDomOptions: dom = js.native
}
object TypeDomOptions {
  
  @scala.inline
  def apply(repository: String, `type`: dom, user: String): TypeDomOptions = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDomOptions]
  }
  
  @scala.inline
  implicit class TypeDomOptionsOps[Self <: TypeDomOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: dom): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
