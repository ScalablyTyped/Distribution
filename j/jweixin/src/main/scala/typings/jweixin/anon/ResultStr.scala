package typings.jweixin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultStr extends js.Object {
  var resultStr: String = js.native
}

object ResultStr {
  @scala.inline
  def apply(resultStr: String): ResultStr = {
    val __obj = js.Dynamic.literal(resultStr = resultStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultStr]
  }
  @scala.inline
  implicit class ResultStrOps[Self <: ResultStr] (val x: Self) extends AnyVal {
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
    def setResultStr(value: String): Self = this.set("resultStr", value.asInstanceOf[js.Any])
  }
  
}

