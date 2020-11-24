package typings.hbs.anon

import typings.handlebars.hbs.AST.helpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAST extends js.Object {
  
  val helpers: typings.handlebars.hbs.AST.helpers = js.native
}
object TypeofAST {
  
  @scala.inline
  def apply(helpers: helpers): TypeofAST = {
    val __obj = js.Dynamic.literal(helpers = helpers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAST]
  }
  
  @scala.inline
  implicit class TypeofASTOps[Self <: TypeofAST] (val x: Self) extends AnyVal {
    
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
    def setHelpers(value: helpers): Self = this.set("helpers", value.asInstanceOf[js.Any])
  }
}
