package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siptrace {
  
  @JSGlobal("KSR.siptrace.hlog")
  @js.native
  def hlog(message: String): Double = js.native
  
  @JSGlobal("KSR.siptrace.hlog_cid")
  @js.native
  def hlogCid(correlationid: String, message: String): Double = js.native
  
  @JSGlobal("KSR.siptrace.sip_trace")
  @js.native
  def sipTrace(): Double = js.native
  
  @JSGlobal("KSR.siptrace.sip_trace_dst")
  @js.native
  def sipTraceDst(duri: String): Double = js.native
  
  @JSGlobal("KSR.siptrace.sip_trace_dst_cid")
  @js.native
  def sipTraceDstCid(duri: String, cid: String): Double = js.native
}
