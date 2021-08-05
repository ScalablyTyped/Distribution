package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siptrace {
  
  @JSGlobal("KSR.siptrace")
  @js.native
  val ^ : js.Any = js.native
  
  inline def hlog(message: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hlog")(message.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hlogCid(correlationid: String, message: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hlog_cid")(correlationid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sipTrace(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sip_trace")().asInstanceOf[Double]
  
  inline def sipTraceDst(duri: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sip_trace_dst")(duri.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sipTraceDstCid(duri: String, cid: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sip_trace_dst_cid")(duri.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Double]
}
