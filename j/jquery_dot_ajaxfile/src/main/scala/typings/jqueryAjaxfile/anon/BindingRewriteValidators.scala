package typings.jqueryAjaxfile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingRewriteValidators extends js.Object {
  var bindingRewriteValidators: js.Any
  def parseObjectLiteral(objectLiteralString: String): js.Array[_]
}

object BindingRewriteValidators {
  @scala.inline
  def apply(bindingRewriteValidators: js.Any, parseObjectLiteral: String => js.Array[_]): BindingRewriteValidators = {
    val __obj = js.Dynamic.literal(bindingRewriteValidators = bindingRewriteValidators.asInstanceOf[js.Any], parseObjectLiteral = js.Any.fromFunction1(parseObjectLiteral))
    __obj.asInstanceOf[BindingRewriteValidators]
  }
}

