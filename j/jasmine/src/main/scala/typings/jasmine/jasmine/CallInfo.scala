package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallInfo extends js.Object {
  /** All arguments passed to the call */
  var args: js.Array[_] = js.native
  /** The context (the this) for the call */
  var `object`: js.Any = js.native
  /** The return value of the call */
  var returnValue: js.Any = js.native
}

object CallInfo {
  @scala.inline
  def apply(args: js.Array[_], `object`: js.Any, returnValue: js.Any): CallInfo = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallInfo]
  }
  @scala.inline
  implicit class CallInfoOps[Self <: CallInfo] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: js.Any): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: js.Any): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

