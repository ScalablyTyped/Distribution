package typings.jose.mod.JWT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecodeOptions[komplet] extends js.Object {
  var complete: js.UndefOr[komplet] = js.native
}

object DecodeOptions {
  @scala.inline
  def apply[komplet](): DecodeOptions[komplet] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecodeOptions[komplet]]
  }
  @scala.inline
  implicit class DecodeOptionsOps[Self <: DecodeOptions[_], komplet] (val x: Self with DecodeOptions[komplet]) extends AnyVal {
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
    def setComplete(value: komplet): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
  }
  
}

