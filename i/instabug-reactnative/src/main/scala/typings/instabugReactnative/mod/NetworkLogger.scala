package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NetworkLogger {
  
  @JSImport("instabug-reactnative", "NetworkLogger")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def setEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setNetworkDataObfuscationHandler(handler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNetworkDataObfuscationHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setProgressHandlerForRequest(handler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setProgressHandlerForRequest")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setRequestFilterExpression(expression: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRequestFilterExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
