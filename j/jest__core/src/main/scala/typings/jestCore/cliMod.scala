package typings.jestCore

import typings.std.Partial
import typings.yargs.mod.Arguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/cli", JSImport.Namespace)
@js.native
object cliMod extends js.Object {
  def runCLI(argv: Arguments[Partial[AnonAll]], projects: js.Array[String]): js.Promise[AnonGlobalConfig] = js.native
}

