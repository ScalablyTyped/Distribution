package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofrtpproxy extends js.Object {
  
  def rtpproxy_answer(flags: String): Double = js.native
  
  def rtpproxy_answer0(): Double = js.native
  
  def rtpproxy_answer_ip(flags: String, mip: String): Double = js.native
  
  def rtpproxy_destroy(flags: String): Double = js.native
  
  def rtpproxy_destroy0(): Double = js.native
  
  def rtpproxy_manage(flags: String): Double = js.native
  
  def rtpproxy_manage0(): Double = js.native
  
  def rtpproxy_manage_ip(flags: String, mip: String): Double = js.native
  
  def rtpproxy_offer(flags: String): Double = js.native
  
  def rtpproxy_offer0(): Double = js.native
  
  def rtpproxy_offer_ip(flags: String, mip: String): Double = js.native
  
  def rtpproxy_stop_stream2uac(): Double = js.native
  
  def rtpproxy_stop_stream2uas(): Double = js.native
  
  def rtpproxy_stream2uac(pname: String, count: Double): Double = js.native
  
  def rtpproxy_stream2uas(pname: String, count: Double): Double = js.native
  
  def set_rtpproxy_set(rset: Double): Double = js.native
  
  def start_recording(): Double = js.native
}
object Typeofrtpproxy {
  
  @scala.inline
  def apply(
    rtpproxy_answer: String => Double,
    rtpproxy_answer0: () => Double,
    rtpproxy_answer_ip: (String, String) => Double,
    rtpproxy_destroy: String => Double,
    rtpproxy_destroy0: () => Double,
    rtpproxy_manage: String => Double,
    rtpproxy_manage0: () => Double,
    rtpproxy_manage_ip: (String, String) => Double,
    rtpproxy_offer: String => Double,
    rtpproxy_offer0: () => Double,
    rtpproxy_offer_ip: (String, String) => Double,
    rtpproxy_stop_stream2uac: () => Double,
    rtpproxy_stop_stream2uas: () => Double,
    rtpproxy_stream2uac: (String, Double) => Double,
    rtpproxy_stream2uas: (String, Double) => Double,
    set_rtpproxy_set: Double => Double,
    start_recording: () => Double
  ): Typeofrtpproxy = {
    val __obj = js.Dynamic.literal(rtpproxy_answer = js.Any.fromFunction1(rtpproxy_answer), rtpproxy_answer0 = js.Any.fromFunction0(rtpproxy_answer0), rtpproxy_answer_ip = js.Any.fromFunction2(rtpproxy_answer_ip), rtpproxy_destroy = js.Any.fromFunction1(rtpproxy_destroy), rtpproxy_destroy0 = js.Any.fromFunction0(rtpproxy_destroy0), rtpproxy_manage = js.Any.fromFunction1(rtpproxy_manage), rtpproxy_manage0 = js.Any.fromFunction0(rtpproxy_manage0), rtpproxy_manage_ip = js.Any.fromFunction2(rtpproxy_manage_ip), rtpproxy_offer = js.Any.fromFunction1(rtpproxy_offer), rtpproxy_offer0 = js.Any.fromFunction0(rtpproxy_offer0), rtpproxy_offer_ip = js.Any.fromFunction2(rtpproxy_offer_ip), rtpproxy_stop_stream2uac = js.Any.fromFunction0(rtpproxy_stop_stream2uac), rtpproxy_stop_stream2uas = js.Any.fromFunction0(rtpproxy_stop_stream2uas), rtpproxy_stream2uac = js.Any.fromFunction2(rtpproxy_stream2uac), rtpproxy_stream2uas = js.Any.fromFunction2(rtpproxy_stream2uas), set_rtpproxy_set = js.Any.fromFunction1(set_rtpproxy_set), start_recording = js.Any.fromFunction0(start_recording))
    __obj.asInstanceOf[Typeofrtpproxy]
  }
  
  @scala.inline
  implicit class TypeofrtpproxyOps[Self <: Typeofrtpproxy] (val x: Self) extends AnyVal {
    
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
    def setRtpproxy_answer(value: String => Double): Self = this.set("rtpproxy_answer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRtpproxy_answer0(value: () => Double): Self = this.set("rtpproxy_answer0", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRtpproxy_answer_ip(value: (String, String) => Double): Self = this.set("rtpproxy_answer_ip", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRtpproxy_destroy(value: String => Double): Self = this.set("rtpproxy_destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRtpproxy_destroy0(value: () => Double): Self = this.set("rtpproxy_destroy0", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRtpproxy_manage(value: String => Double): Self = this.set("rtpproxy_manage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRtpproxy_manage0(value: () => Double): Self = this.set("rtpproxy_manage0", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRtpproxy_manage_ip(value: (String, String) => Double): Self = this.set("rtpproxy_manage_ip", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRtpproxy_offer(value: String => Double): Self = this.set("rtpproxy_offer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRtpproxy_offer0(value: () => Double): Self = this.set("rtpproxy_offer0", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRtpproxy_offer_ip(value: (String, String) => Double): Self = this.set("rtpproxy_offer_ip", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRtpproxy_stop_stream2uac(value: () => Double): Self = this.set("rtpproxy_stop_stream2uac", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRtpproxy_stop_stream2uas(value: () => Double): Self = this.set("rtpproxy_stop_stream2uas", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRtpproxy_stream2uac(value: (String, Double) => Double): Self = this.set("rtpproxy_stream2uac", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRtpproxy_stream2uas(value: (String, Double) => Double): Self = this.set("rtpproxy_stream2uas", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet_rtpproxy_set(value: Double => Double): Self = this.set("set_rtpproxy_set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart_recording(value: () => Double): Self = this.set("start_recording", js.Any.fromFunction0(value))
  }
}
