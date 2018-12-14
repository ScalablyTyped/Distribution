package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InitialOptions extends js.Object {
  var automock: js.UndefOr[scala.Boolean] = js.undefined
  var bail: js.UndefOr[scala.Boolean] = js.undefined
  var browser: js.UndefOr[scala.Boolean] = js.undefined
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var cacheDirectory: js.UndefOr[Path] = js.undefined
  var changedFilesWithAncestor: js.UndefOr[scala.Boolean] = js.undefined
  var changedSince: js.UndefOr[java.lang.String] = js.undefined
  var clearMocks: js.UndefOr[scala.Boolean] = js.undefined
  var collectCoverage: js.UndefOr[scala.Boolean] = js.undefined
  var collectCoverageFrom: js.UndefOr[js.Array[Glob]] = js.undefined
  var collectCoverageOnlyFrom: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  var coverageDirectory: js.UndefOr[java.lang.String] = js.undefined
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var coverageReporters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var coverageThreshold: js.UndefOr[jestLib.Anon_Global] = js.undefined
  var detectLeaks: js.UndefOr[scala.Boolean] = js.undefined
  var detectOpenHandles: js.UndefOr[scala.Boolean] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var errorOnDeprecated: js.UndefOr[scala.Boolean] = js.undefined
  var expand: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[Path] = js.undefined
  var findRelatedTests: js.UndefOr[scala.Boolean] = js.undefined
  var forceCoverageMatch: js.UndefOr[js.Array[Glob]] = js.undefined
  var forceExit: js.UndefOr[scala.Boolean] = js.undefined
  var globalSetup: js.UndefOr[Maybe[java.lang.String]] = js.undefined
  var globalTeardown: js.UndefOr[Maybe[java.lang.String]] = js.undefined
  var globals: js.UndefOr[ConfigGlobals] = js.undefined
  var haste: js.UndefOr[HasteConfig] = js.undefined
  var json: js.UndefOr[scala.Boolean] = js.undefined
  var lastCommit: js.UndefOr[scala.Boolean] = js.undefined
  var listTests: js.UndefOr[scala.Boolean] = js.undefined
  var logHeapUsage: js.UndefOr[scala.Boolean] = js.undefined
  var mapCoverage: js.UndefOr[scala.Boolean] = js.undefined
  var moduleDirectories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var moduleFileExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var moduleLoader: js.UndefOr[Path] = js.undefined
  var moduleNameMapper: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var modulePathIgnorePatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var modulePaths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var noStackTrace: js.UndefOr[scala.Boolean] = js.undefined
  var notifyMode: js.UndefOr[java.lang.String] = js.undefined
  @JSName("notify")
  var notify_FInitialOptions: js.UndefOr[scala.Boolean] = js.undefined
  var onlyChanged: js.UndefOr[scala.Boolean] = js.undefined
  var outputFile: js.UndefOr[Path] = js.undefined
  var passWithNoTests: js.UndefOr[scala.Boolean] = js.undefined
  var preprocessorIgnorePatterns: js.UndefOr[js.Array[Glob]] = js.undefined
  var preset: js.UndefOr[Maybe[java.lang.String]] = js.undefined
  var projects: js.UndefOr[js.Array[Glob]] = js.undefined
  var replname: js.UndefOr[Maybe[java.lang.String]] = js.undefined
  var reporters: js.UndefOr[js.Array[ReporterConfig | java.lang.String]] = js.undefined
  var resetMocks: js.UndefOr[scala.Boolean] = js.undefined
  var resetModules: js.UndefOr[scala.Boolean] = js.undefined
  var resolver: js.UndefOr[Maybe[Path]] = js.undefined
  var restoreMocks: js.UndefOr[scala.Boolean] = js.undefined
  var rootDir: js.UndefOr[Path] = js.undefined
  var roots: js.UndefOr[js.Array[Path]] = js.undefined
  var runTestsByPath: js.UndefOr[scala.Boolean] = js.undefined
  var runner: js.UndefOr[java.lang.String] = js.undefined
  var scriptPreprocessor: js.UndefOr[java.lang.String] = js.undefined
  var setupFiles: js.UndefOr[js.Array[Path]] = js.undefined
  var setupTestFrameworkScriptFile: js.UndefOr[Path] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var skipFilter: js.UndefOr[scala.Boolean] = js.undefined
  var skipNodeResolution: js.UndefOr[scala.Boolean] = js.undefined
  var snapshotSerializers: js.UndefOr[js.Array[Path]] = js.undefined
  var testEnvironment: js.UndefOr[java.lang.String] = js.undefined
  var testEnvironmentOptions: js.UndefOr[js.Object] = js.undefined
  var testFailureExitCode: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var testLocationInResults: js.UndefOr[scala.Boolean] = js.undefined
  var testMatch: js.UndefOr[js.Array[Glob]] = js.undefined
  var testNamePattern: js.UndefOr[java.lang.String] = js.undefined
  var testPathDirs: js.UndefOr[js.Array[Path]] = js.undefined
  var testPathIgnorePatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var testRegex: js.UndefOr[java.lang.String] = js.undefined
  var testResultsProcessor: js.UndefOr[Maybe[java.lang.String]] = js.undefined
  var testRunner: js.UndefOr[java.lang.String] = js.undefined
  var testURL: js.UndefOr[java.lang.String] = js.undefined
  var timers: js.UndefOr[jestLib.jestLibStrings.real | jestLib.jestLibStrings.fake] = js.undefined
  var transform: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var transformIgnorePatterns: js.UndefOr[js.Array[Glob]] = js.undefined
  var unmockedModulePathPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var updateSnapshot: js.UndefOr[scala.Boolean] = js.undefined
  var useStderr: js.UndefOr[scala.Boolean] = js.undefined
  var verbose: js.UndefOr[Maybe[scala.Boolean]] = js.undefined
  var watch: js.UndefOr[scala.Boolean] = js.undefined
  var watchAll: js.UndefOr[scala.Boolean] = js.undefined
  var watchPathIgnorePatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var watchPlugins: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var watchman: js.UndefOr[scala.Boolean] = js.undefined
}

