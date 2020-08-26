package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdCompanionsParam extends js.Object {
  var companions: js.Array[_] = js.native
  var tag: String = js.native
}

object AdCompanionsParam {
  @scala.inline
  def apply(companions: js.Array[_], tag: String): AdCompanionsParam = {
    val __obj = js.Dynamic.literal(companions = companions.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdCompanionsParam]
  }
  @scala.inline
  implicit class AdCompanionsParamOps[Self <: AdCompanionsParam] (val x: Self) extends AnyVal {
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
    def setCompanionsVarargs(value: js.Any*): Self = this.set("companions", js.Array(value :_*))
    @scala.inline
    def setCompanions(value: js.Array[_]): Self = this.set("companions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
  
}

