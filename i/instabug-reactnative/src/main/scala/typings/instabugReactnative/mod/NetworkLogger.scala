package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NetworkLogger {
  
  @JSImport("instabug-reactnative", "NetworkLogger")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Apollo Link Request Handler to track network log for graphQL using apollo
    * @param {any} operation 
    * @param {any} forward 
    */
  inline def apolloLinkRequestHandler(operation: Any, forward: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apolloLinkRequestHandler")(operation.asInstanceOf[js.Any], forward.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Sets whether network logs should be sent with bug reports.
    * It is enabled by default.
    * @param {boolean} isEnabled
    */
  inline def setEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Obfuscates any response data.
    * @param {function} handler
    */
  inline def setNetworkDataObfuscationHandler(handler: js.Function1[/* networkData */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNetworkDataObfuscationHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Returns progress in terms of totalBytesSent and totalBytesExpectedToSend a network request.
    * @param {function} handler
    */
  inline def setProgressHandlerForRequest(handler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setProgressHandlerForRequest")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Omit requests from being logged based on either their request or response details
    * @param {string} expression
    */
  inline def setRequestFilterExpression(expression: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRequestFilterExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
