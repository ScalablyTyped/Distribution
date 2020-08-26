package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait subtitleFragProcessedData extends js.Object {
  var frag: Fragment = js.native
  var success: Boolean = js.native
}

object subtitleFragProcessedData {
  @scala.inline
  def apply(frag: Fragment, success: Boolean): subtitleFragProcessedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[subtitleFragProcessedData]
  }
  @scala.inline
  implicit class subtitleFragProcessedDataOps[Self <: subtitleFragProcessedData] (val x: Self) extends AnyVal {
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
    def setFrag(value: Fragment): Self = this.set("frag", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

