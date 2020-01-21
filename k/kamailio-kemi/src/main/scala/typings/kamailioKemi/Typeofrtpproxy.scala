package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrtpproxy extends js.Object {
  def rtpproxy_answer(flags: String): Double
  def rtpproxy_answer0(): Double
  def rtpproxy_answer_ip(flags: String, mip: String): Double
  def rtpproxy_destroy(flags: String): Double
  def rtpproxy_destroy0(): Double
  def rtpproxy_manage(flags: String): Double
  def rtpproxy_manage0(): Double
  def rtpproxy_manage_ip(flags: String, mip: String): Double
  def rtpproxy_offer(flags: String): Double
  def rtpproxy_offer0(): Double
  def rtpproxy_offer_ip(flags: String, mip: String): Double
  def rtpproxy_stop_stream2uac(): Double
  def rtpproxy_stop_stream2uas(): Double
  def rtpproxy_stream2uac(pname: String, count: Double): Double
  def rtpproxy_stream2uas(pname: String, count: Double): Double
  def set_rtpproxy_set(rset: Double): Double
  def start_recording(): Double
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
}

