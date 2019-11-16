package typings.atJestCore

import typings.std.Partial
import typings.yargs.yargsMod.Arguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/cli", JSImport.Namespace)
@js.native
object buildCliMod extends js.Object {
  def runCLI(argv: Arguments[Partial[Anon_All]], projects: js.Array[String]): js.Promise[Anon_GlobalConfig] = js.native
}

