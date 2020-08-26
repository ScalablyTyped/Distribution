package typings.jqueryAjaxfile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingRewriteValidators extends js.Object {
  var bindingRewriteValidators: js.Any = js.native
  def parseObjectLiteral(objectLiteralString: String): js.Array[_] = js.native
}

object BindingRewriteValidators {
  @scala.inline
  def apply(bindingRewriteValidators: js.Any, parseObjectLiteral: String => js.Array[_]): BindingRewriteValidators = {
    val __obj = js.Dynamic.literal(bindingRewriteValidators = bindingRewriteValidators.asInstanceOf[js.Any], parseObjectLiteral = js.Any.fromFunction1(parseObjectLiteral))
    __obj.asInstanceOf[BindingRewriteValidators]
  }
  @scala.inline
  implicit class BindingRewriteValidatorsOps[Self <: BindingRewriteValidators] (val x: Self) extends AnyVal {
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
    def setBindingRewriteValidators(value: js.Any): Self = this.set("bindingRewriteValidators", value.asInstanceOf[js.Any])
    @scala.inline
    def setParseObjectLiteral(value: String => js.Array[_]): Self = this.set("parseObjectLiteral", js.Any.fromFunction1(value))
  }
  
}

