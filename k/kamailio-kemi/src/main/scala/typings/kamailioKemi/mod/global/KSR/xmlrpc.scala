package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlrpc {
  
  @JSGlobal("KSR.xmlrpc")
  @js.native
  val ^ : js.Any = js.native
  
  inline def dispatchRpc(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch_rpc")().asInstanceOf[Double]
  
  inline def xmlrpcReply(rcode: Double, reason: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlrpc_reply")(rcode.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[Double]
}
