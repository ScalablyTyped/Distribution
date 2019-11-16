package typings.jestDashWatcher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
  import typings.atJestTypes.buildConfigMod.GlobalConfig
  import typings.jestDashWatcher.Anon_Mode
  import typings.jestDashWatcher.jestDashWatcherStrings.bail
  import typings.jestDashWatcher.jestDashWatcherStrings.changedSince
  import typings.jestDashWatcher.jestDashWatcherStrings.collectCoverage
  import typings.jestDashWatcher.jestDashWatcherStrings.collectCoverageFrom
  import typings.jestDashWatcher.jestDashWatcherStrings.collectCoverageOnlyFrom
  import typings.jestDashWatcher.jestDashWatcherStrings.coverageDirectory
  import typings.jestDashWatcher.jestDashWatcherStrings.coverageReporters
  import typings.jestDashWatcher.jestDashWatcherStrings.notify
  import typings.jestDashWatcher.jestDashWatcherStrings.notifyMode
  import typings.jestDashWatcher.jestDashWatcherStrings.onlyFailures
  import typings.jestDashWatcher.jestDashWatcherStrings.reporters
  import typings.jestDashWatcher.jestDashWatcherStrings.testNamePattern
  import typings.jestDashWatcher.jestDashWatcherStrings.testPathPattern
  import typings.jestDashWatcher.jestDashWatcherStrings.updateSnapshot
  import typings.jestDashWatcher.jestDashWatcherStrings.verbose
  import typings.std.Partial
  import typings.std.Pick

  type AllowedConfigOptions = Partial[
    (Pick[
      GlobalConfig, 
      bail | changedSince | collectCoverage | collectCoverageFrom | collectCoverageOnlyFrom | coverageDirectory | coverageReporters | notify | notifyMode | onlyFailures | reporters | testNamePattern | testPathPattern | updateSnapshot | verbose
    ]) with Anon_Mode
  ]
  type FileChange = js.Function1[/* fs */ JestHookExposedFS, Unit]
  type ShouldRunTestSuite = js.Function1[/* testSuiteInfo */ TestSuiteInfo, js.Promise[Boolean]]
  type TestRunComplete = js.Function1[/* results */ AggregatedResult, Unit]
  type UpdateConfigCallback = js.Function1[/* config */ js.UndefOr[AllowedConfigOptions], Unit]
}
