package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsiptrace extends js.Object {
  def hlog(message: String): Double
  def hlog_cid(correlationid: String, message: String): Double
  def sip_trace(): Double
  def sip_trace_dst(duri: String): Double
  def sip_trace_dst_cid(duri: String, cid: String): Double
}

object Typeofsiptrace {
  @scala.inline
  def apply(
    hlog: String => Double,
    hlog_cid: (String, String) => Double,
    sip_trace: () => Double,
    sip_trace_dst: String => Double,
    sip_trace_dst_cid: (String, String) => Double
  ): Typeofsiptrace = {
    val __obj = js.Dynamic.literal(hlog = js.Any.fromFunction1(hlog), hlog_cid = js.Any.fromFunction2(hlog_cid), sip_trace = js.Any.fromFunction0(sip_trace), sip_trace_dst = js.Any.fromFunction1(sip_trace_dst), sip_trace_dst_cid = js.Any.fromFunction2(sip_trace_dst_cid))
    __obj.asInstanceOf[Typeofsiptrace]
  }
}

