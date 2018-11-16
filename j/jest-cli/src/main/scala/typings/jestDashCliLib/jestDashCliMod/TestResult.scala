package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TestResult extends js.Object {
  var console: js.UndefOr[ConsoleBuffer] = js.undefined
  var coverage: js.UndefOr[RawCoverage] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var failureMessage: js.UndefOr[java.lang.String] = js.undefined
  var leaks: scala.Boolean
  var memoryUsage: js.UndefOr[scala.Double] = js.undefined
  var numFailingTests: scala.Double
  var numPassingTests: scala.Double
  var numPendingTests: scala.Double
  var openHandles: js.Array[stdLib.Error]
  var perfStats: jestDashCliLib.Anon_End
  var skipped: scala.Boolean
  var snapshot: jestDashCliLib.Anon_Unchecked
  var sourceMaps: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  var testExecError: js.UndefOr[SerializableError] = js.undefined
  var testFilePath: java.lang.String
  var testResults: js.Array[AssertionResult]
}

