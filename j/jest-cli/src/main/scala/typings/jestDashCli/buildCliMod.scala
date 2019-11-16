package typings.jestDashCli

import typings.atJestTypes.buildConfigMod.Path
import typings.std.Partial
import typings.yargs.yargsMod.Arguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-cli/build/cli", JSImport.Namespace)
@js.native
object buildCliMod extends js.Object {
  def buildArgv(): Arguments[Partial[Anon_All]] = js.native
  def buildArgv(maybeArgv: js.Array[String]): Arguments[Partial[Anon_All]] = js.native
  def run(): js.Promise[Unit] = js.native
  def run(maybeArgv: js.Array[String]): js.Promise[Unit] = js.native
  def run(maybeArgv: js.Array[String], project: Path): js.Promise[Unit] = js.native
}

