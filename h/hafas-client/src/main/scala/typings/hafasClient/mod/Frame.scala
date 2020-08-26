package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  var destination: Stop | Location = js.native
  var origin: Stop | Location = js.native
  var t: js.UndefOr[Double] = js.native
}

object Frame {
  @scala.inline
  def apply(destination: Stop | Location, origin: Stop | Location): Frame = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
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
    def setDestination(value: Stop | Location): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: Stop | Location): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setT(value: Double): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteT: Self = this.set("t", js.undefined)
  }
  
}

