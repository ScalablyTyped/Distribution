package typings.hammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecognizerOptions extends js.Object {
  var direction: js.UndefOr[Double] = js.native
  var enable: js.UndefOr[
    Boolean | (js.Function2[/* recognizer */ Recognizer, /* inputData */ HammerInput, Boolean])
  ] = js.native
  var event: js.UndefOr[String] = js.native
  var interval: js.UndefOr[Double] = js.native
  var pointers: js.UndefOr[Double] = js.native
  var posThreshold: js.UndefOr[Double] = js.native
  var taps: js.UndefOr[Double] = js.native
  var threshold: js.UndefOr[Double] = js.native
  var time: js.UndefOr[Double] = js.native
  var velocity: js.UndefOr[Double] = js.native
}

object RecognizerOptions {
  @scala.inline
  def apply(): RecognizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecognizerOptions]
  }
  @scala.inline
  implicit class RecognizerOptionsOps[Self <: RecognizerOptions] (val x: Self) extends AnyVal {
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
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setEnableFunction2(value: (/* recognizer */ Recognizer, /* inputData */ HammerInput) => Boolean): Self = this.set("enable", js.Any.fromFunction2(value))
    @scala.inline
    def setEnable(value: Boolean | (js.Function2[/* recognizer */ Recognizer, /* inputData */ HammerInput, Boolean])): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setPointers(value: Double): Self = this.set("pointers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointers: Self = this.set("pointers", js.undefined)
    @scala.inline
    def setPosThreshold(value: Double): Self = this.set("posThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosThreshold: Self = this.set("posThreshold", js.undefined)
    @scala.inline
    def setTaps(value: Double): Self = this.set("taps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaps: Self = this.set("taps", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
  }
  
}

