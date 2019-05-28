package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsiptrace extends js.Object {
  def hlog(message: java.lang.String): scala.Double
  def hlog_cid(correlationid: java.lang.String, message: java.lang.String): scala.Double
  def sip_trace(): scala.Double
  def sip_trace_dst(duri: java.lang.String): scala.Double
  def sip_trace_dst_cid(duri: java.lang.String, cid: java.lang.String): scala.Double
}

object Typeofsiptrace {
  @scala.inline
  def apply(
    hlog: java.lang.String => scala.Double,
    hlog_cid: (java.lang.String, java.lang.String) => scala.Double,
    sip_trace: () => scala.Double,
    sip_trace_dst: java.lang.String => scala.Double,
    sip_trace_dst_cid: (java.lang.String, java.lang.String) => scala.Double
  ): Typeofsiptrace = {
    val __obj = js.Dynamic.literal(hlog = js.Any.fromFunction1(hlog), hlog_cid = js.Any.fromFunction2(hlog_cid), sip_trace = js.Any.fromFunction0(sip_trace), sip_trace_dst = js.Any.fromFunction1(sip_trace_dst), sip_trace_dst_cid = js.Any.fromFunction2(sip_trace_dst_cid))
  
    __obj.asInstanceOf[Typeofsiptrace]
  }
}

