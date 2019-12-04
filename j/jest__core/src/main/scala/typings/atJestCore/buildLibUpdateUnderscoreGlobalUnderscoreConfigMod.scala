package typings.atJestCore

import typings.atJestCore.atJestCoreStrings.bail
import typings.atJestCore.atJestCoreStrings.changedSince
import typings.atJestCore.atJestCoreStrings.collectCoverage
import typings.atJestCore.atJestCoreStrings.collectCoverageFrom
import typings.atJestCore.atJestCoreStrings.collectCoverageOnlyFrom
import typings.atJestCore.atJestCoreStrings.coverageDirectory
import typings.atJestCore.atJestCoreStrings.coverageReporters
import typings.atJestCore.atJestCoreStrings.noSCM
import typings.atJestCore.atJestCoreStrings.notify
import typings.atJestCore.atJestCoreStrings.notifyMode
import typings.atJestCore.atJestCoreStrings.onlyFailures
import typings.atJestCore.atJestCoreStrings.passWithNoTests
import typings.atJestCore.atJestCoreStrings.reporters
import typings.atJestCore.atJestCoreStrings.testNamePattern
import typings.atJestCore.atJestCoreStrings.testPathPattern
import typings.atJestCore.atJestCoreStrings.updateSnapshot
import typings.atJestCore.atJestCoreStrings.verbose
import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/lib/update_global_config", JSImport.Namespace)
@js.native
object buildLibUpdateUnderscoreGlobalUnderscoreConfigMod extends js.Object {
  def default(globalConfig: GlobalConfig): GlobalConfig = js.native
  def default(
    globalConfig: GlobalConfig,
    options: (Partial[
      (Pick[
        GlobalConfig, 
        bail | changedSince | collectCoverage | collectCoverageFrom | collectCoverageOnlyFrom | coverageDirectory | coverageReporters | notify | notifyMode | onlyFailures | reporters | testNamePattern | testPathPattern | updateSnapshot | verbose
      ]) with Anon_Mode
    ]) with (Partial[Pick[GlobalConfig, noSCM | passWithNoTests]])
  ): GlobalConfig = js.native
}

