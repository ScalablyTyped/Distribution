package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedResultWithoutCoverage extends js.Object {
  var numFailedTestSuites: scala.Double
  var numFailedTests: scala.Double
  var numPassedTestSuites: scala.Double
  var numPassedTests: scala.Double
  var numPendingTestSuites: scala.Double
  var numPendingTests: scala.Double
  var numRuntimeErrorTestSuites: scala.Double
  var numTodoTests: scala.Double
  var numTotalTestSuites: scala.Double
  var numTotalTests: scala.Double
  var openHandles: js.Array[stdLib.Error]
  var snapshot: SnapshotSummary
  var startTime: scala.Double
  var success: scala.Boolean
  var testResults: js.Array[TestResult]
  var wasInterrupted: scala.Boolean
}

