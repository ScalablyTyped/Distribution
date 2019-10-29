package typings.atJestTestDashResult

import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
import typings.atJestTestDashResult.buildTypesMod.SerializableError
import typings.atJestTestDashResult.buildTypesMod.TestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/test-result/build/helpers", JSImport.Namespace)
@js.native
object buildHelpersMod extends js.Object {
  def addResult(aggregatedResults: AggregatedResult, testResult: TestResult): Unit = js.native
  def buildFailureTestResult(testPath: String, err: SerializableError): TestResult = js.native
  def makeEmptyAggregatedTestResult(): AggregatedResult = js.native
}

