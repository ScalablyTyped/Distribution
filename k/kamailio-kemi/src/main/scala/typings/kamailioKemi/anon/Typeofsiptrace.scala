package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsiptrace extends js.Object {
  
  def hlog(message: String): Double = js.native
  
  def hlog_cid(correlationid: String, message: String): Double = js.native
  
  def sip_trace(): Double = js.native
  
  def sip_trace_dst(duri: String): Double = js.native
  
  def sip_trace_dst_cid(duri: String, cid: String): Double = js.native
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
  
  @scala.inline
  implicit class TypeofsiptraceOps[Self <: Typeofsiptrace] (val x: Self) extends AnyVal {
    
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
    def setHlog(value: String => Double): Self = this.set("hlog", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHlog_cid(value: (String, String) => Double): Self = this.set("hlog_cid", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSip_trace(value: () => Double): Self = this.set("sip_trace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSip_trace_dst(value: String => Double): Self = this.set("sip_trace_dst", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSip_trace_dst_cid(value: (String, String) => Double): Self = this.set("sip_trace_dst_cid", js.Any.fromFunction2(value))
  }
}
