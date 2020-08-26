package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofrtpengine extends js.Object {
  def rtpengine_answer(flags: String): Double = js.native
  def rtpengine_answer0(): Double = js.native
  def rtpengine_delete(flags: String): Double = js.native
  def rtpengine_delete0(): Double = js.native
  def rtpengine_manage(flags: String): Double = js.native
  def rtpengine_manage0(): Double = js.native
  def rtpengine_offer(flags: String): Double = js.native
  def rtpengine_offer0(): Double = js.native
  def set_rtpengine_set(r1: Double): Double = js.native
  // This function is the sibling function to set_rtpengine_set().
  // The original module function is declared as set_rtpengine_set(setid[, setid2]).
  // In KEMI set_rtpengine_set() takes only the first parameter and set_rtpengine_set2() allows for the second optional parameter to be passed.
  // Please review the documentation for set_rtpengine_set() for more information.
  def set_rtpengine_set2(r1: Double, r2: Double): Double = js.native
  def start_recording(): Double = js.native
  def stop_recording(): Double = js.native
}

object Typeofrtpengine {
  @scala.inline
  def apply(
    rtpengine_answer: String => Double,
    rtpengine_answer0: () => Double,
    rtpengine_delete: String => Double,
    rtpengine_delete0: () => Double,
    rtpengine_manage: String => Double,
    rtpengine_manage0: () => Double,
    rtpengine_offer: String => Double,
    rtpengine_offer0: () => Double,
    set_rtpengine_set: Double => Double,
    set_rtpengine_set2: (Double, Double) => Double,
    start_recording: () => Double,
    stop_recording: () => Double
  ): Typeofrtpengine = {
    val __obj = js.Dynamic.literal(rtpengine_answer = js.Any.fromFunction1(rtpengine_answer), rtpengine_answer0 = js.Any.fromFunction0(rtpengine_answer0), rtpengine_delete = js.Any.fromFunction1(rtpengine_delete), rtpengine_delete0 = js.Any.fromFunction0(rtpengine_delete0), rtpengine_manage = js.Any.fromFunction1(rtpengine_manage), rtpengine_manage0 = js.Any.fromFunction0(rtpengine_manage0), rtpengine_offer = js.Any.fromFunction1(rtpengine_offer), rtpengine_offer0 = js.Any.fromFunction0(rtpengine_offer0), set_rtpengine_set = js.Any.fromFunction1(set_rtpengine_set), set_rtpengine_set2 = js.Any.fromFunction2(set_rtpengine_set2), start_recording = js.Any.fromFunction0(start_recording), stop_recording = js.Any.fromFunction0(stop_recording))
    __obj.asInstanceOf[Typeofrtpengine]
  }
  @scala.inline
  implicit class TypeofrtpengineOps[Self <: Typeofrtpengine] (val x: Self) extends AnyVal {
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
    def setRtpengine_answer(value: String => Double): Self = this.set("rtpengine_answer", js.Any.fromFunction1(value))
    @scala.inline
    def setRtpengine_answer0(value: () => Double): Self = this.set("rtpengine_answer0", js.Any.fromFunction0(value))
    @scala.inline
    def setRtpengine_delete(value: String => Double): Self = this.set("rtpengine_delete", js.Any.fromFunction1(value))
    @scala.inline
    def setRtpengine_delete0(value: () => Double): Self = this.set("rtpengine_delete0", js.Any.fromFunction0(value))
    @scala.inline
    def setRtpengine_manage(value: String => Double): Self = this.set("rtpengine_manage", js.Any.fromFunction1(value))
    @scala.inline
    def setRtpengine_manage0(value: () => Double): Self = this.set("rtpengine_manage0", js.Any.fromFunction0(value))
    @scala.inline
    def setRtpengine_offer(value: String => Double): Self = this.set("rtpengine_offer", js.Any.fromFunction1(value))
    @scala.inline
    def setRtpengine_offer0(value: () => Double): Self = this.set("rtpengine_offer0", js.Any.fromFunction0(value))
    @scala.inline
    def setSet_rtpengine_set(value: Double => Double): Self = this.set("set_rtpengine_set", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_rtpengine_set2(value: (Double, Double) => Double): Self = this.set("set_rtpengine_set2", js.Any.fromFunction2(value))
    @scala.inline
    def setStart_recording(value: () => Double): Self = this.set("start_recording", js.Any.fromFunction0(value))
    @scala.inline
    def setStop_recording(value: () => Double): Self = this.set("stop_recording", js.Any.fromFunction0(value))
  }
  
}

