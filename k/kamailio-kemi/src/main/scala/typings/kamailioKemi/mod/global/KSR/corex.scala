package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corex {
  
  @JSGlobal("KSR.corex")
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendBranch(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("append_branch")().asInstanceOf[Double]
  
  inline def appendBranchUri(uri: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("append_branch_uri")(uri.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def appendBranchUriQ(uri: String, q: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("append_branch_uri_q")(uri.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hasRuriUser(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("has_ruri_user")().asInstanceOf[Double]
  
  inline def hasUserAgent(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("has_user_agent")().asInstanceOf[Double]
  
  inline def isxflagset(fval: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("isxflagset")(fval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def resetxflag(fval: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("resetxflag")(fval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sendData(uri: String, data: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("send_data")(uri.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sendx(uri: String, sock: String, data: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sendx")(uri.asInstanceOf[js.Any], sock.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setRecvSocket(ssock: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("set_recv_socket")(ssock.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def setSendSocket(ssock: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("set_send_socket")(ssock.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def setSourceAddress(saddr: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("set_source_address")(saddr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def setxflag(fval: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setxflag")(fval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def viaAddSrvid(fval: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("via_add_srvid")(fval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def viaAddXavpParams(fval: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("via_add_xavp_params")(fval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def viaUseXavpFields(fval: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("via_use_xavp_fields")(fval.asInstanceOf[js.Any]).asInstanceOf[Double]
}
