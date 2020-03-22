package typings.javascriptObfuscator.eslintScopeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition extends js.Object {
  var `type`: /* import warning: importer.ImportType#apply Failed type conversion: eslint.eslint.Scope.Definition['type'] */ js.Any
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
}

