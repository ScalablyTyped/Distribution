package typings.ldclientJsCommon.anon

import typings.ldclientJsCommon.mod.LDFlagValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Current extends js.Object {
  var current: LDFlagValue = js.native
  var previous: LDFlagValue = js.native
}

object Current {
  @scala.inline
  def apply(current: LDFlagValue, previous: LDFlagValue): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  @scala.inline
  implicit class CurrentOps[Self <: Current] (val x: Self) extends AnyVal {
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
    def setCurrent(value: LDFlagValue): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevious(value: LDFlagValue): Self = this.set("previous", value.asInstanceOf[js.Any])
  }
  
}

