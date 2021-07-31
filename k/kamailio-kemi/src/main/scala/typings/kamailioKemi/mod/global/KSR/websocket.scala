package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object websocket {
  
  @JSGlobal("KSR.websocket")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def close(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Double]
  
  @scala.inline
  def closeConid(status: Double, reason: String, con: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("close_conid")(status.asInstanceOf[js.Any], reason.asInstanceOf[js.Any], con.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def closeReason(status: Double, reason: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("close_reason")(status.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def handleHandshake(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("handle_handshake")().asInstanceOf[Double]
}
