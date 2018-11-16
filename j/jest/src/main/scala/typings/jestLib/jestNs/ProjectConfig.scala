package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProjectConfig extends js.Object {
  var automock: scala.Boolean
  var browser: scala.Boolean
  var cache: scala.Boolean
  var cacheDirectory: Path
  var clearMocks: scala.Boolean
  var coveragePathIgnorePatterns: js.Array[java.lang.String]
  var cwd: Path
  var detectLeaks: scala.Boolean
  var displayName: Maybe[java.lang.String]
  var forceCoverageMatch: js.Array[Glob]
  var globals: ConfigGlobals
  var haste: HasteConfig
  var moduleDirectories: js.Array[java.lang.String]
  var moduleFileExtensions: js.Array[java.lang.String]
  var moduleLoader: Path
  var moduleNameMapper: js.Array[js.Tuple2[java.lang.String, java.lang.String]]
  var modulePathIgnorePatterns: js.Array[java.lang.String]
  var modulePaths: js.Array[java.lang.String]
  var name: java.lang.String
  var resetMocks: scala.Boolean
  var resetModules: scala.Boolean
  var resolver: Maybe[Path]
  var rootDir: Path
  var roots: js.Array[Path]
  var runner: java.lang.String
  var setupFiles: js.Array[Path]
  var setupTestFrameworkScriptFile: Path
  var skipNodeResolution: scala.Boolean
  var snapshotSerializers: js.Array[Path]
  var testEnvironment: java.lang.String
  var testEnvironmentOptions: js.Object
  var testLocationInResults: scala.Boolean
  var testMatch: js.Array[Glob]
  var testPathIgnorePatterns: js.Array[java.lang.String]
  var testRegex: java.lang.String
  var testRunner: java.lang.String
  var testURL: java.lang.String
  var timers: jestLib.jestLibStrings.real | jestLib.jestLibStrings.fake
  var transform: js.Array[js.Tuple2[java.lang.String, Path]]
  var transformIgnorePatterns: js.Array[Glob]
  var unmockedModulePathPatterns: Maybe[js.Array[java.lang.String]]
  var watchPathIgnorePatterns: js.Array[java.lang.String]
}

