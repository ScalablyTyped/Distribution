package typings.javascriptObfuscator.eslintScopeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Definition extends js.Object {
  var `type`: /* import warning: importer.ImportType#apply Failed type conversion: eslint.eslint.Scope.Definition['type'] */ js.Any = js.native
}

object Definition {
  @scala.inline
  def apply(
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: eslint.eslint.Scope.Definition['type'] */ js.Any
  ): Definition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  implicit class DefinitionOps[Self <: Definition] (val x: Self) extends AnyVal {
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
    def setType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: eslint.eslint.Scope.Definition['type'] */ js.Any
    ): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

