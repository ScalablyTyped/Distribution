package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GlobalConfig extends js.Object {
  var bail: scala.Boolean
  var changedFilesWithAncestor: scala.Boolean
  var changedSince: java.lang.String
  var collectCoverage: scala.Boolean
  var collectCoverageFrom: js.Array[java.lang.String]
  var collectCoverageOnlyFrom: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  var coverageDirectory: java.lang.String
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var coverageReporters: js.Array[java.lang.String]
  var coverageThreshold: jestDashCliLib.Anon_Global
  var detectLeaks: scala.Boolean
  var detectOpenHandles: scala.Boolean
  var enabledTestsMap: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]
  ] = js.undefined
  var errorOnDeprecated: scala.Boolean
  var expand: scala.Boolean
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var findRelatedTests: scala.Boolean
  var forceExit: scala.Boolean
  var globalSetup: js.UndefOr[java.lang.String] = js.undefined
  var globalTeardown: js.UndefOr[java.lang.String] = js.undefined
  var json: scala.Boolean
  var lastCommit: scala.Boolean
  var listTests: scala.Boolean
  var logHeapUsage: scala.Boolean
  var maxWorkers: scala.Double
  var noSCM: js.UndefOr[scala.Boolean] = js.undefined
  var noStackTrace: scala.Boolean
  var nonFlagArgs: js.Array[java.lang.String]
  var notifyMode: java.lang.String
  @JSName("notify")
  var notify_FGlobalConfig: scala.Boolean
  var onlyChanged: scala.Boolean
  var onlyFailures: scala.Boolean
  var outputFile: js.UndefOr[java.lang.String] = js.undefined
  var passWithNoTests: scala.Boolean
  var projects: js.Array[java.lang.String]
  var replname: js.UndefOr[java.lang.String] = js.undefined
  var reporters: js.Array[java.lang.String | ReporterConfig]
  var rootDir: java.lang.String
  var runTestsByPath: scala.Boolean
  var silent: scala.Boolean
  var skipFilter: scala.Boolean
  var testFailureExitCode: scala.Double
  var testNamePattern: java.lang.String
  var testPathPattern: java.lang.String
  var testResultsProcessor: js.UndefOr[java.lang.String] = js.undefined
  var updateSnapshot: SnapshotUpdateState
  var useStderr: scala.Boolean
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
  var watch: scala.Boolean
  var watchAll: scala.Boolean
  var watchPlugins: js.UndefOr[js.Array[jestDashCliLib.Anon_Config]] = js.undefined
  var watchman: scala.Boolean
}

