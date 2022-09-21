package typings.jpm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set one-off and periodic timers
  */
object timersMod {
  
  @JSImport("sdk/timers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearInterval(intervalID: INTERVAL_ID): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(intervalID.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearTimeout(timerID: TIMEOUT_ID): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(timerID.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setInterval(callback: js.Function1[/* repeated */ Any, Any], timeoutMS: Double): INTERVAL_ID = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(callback.asInstanceOf[js.Any], timeoutMS.asInstanceOf[js.Any])).asInstanceOf[INTERVAL_ID]
  
  inline def setTimeout(callback: js.Function1[/* repeated */ Any, Any], timeoutMS: Double): TIMEOUT_ID = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], timeoutMS.asInstanceOf[js.Any])).asInstanceOf[TIMEOUT_ID]
  
  type INTERVAL_ID = Double
  
  type TIMEOUT_ID = Double
}
