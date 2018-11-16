package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DefaultOptions extends js.Object {
  var automock: scala.Boolean
  var bail: scala.Boolean
  var browser: scala.Boolean
  var cache: scala.Boolean
  var cacheDirectory: Path
  var changedFilesWithAncestor: scala.Boolean
  var clearMocks: scala.Boolean
  var collectCoverage: scala.Boolean
  var collectCoverageFrom: Maybe[js.Array[java.lang.String]]
  var coverageDirectory: Maybe[java.lang.String]
  var coveragePathIgnorePatterns: js.Array[java.lang.String]
  var coverageReporters: js.Array[java.lang.String]
  var coverageThreshold: Maybe[jestLib.Anon_Global]
  var detectLeaks: scala.Boolean
  var detectOpenHandles: scala.Boolean
  var errorOnDeprecated: scala.Boolean
  var expand: scala.Boolean
  var filter: Maybe[Path]
  var forceCoverageMatch: js.Array[Glob]
  var globalSetup: Maybe[java.lang.String]
  var globalTeardown: Maybe[java.lang.String]
  var globals: ConfigGlobals
  var haste: HasteConfig
  var moduleDirectories: js.Array[java.lang.String]
  var moduleFileExtensions: js.Array[java.lang.String]
  var moduleNameMapper: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  var modulePathIgnorePatterns: js.Array[java.lang.String]
  var noStackTrace: scala.Boolean
  var notifyMode: java.lang.String
  @JSName("notify")
  var notify_FDefaultOptions: scala.Boolean
  var preset: Maybe[java.lang.String]
  var projects: Maybe[js.Array[java.lang.String | ProjectConfig]]
  var resetMocks: scala.Boolean
  var resetModules: scala.Boolean
  var resolver: Maybe[Path]
  var restoreMocks: scala.Boolean
  var rootDir: Maybe[Path]
  var roots: Maybe[js.Array[Path]]
  var runTestsByPath: scala.Boolean
  var runner: java.lang.String
  var setupFiles: js.Array[Path]
  var setupTestFrameworkScriptFile: Maybe[Path]
  var skipFilter: scala.Boolean
  var snapshotSerializers: js.Array[Path]
  var testEnvironment: java.lang.String
  var testEnvironmentOptions: js.Object
  var testFailureExitCode: java.lang.String | scala.Double
  var testLocationInResults: scala.Boolean
  var testMatch: js.Array[Glob]
  var testPathIgnorePatterns: js.Array[java.lang.String]
  var testRegex: java.lang.String
  var testResultsProcessor: Maybe[java.lang.String]
  var testRunner: Maybe[java.lang.String]
  var testURL: java.lang.String
  var timers: jestLib.jestLibStrings.real | jestLib.jestLibStrings.fake
  var transform: Maybe[ScalablyTyped.runtime.StringDictionary[java.lang.String]]
  var transformIgnorePatterns: js.Array[Glob]
  var useStderr: scala.Boolean
  var verbose: Maybe[scala.Boolean]
  var watch: scala.Boolean
  var watchPathIgnorePatterns: js.Array[java.lang.String]
  var watchman: scala.Boolean
}

