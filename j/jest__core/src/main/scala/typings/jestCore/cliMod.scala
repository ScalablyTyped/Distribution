package typings.jestCore

import typings.jestCore.anon.GlobalConfig
import typings.jestTypes.configMod.Argv
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/cli", JSImport.Namespace)
@js.native
object cliMod extends js.Object {
  def runCLI(argv: Argv, projects: js.Array[Path]): js.Promise[GlobalConfig] = js.native
}

