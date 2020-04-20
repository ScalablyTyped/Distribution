package typings.i18nJs

import typings.i18nJs.mod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScope extends js.Object {
  var scope: Scope
}

object AnonScope {
  @scala.inline
  def apply(scope: Scope): AnonScope = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScope]
  }
}

