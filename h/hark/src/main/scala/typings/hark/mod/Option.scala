package typings.hark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
  var history: js.UndefOr[Double] = js.native
  var interval: js.UndefOr[Double] = js.native
  var play: js.UndefOr[Boolean] = js.native
  var smoothing: js.UndefOr[Double] = js.native
  var threshold: js.UndefOr[Double] = js.native
}

object Option {
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
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
    def setHistory(value: Double): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setPlay(value: Boolean): Self = this.set("play", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    @scala.inline
    def setSmoothing(value: Double): Self = this.set("smoothing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothing: Self = this.set("smoothing", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

