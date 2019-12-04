package typings.jestDashRuntime

import typings.jestDashRuntime.jestDashRuntimeStrings.`Usage: DOLLAR0 [--config=<pathToConfigFile>] <file>`
import typings.jestDashRuntime.jestDashRuntimeStrings.cache
import typings.jestDashRuntime.jestDashRuntimeStrings.config
import typings.jestDashRuntime.jestDashRuntimeStrings.debug
import typings.jestDashRuntime.jestDashRuntimeStrings.version
import typings.jestDashRuntime.jestDashRuntimeStrings.watchman
import typings.std.Record
import typings.yargs.yargsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runtime/build/cli/args", JSImport.Namespace)
@js.native
object buildCliArgsMod extends js.Object {
  val options: Record[cache | config | debug | version | watchman, Options] = js.native
  val usage: `Usage: DOLLAR0 [--config=<pathToConfigFile>] <file>` = js.native
}

