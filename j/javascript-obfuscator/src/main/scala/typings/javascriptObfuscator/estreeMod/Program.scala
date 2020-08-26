package typings.javascriptObfuscator.estreeMod

import typings.eslintScope.mod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Program extends BaseNode {
  var scope: js.UndefOr[Scope | Null] = js.native
}

object Program {
  @scala.inline
  def apply(): Program = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Program]
  }
  @scala.inline
  implicit class ProgramOps[Self <: Program] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setScopeNull: Self = this.set("scope", null)
  }
  
}

