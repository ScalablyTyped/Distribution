package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  def rtpproxy_answer(flags: java.lang.String): scala.Double
  def rtpproxy_answer0(): scala.Double
  def rtpproxy_answer_ip(flags: java.lang.String, mip: java.lang.String): scala.Double
  def rtpproxy_destroy(flags: java.lang.String): scala.Double
  def rtpproxy_destroy0(): scala.Double
  def rtpproxy_manage(flags: java.lang.String): scala.Double
  def rtpproxy_manage0(): scala.Double
  def rtpproxy_manage_ip(flags: java.lang.String, mip: java.lang.String): scala.Double
  def rtpproxy_offer(flags: java.lang.String): scala.Double
  def rtpproxy_offer0(): scala.Double
  def rtpproxy_offer_ip(flags: java.lang.String, mip: java.lang.String): scala.Double
  def rtpproxy_stop_stream2uac(): scala.Double
  def rtpproxy_stop_stream2uas(): scala.Double
  def rtpproxy_stream2uac(pname: java.lang.String, count: scala.Double): scala.Double
  def rtpproxy_stream2uas(pname: java.lang.String, count: scala.Double): scala.Double
  def set_rtpproxy_set(rset: scala.Double): scala.Double
  def start_recording(): scala.Double
}

object Anon_Count {
  @scala.inline
  def apply(
    rtpproxy_answer: java.lang.String => scala.Double,
    rtpproxy_answer0: () => scala.Double,
    rtpproxy_answer_ip: (java.lang.String, java.lang.String) => scala.Double,
    rtpproxy_destroy: java.lang.String => scala.Double,
    rtpproxy_destroy0: () => scala.Double,
    rtpproxy_manage: java.lang.String => scala.Double,
    rtpproxy_manage0: () => scala.Double,
    rtpproxy_manage_ip: (java.lang.String, java.lang.String) => scala.Double,
    rtpproxy_offer: java.lang.String => scala.Double,
    rtpproxy_offer0: () => scala.Double,
    rtpproxy_offer_ip: (java.lang.String, java.lang.String) => scala.Double,
    rtpproxy_stop_stream2uac: () => scala.Double,
    rtpproxy_stop_stream2uas: () => scala.Double,
    rtpproxy_stream2uac: (java.lang.String, scala.Double) => scala.Double,
    rtpproxy_stream2uas: (java.lang.String, scala.Double) => scala.Double,
    set_rtpproxy_set: scala.Double => scala.Double,
    start_recording: () => scala.Double
  ): Anon_Count = {
    val __obj = js.Dynamic.literal(rtpproxy_answer = js.Any.fromFunction1(rtpproxy_answer), rtpproxy_answer0 = js.Any.fromFunction0(rtpproxy_answer0), rtpproxy_answer_ip = js.Any.fromFunction2(rtpproxy_answer_ip), rtpproxy_destroy = js.Any.fromFunction1(rtpproxy_destroy), rtpproxy_destroy0 = js.Any.fromFunction0(rtpproxy_destroy0), rtpproxy_manage = js.Any.fromFunction1(rtpproxy_manage), rtpproxy_manage0 = js.Any.fromFunction0(rtpproxy_manage0), rtpproxy_manage_ip = js.Any.fromFunction2(rtpproxy_manage_ip), rtpproxy_offer = js.Any.fromFunction1(rtpproxy_offer), rtpproxy_offer0 = js.Any.fromFunction0(rtpproxy_offer0), rtpproxy_offer_ip = js.Any.fromFunction2(rtpproxy_offer_ip), rtpproxy_stop_stream2uac = js.Any.fromFunction0(rtpproxy_stop_stream2uac), rtpproxy_stop_stream2uas = js.Any.fromFunction0(rtpproxy_stop_stream2uas), rtpproxy_stream2uac = js.Any.fromFunction2(rtpproxy_stream2uac), rtpproxy_stream2uas = js.Any.fromFunction2(rtpproxy_stream2uas), set_rtpproxy_set = js.Any.fromFunction1(set_rtpproxy_set), start_recording = js.Any.fromFunction0(start_recording))
  
    __obj.asInstanceOf[Anon_Count]
  }
}

