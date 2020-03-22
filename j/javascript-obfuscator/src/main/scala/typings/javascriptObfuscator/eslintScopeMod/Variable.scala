package typings.javascriptObfuscator.eslintScopeMod

import typings.eslintScope.mod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  var scope: Scope
}

object Variable {
  @scala.inline
  def apply(scope: Scope): Variable = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Variable]
  }
}

