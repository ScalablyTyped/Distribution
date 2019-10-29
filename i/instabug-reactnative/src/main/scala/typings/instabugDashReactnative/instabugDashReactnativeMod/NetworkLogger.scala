package typings.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instabug-reactnative", "NetworkLogger")
@js.native
object NetworkLogger extends js.Object {
  def setEnabled(isEnabled: Boolean): Unit = js.native
  def setNetworkDataObfuscationHandler(handler: js.Function0[Unit]): Unit = js.native
  def setProgressHandlerForRequest(handler: js.Function0[Unit]): Unit = js.native
  def setRequestFilterExpression(expression: String): Unit = js.native
}

