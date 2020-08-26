package typings.linkifyIt.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullRule extends js.Object {
  var normalize: js.UndefOr[js.Function1[/* match */ Match, Unit]] = js.native
  var validate: String | RegExp | Validate = js.native
}

object FullRule {
  @scala.inline
  def apply(validate: String | RegExp | Validate): FullRule = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullRule]
  }
  @scala.inline
  implicit class FullRuleOps[Self <: FullRule] (val x: Self) extends AnyVal {
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
    def setValidateFunction3(value: (/* text */ String, /* pos */ Double, /* self */ LinkifyIt) => Double | Boolean): Self = this.set("validate", js.Any.fromFunction3(value))
    @scala.inline
    def setValidate(value: String | RegExp | Validate): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalize(value: /* match */ Match => Unit): Self = this.set("normalize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
  }
  
}

