package typings.jpm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Store preferences across application restarts
  */
object simplePrefsMod {
  
  @JSImport("sdk/simple-prefs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def on(prefName: String, listener: js.Function1[/* prefName */ String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(prefName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sdk/simple-prefs", "prefs")
  @js.native
  val prefs: js.Object = js.native
  
  inline def removeListener(prefName: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(prefName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
