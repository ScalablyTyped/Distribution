package typings.hapiAddress.mod.uri

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends js.Object {
  /**
    * The raw regular expression string.
    */
  var raw: String = js.native
  /**
    * The regular expression.
    */
  var regex: RegExp = js.native
}

object Expression {
  @scala.inline
  def apply(raw: String, regex: RegExp): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  implicit class ExpressionOps[Self <: Expression] (val x: Self) extends AnyVal {
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
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
  }
  
}

