package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsApiReporter
  extends Reporter
     with org.scalablytyped.runtime.Instantiable0[js.Any] {
  var finished: scala.Boolean = js.native
  var messages: js.Any = js.native
  var result: js.Any = js.native
  var runDetails: RunDetails = js.native
  var started: scala.Boolean = js.native
  def log(str: js.Any): js.Any = js.native
  def results(): js.Any = js.native
  def resultsForSpec(specId: js.Any): js.Any = js.native
  def resultsForSpecs(specIds: js.Any): js.Any = js.native
  def suites(): js.Array[Suite] = js.native
  def `summarizeResult_`(result: js.Any): js.Any = js.native
  def `summarize_`(suiteOrSpec: SuiteOrSpec): js.Any = js.native
}

