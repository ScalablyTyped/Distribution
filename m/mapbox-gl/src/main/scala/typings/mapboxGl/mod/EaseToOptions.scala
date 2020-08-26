package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EaseToOptions
  extends AnimationOptions
     with CameraOptions {
  var delayEndEvents: js.UndefOr[Double] = js.native
}

object EaseToOptions {
  @scala.inline
  def apply(): EaseToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EaseToOptions]
  }
  @scala.inline
  implicit class EaseToOptionsOps[Self <: EaseToOptions] (val x: Self) extends AnyVal {
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
    def setDelayEndEvents(value: Double): Self = this.set("delayEndEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayEndEvents: Self = this.set("delayEndEvents", js.undefined)
  }
  
}

