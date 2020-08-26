package typings.jestCli

import typings.jestTypes.configMod.Argv
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-cli/build/cli", JSImport.Namespace)
@js.native
object cliMod extends js.Object {
  def buildArgv(): Argv = js.native
  def buildArgv(maybeArgv: js.Array[String]): Argv = js.native
  def run(): js.Promise[Unit] = js.native
  def run(maybeArgv: js.UndefOr[scala.Nothing], project: Path): js.Promise[Unit] = js.native
  def run(maybeArgv: js.Array[String]): js.Promise[Unit] = js.native
  def run(maybeArgv: js.Array[String], project: Path): js.Promise[Unit] = js.native
}

