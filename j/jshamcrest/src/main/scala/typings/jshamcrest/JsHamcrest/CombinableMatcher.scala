package typings.jshamcrest.JsHamcrest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombinableMatcher extends SimpleMatcher {
  
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
