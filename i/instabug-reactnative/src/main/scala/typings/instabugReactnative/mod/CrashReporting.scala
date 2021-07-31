package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CrashReporting {
  
  @JSImport("instabug-reactnative", "CrashReporting")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def reportJSException(Exception: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reportJSException")(Exception.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
