package typings.logkitty

import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logkitty/build/ios/simulator", JSImport.Namespace)
@js.native
object simulatorMod extends js.Object {
  def runSimulatorLoggingProcess(): ChildProcess = js.native
}

