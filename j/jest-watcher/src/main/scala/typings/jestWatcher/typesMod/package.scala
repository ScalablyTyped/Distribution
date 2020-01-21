package typings.jestWatcher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AllowedConfigOptions = typings.std.Partial[
    (typings.std.Pick[
      typings.jestTypes.configMod.GlobalConfig, 
      typings.jestWatcher.jestWatcherStrings.bail | typings.jestWatcher.jestWatcherStrings.changedSince | typings.jestWatcher.jestWatcherStrings.collectCoverage | typings.jestWatcher.jestWatcherStrings.collectCoverageFrom | typings.jestWatcher.jestWatcherStrings.collectCoverageOnlyFrom | typings.jestWatcher.jestWatcherStrings.coverageDirectory | typings.jestWatcher.jestWatcherStrings.coverageReporters | typings.jestWatcher.jestWatcherStrings.notify | typings.jestWatcher.jestWatcherStrings.notifyMode | typings.jestWatcher.jestWatcherStrings.onlyFailures | typings.jestWatcher.jestWatcherStrings.reporters | typings.jestWatcher.jestWatcherStrings.testNamePattern | typings.jestWatcher.jestWatcherStrings.testPathPattern | typings.jestWatcher.jestWatcherStrings.updateSnapshot | typings.jestWatcher.jestWatcherStrings.verbose
    ]) with typings.jestWatcher.AnonMode
  ]
  type FileChange = js.Function1[/* fs */ typings.jestWatcher.typesMod.JestHookExposedFS, scala.Unit]
  type ShouldRunTestSuite = js.Function1[
    /* testSuiteInfo */ typings.jestWatcher.typesMod.TestSuiteInfo, 
    js.Promise[scala.Boolean]
  ]
  type TestRunComplete = js.Function1[/* results */ typings.jestTestResult.typesMod.AggregatedResult, scala.Unit]
  type UpdateConfigCallback = js.Function1[
    /* config */ js.UndefOr[typings.jestWatcher.typesMod.AllowedConfigOptions], 
    scala.Unit
  ]
}
