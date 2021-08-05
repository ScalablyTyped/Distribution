package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sl {
  
  @JSGlobal("KSR.sl")
  @js.native
  val ^ : js.Any = js.native
  
  inline def sendReply(code: Double, reason: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("send_reply")(code.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def slForwardReply(code: String, reason: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sl_forward_reply")(code.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def slReplyError(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sl_reply_error")().asInstanceOf[Double]
  
  inline def slSendReply(code: Double, reason: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sl_send_reply")(code.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[Double]
}
