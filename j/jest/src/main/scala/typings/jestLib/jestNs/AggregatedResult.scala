package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedResult extends js.Object {
  var coverageMap: js.UndefOr[Maybe[CoverageMap]] = js.undefined
  var numFailedTestSuites: scala.Double
  var numFailedTests: scala.Double
  var numPassedTestSuites: scala.Double
  var numPassedTests: scala.Double
  var numPendingTestSuites: scala.Double
  var numPendingTests: scala.Double
  var numRuntimeErrorTestSuites: scala.Double
  var numTotalTestSuites: scala.Double
  var numTotalTests: scala.Double
  var snapshot: SnapshotSummary
  var startTime: scala.Double
  var success: scala.Boolean
  var testResults: js.Array[TestResult]
  var wasInterrupted: scala.Boolean
}

