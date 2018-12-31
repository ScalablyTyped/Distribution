package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalConfig extends js.Object {
  var bail: scala.Boolean
  var collectCoverage: scala.Boolean
  var collectCoverageFrom: js.Array[Glob]
  var collectCoverageOnlyFrom: Maybe[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]
  var coverageDirectory: java.lang.String
  var coverageReporters: js.Array[java.lang.String]
  var coverageThreshold: jestLib.Anon_Global
  var expand: scala.Boolean
  var forceExit: scala.Boolean
  var logHeapUsage: scala.Boolean
  var mapCoverage: scala.Boolean
  var noStackTrace: scala.Boolean
  @JSName("notify")
  var notify_FGlobalConfig: scala.Boolean
  var projects: js.Array[Glob]
  var replname: Maybe[java.lang.String]
  var reporters: js.Array[ReporterConfig]
  var rootDir: Path
  var silent: scala.Boolean
  var testNamePattern: java.lang.String
  var testPathPattern: java.lang.String
  var testResultsProcessor: Maybe[java.lang.String]
  var updateSnapshot: SnapshotUpdateState
  var useStderr: scala.Boolean
  var verbose: Maybe[scala.Boolean]
  var watch: scala.Boolean
  var watchman: scala.Boolean
}

