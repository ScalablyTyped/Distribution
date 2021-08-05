package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rtpengine {
  
  @JSGlobal("KSR.rtpengine")
  @js.native
  val ^ : js.Any = js.native
  
  inline def rtpengineAnswer(flags: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpengine_answer")(flags.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rtpengineAnswer0(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpengine_answer0")().asInstanceOf[Double]
  
  inline def rtpengineDelete(flags: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpengine_delete")(flags.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rtpengineDelete0(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpengine_delete0")().asInstanceOf[Double]
  
  inline def rtpengineManage(flags: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpengine_manage")(flags.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rtpengineManage0(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpengine_manage0")().asInstanceOf[Double]
  
  inline def rtpengineOffer(flags: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpengine_offer")(flags.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rtpengineOffer0(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rtpengine_offer0")().asInstanceOf[Double]
  
  inline def setRtpengineSet(r1: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("set_rtpengine_set")(r1.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  // This function is the sibling function to set_rtpengine_set().
  // The original module function is declared as set_rtpengine_set(setid[, setid2]).
  // In KEMI set_rtpengine_set() takes only the first parameter and set_rtpengine_set2() allows for the second optional parameter to be passed.
  // Please review the documentation for set_rtpengine_set() for more information.
  inline def setRtpengineSet2(r1: Double, r2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("set_rtpengine_set2")(r1.asInstanceOf[js.Any], r2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def startRecording(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("start_recording")().asInstanceOf[Double]
  
  inline def stopRecording(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stop_recording")().asInstanceOf[Double]
}
