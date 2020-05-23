package typings.jestRuntime

import typings.yargs.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runtime/build/cli/args", JSImport.Namespace)
@js.native
object argsMod extends js.Object {
  val usage: /* "Usage: $0 [--config=<pathToConfigFile>] <file>" */ String = js.native
  @js.native
  object options extends js.Object {
    var cache: Options = js.native
    var config: Options = js.native
    var debug: Options = js.native
    var version: Options = js.native
    var watchman: Options = js.native
  }
  
}

