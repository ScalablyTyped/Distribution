package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rls {
  
  @JSGlobal("KSR.rls")
  @js.native
  val ^ : js.Any = js.native
  
  inline def handleNotify(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("handle_notify")().asInstanceOf[Double]
  
  inline def handleSubscribe(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("handle_subscribe")().asInstanceOf[Double]
  
  inline def handleSubscribeUri(wuri: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("handle_subscribe_uri")(wuri.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def updateSubs(uri: String, event: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("update_subs")(uri.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Double]
}
