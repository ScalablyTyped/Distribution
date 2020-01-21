package typings.jestCore

import typings.jestCore.jestCoreStrings.bail
import typings.jestCore.jestCoreStrings.changedSince
import typings.jestCore.jestCoreStrings.collectCoverage
import typings.jestCore.jestCoreStrings.collectCoverageFrom
import typings.jestCore.jestCoreStrings.collectCoverageOnlyFrom
import typings.jestCore.jestCoreStrings.coverageDirectory
import typings.jestCore.jestCoreStrings.coverageReporters
import typings.jestCore.jestCoreStrings.noSCM
import typings.jestCore.jestCoreStrings.notify
import typings.jestCore.jestCoreStrings.notifyMode
import typings.jestCore.jestCoreStrings.onlyFailures
import typings.jestCore.jestCoreStrings.passWithNoTests
import typings.jestCore.jestCoreStrings.reporters
import typings.jestCore.jestCoreStrings.testNamePattern
import typings.jestCore.jestCoreStrings.testPathPattern
import typings.jestCore.jestCoreStrings.updateSnapshot
import typings.jestCore.jestCoreStrings.verbose
import typings.jestTypes.configMod.GlobalConfig
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/lib/update_global_config", JSImport.Namespace)
@js.native
object updateGlobalConfigMod extends js.Object {
  def default(globalConfig: GlobalConfig): GlobalConfig = js.native
  def default(
    globalConfig: GlobalConfig,
    options: (Partial[
      (Pick[
        GlobalConfig, 
        bail | changedSince | collectCoverage | collectCoverageFrom | collectCoverageOnlyFrom | coverageDirectory | coverageReporters | notify | notifyMode | onlyFailures | reporters | testNamePattern | testPathPattern | updateSnapshot | verbose
      ]) with AnonMode
    ]) with (Partial[Pick[GlobalConfig, noSCM | passWithNoTests]])
  ): GlobalConfig = js.native
}

