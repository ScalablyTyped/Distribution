package typings.instabugReactnative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instabug-reactnative", "CrashReporting")
@js.native
object CrashReporting extends js.Object {
  def reportJSException(Exception: js.Object): Unit = js.native
  def setEnabled(isEnabled: Boolean): Unit = js.native
}

