package typings.interceptDashStdout

import typings.interceptDashStdout.interceptDashStdoutMod.hookFunction
import typings.interceptDashStdout.interceptDashStdoutMod.unhookFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercept-stdout", JSImport.Namespace)
@js.native
object interceptDashStdoutMod extends js.Object {
  def apply(stdoutIntercept: hookFunction): unhookFunction = js.native
  def apply(stdoutIntercept: hookFunction, stderrIntercept: hookFunction): unhookFunction = js.native
  type hookFunction = js.Function1[/* txt */ String, String | Unit]
  type unhookFunction = js.Function0[Unit]
}

