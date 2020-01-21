package typings.jestRuntime

import typings.jestTypes.configMod.Argv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runtime/build/cli", JSImport.Namespace)
@js.native
object cliMod extends js.Object {
  def run(): Unit = js.native
  def run(cliArgv: Argv): Unit = js.native
  def run(cliArgv: Argv, cliInfo: js.Array[String]): Unit = js.native
}

