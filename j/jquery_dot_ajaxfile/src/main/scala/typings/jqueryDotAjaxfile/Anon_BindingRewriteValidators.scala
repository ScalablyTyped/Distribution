package typings.jqueryDotAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BindingRewriteValidators extends js.Object {
  var bindingRewriteValidators: js.Any
  def parseObjectLiteral(objectLiteralString: String): js.Array[_]
}

object Anon_BindingRewriteValidators {
  @scala.inline
  def apply(bindingRewriteValidators: js.Any, parseObjectLiteral: String => js.Array[_]): Anon_BindingRewriteValidators = {
    val __obj = js.Dynamic.literal(bindingRewriteValidators = bindingRewriteValidators.asInstanceOf[js.Any], parseObjectLiteral = js.Any.fromFunction1(parseObjectLiteral))
  
    __obj.asInstanceOf[Anon_BindingRewriteValidators]
  }
}

