package typings.materialCheckbox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ANIMENDLATCHMS extends js.Object {
  var ANIM_END_LATCH_MS: Double = js.native
}

object ANIMENDLATCHMS {
  @scala.inline
  def apply(ANIM_END_LATCH_MS: Double): ANIMENDLATCHMS = {
    val __obj = js.Dynamic.literal(ANIM_END_LATCH_MS = ANIM_END_LATCH_MS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ANIMENDLATCHMS]
  }
  @scala.inline
  implicit class ANIMENDLATCHMSOps[Self <: ANIMENDLATCHMS] (val x: Self) extends AnyVal {
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
    def setANIM_END_LATCH_MS(value: Double): Self = this.set("ANIM_END_LATCH_MS", value.asInstanceOf[js.Any])
  }
  
}

