package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-appservice-bridge", "Cli")
@js.native
class Cli protected () extends js.Object {
  def this(options: CliOptions) = this()
  def generateRegistration(reg: AppServiceRegistration, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def getConfig(): Null | js.Object = js.native
  def getRegistrationFilePath(): String = js.native
  def run(): Unit = js.native
  def runBridge(port: Double, config: js.Object, reg: AppServiceRegistration): Unit = js.native
  def runBridge(port: Double, config: Null, reg: AppServiceRegistration): Unit = js.native
}

