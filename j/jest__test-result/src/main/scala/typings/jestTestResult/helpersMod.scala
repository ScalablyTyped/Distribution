package typings.jestTestResult

import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.SerializableError
import typings.jestTestResult.typesMod.TestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/test-result/build/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  def addResult(aggregatedResults: AggregatedResult, testResult: TestResult): Unit = js.native
  def buildFailureTestResult(testPath: String, err: SerializableError): TestResult = js.native
  def makeEmptyAggregatedTestResult(): AggregatedResult = js.native
}

