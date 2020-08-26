package typings.hapiAuthJwt2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraInfo extends js.Object {
  var extraInfo: js.UndefOr[typings.hapiAuthJwt2.mod.ExtraInfo] = js.native
  var key: String | js.Array[String] = js.native
}

object ExtraInfo {
  @scala.inline
  def apply(key: String | js.Array[String]): ExtraInfo = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraInfo]
  }
  @scala.inline
  implicit class ExtraInfoOps[Self <: ExtraInfo] (val x: Self) extends AnyVal {
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
    def setKeyVarargs(value: String*): Self = this.set("key", js.Array(value :_*))
    @scala.inline
    def setKey(value: String | js.Array[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraInfo(value: typings.hapiAuthJwt2.mod.ExtraInfo): Self = this.set("extraInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraInfo: Self = this.set("extraInfo", js.undefined)
  }
  
}

