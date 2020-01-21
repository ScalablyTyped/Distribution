package typings.jestRuntime

import typings.jestRuntime.jestRuntimeStrings.`UsageColon $0 [--configEqualssignLessthansignpathToConfigFileGreaterthansign] LessthansignfileGreaterthansign`
import typings.jestRuntime.jestRuntimeStrings.cache
import typings.jestRuntime.jestRuntimeStrings.config
import typings.jestRuntime.jestRuntimeStrings.debug
import typings.jestRuntime.jestRuntimeStrings.version
import typings.jestRuntime.jestRuntimeStrings.watchman
import typings.std.Record
import typings.yargs.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runtime/build/cli/args", JSImport.Namespace)
@js.native
object argsMod extends js.Object {
  val options: Record[cache | config | debug | version | watchman, Options] = js.native
  val usage: `UsageColon $0 [--configEqualssignLessthansignpathToConfigFileGreaterthansign] LessthansignfileGreaterthansign` = js.native
}

