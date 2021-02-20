package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NetworkLogger {
  
  @JSImport("instabug-reactnative", "NetworkLogger.setEnabled")
  @js.native
  def setEnabled(isEnabled: Boolean): Unit = js.native
  
  @JSImport("instabug-reactnative", "NetworkLogger.setNetworkDataObfuscationHandler")
  @js.native
  def setNetworkDataObfuscationHandler(handler: js.Function0[Unit]): Unit = js.native
  
  @JSImport("instabug-reactnative", "NetworkLogger.setProgressHandlerForRequest")
  @js.native
  def setProgressHandlerForRequest(handler: js.Function0[Unit]): Unit = js.native
  
  @JSImport("instabug-reactnative", "NetworkLogger.setRequestFilterExpression")
  @js.native
  def setRequestFilterExpression(expression: String): Unit = js.native
}
