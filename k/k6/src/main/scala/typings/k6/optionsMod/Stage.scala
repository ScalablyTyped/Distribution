package typings.k6.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stage extends js.Object {
  /** Stage duration. */
  var duration: String = js.native
  /** Target number of VUs. */
  var target: Double = js.native
}

object Stage {
  @scala.inline
  def apply(duration: String, target: Double): Stage = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stage]
  }
  @scala.inline
  implicit class StageOps[Self <: Stage] (val x: Self) extends AnyVal {
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Double): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

