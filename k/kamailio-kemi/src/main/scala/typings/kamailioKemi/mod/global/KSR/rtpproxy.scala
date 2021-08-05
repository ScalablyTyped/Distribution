package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rtpproxy {
  
  @JSGlobal("KSR.rtpproxy")
  @js.native
  val ^ : js.Any = js.native
  
  inline def rtpproxyAnswer(flags: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpproxy_answer")(flags.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rtpproxyAnswer0(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpproxy_answer0")().asInstanceOf[Double]
  
  inline def rtpproxyAnswerIp(flags: String, mip: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rtpproxy_answer_ip")(flags.asInstanceOf[js.Any], mip.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rtpproxyDestroy(flags: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpproxy_destroy")(flags.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rtpproxyDestroy0(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpproxy_destroy0")().asInstanceOf[Double]
  
  inline def rtpproxyManage(flags: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpproxy_manage")(flags.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rtpproxyManage0(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpproxy_manage0")().asInstanceOf[Double]
  
  inline def rtpproxyManageIp(flags: String, mip: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rtpproxy_manage_ip")(flags.asInstanceOf[js.Any], mip.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rtpproxyOffer(flags: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpproxy_offer")(flags.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rtpproxyOffer0(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpproxy_offer0")().asInstanceOf[Double]
  
  inline def rtpproxyOfferIp(flags: String, mip: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rtpproxy_offer_ip")(flags.asInstanceOf[js.Any], mip.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rtpproxyStopStream2uac(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpproxy_stop_stream2uac")().asInstanceOf[Double]
  
  inline def rtpproxyStopStream2uas(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpproxy_stop_stream2uas")().asInstanceOf[Double]
  
  inline def rtpproxyStream2uac(pname: String, count: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rtpproxy_stream2uac")(pname.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rtpproxyStream2uas(pname: String, count: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rtpproxy_stream2uas")(pname.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setRtpproxySet(rset: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("set_rtpproxy_set")(rset.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def startRecording(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("start_recording")().asInstanceOf[Double]
}
