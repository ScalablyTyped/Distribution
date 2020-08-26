package typings.mailgunJs.mod.validation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseResponse extends js.Object {
  var parsed: js.Array[String] = js.native
  var unparseable: js.Array[String] = js.native
}

object ParseResponse {
  @scala.inline
  def apply(parsed: js.Array[String], unparseable: js.Array[String]): ParseResponse = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], unparseable = unparseable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResponse]
  }
  @scala.inline
  implicit class ParseResponseOps[Self <: ParseResponse] (val x: Self) extends AnyVal {
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
    def setParsedVarargs(value: String*): Self = this.set("parsed", js.Array(value :_*))
    @scala.inline
    def setParsed(value: js.Array[String]): Self = this.set("parsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnparseableVarargs(value: String*): Self = this.set("unparseable", js.Array(value :_*))
    @scala.inline
    def setUnparseable(value: js.Array[String]): Self = this.set("unparseable", value.asInstanceOf[js.Any])
  }
  
}

