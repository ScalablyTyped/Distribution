package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xhttp {
  
  @JSGlobal("KSR.xhttp")
  @js.native
  val ^ : js.Any = js.native
  
  inline def xhttpReply(code: Double, reason: String, ctype: String, body: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("xhttp_reply")(code.asInstanceOf[js.Any], reason.asInstanceOf[js.Any], ctype.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Double]
}
