package typings.javascriptObfuscator.eslintScopeMod

import typings.eslintScope.mod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variable extends js.Object {
  var scope: Scope = js.native
}

object Variable {
  @scala.inline
  def apply(scope: Scope): Variable = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
  @scala.inline
  implicit class VariableOps[Self <: Variable] (val x: Self) extends AnyVal {
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
    def setScope(value: Scope): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}

