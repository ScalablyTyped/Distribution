package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TestResult extends js.Object {
  var console: Maybe[ConsoleBuffer]
  var coverage: js.UndefOr[RawCoverage] = js.undefined
  var failureMessage: Maybe[java.lang.String]
  var memoryUsage: js.UndefOr[Bytes] = js.undefined
  var numFailingTests: scala.Double
  var numPassingTests: scala.Double
  var numPendingTests: scala.Double
  var perfStats: jestLib.Anon_End
  var skipped: scala.Boolean
  var snapshot: jestLib.Anon_Unchecked
  var sourceMaps: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var testExecError: js.UndefOr[SerializableError] = js.undefined
  var testFilePath: java.lang.String
  var testResults: js.Array[AssertionResult]
}

