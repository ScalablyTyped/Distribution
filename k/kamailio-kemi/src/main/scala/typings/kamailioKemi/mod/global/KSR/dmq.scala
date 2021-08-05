package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dmq {
  
  @JSGlobal("KSR.dmq")
  @js.native
  val ^ : js.Any = js.native
  
  inline def bcastMessage(peer_str: String, body_str: String, ct_str: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bcast_message")(peer_str.asInstanceOf[js.Any], body_str.asInstanceOf[js.Any], ct_str.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def handleMessage(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("handle_message")().asInstanceOf[Double]
  
  inline def handleMessageRc(returnval: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("handle_message_rc")(returnval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isFromNode(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_from_node")().asInstanceOf[Double]
  
  inline def sendMessage(peer_str: String, to_str: String, body_str: String, ct_str: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("send_message")(peer_str.asInstanceOf[js.Any], to_str.asInstanceOf[js.Any], body_str.asInstanceOf[js.Any], ct_str.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def tReplicate(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_replicate")().asInstanceOf[Double]
  
  inline def tReplicateMode(mode: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("t_replicate_mode")(mode.asInstanceOf[js.Any]).asInstanceOf[Double]
}
