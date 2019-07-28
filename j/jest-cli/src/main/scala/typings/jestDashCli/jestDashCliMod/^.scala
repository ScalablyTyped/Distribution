package typings.jestDashCli.jestDashCliMod

import typings.jestDashCli.Anon_GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-cli", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def run(): js.Promise[Unit] = js.native
  def run(maybeArgv: js.Array[String]): js.Promise[Unit] = js.native
  def run(maybeArgv: js.Array[String], project: String): js.Promise[Unit] = js.native
  def runCLI(argv: js.Array[String], projects: js.Array[String]): js.Promise[Anon_GlobalConfig] = js.native
}

