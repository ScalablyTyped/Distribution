package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBindingRewriteValidators extends js.Object {
  var bindingRewriteValidators: js.Any
  def parseObjectLiteral(objectLiteralString: String): js.Array[_]
}

object AnonBindingRewriteValidators {
  @scala.inline
  def apply(bindingRewriteValidators: js.Any, parseObjectLiteral: String => js.Array[_]): AnonBindingRewriteValidators = {
    val __obj = js.Dynamic.literal(bindingRewriteValidators = bindingRewriteValidators.asInstanceOf[js.Any], parseObjectLiteral = js.Any.fromFunction1(parseObjectLiteral))
    __obj.asInstanceOf[AnonBindingRewriteValidators]
  }
}

