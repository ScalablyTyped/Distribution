package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CrashReporting {
  
  @JSImport("instabug-reactnative", "CrashReporting")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Send handled JS error object
    *
    * @param errorObject Error object to be sent to Instabug's servers
    */
  inline def reportJSException(errorObject: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reportJSException")(errorObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Enables and disables everything related to crash reporting including intercepting
    * errors in the global error handler. It is enabled by default.
    * @param {boolean} isEnabled
    */
  inline def setEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
