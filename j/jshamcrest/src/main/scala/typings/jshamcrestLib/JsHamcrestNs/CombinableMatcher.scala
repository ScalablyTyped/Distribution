package typings
package jshamcrestLib.JsHamcrestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsHamcrest.CombinableMatcher")
@js.native
class CombinableMatcher () extends SimpleMatcher {
  /**
    * Wraps this matcher and the given matcher using JsHamcrest.Matchers.allOf().
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
    */
  def and(matcherOrValue: js.Any): CombinableMatcher = js.native
  /**
    * Wraps this matcher and the given matcher using JsHamcrest.Matchers.anyOf().
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
    */
  def or(matcherOrValue: js.Any): CombinableMatcher = js.native
}

