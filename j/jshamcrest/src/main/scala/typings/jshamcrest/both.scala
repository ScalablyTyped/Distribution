package typings.jshamcrest

import typings.jshamcrest.JsHamcrest.CombinableMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("both")
@js.native
object both extends js.Object {
  /**
    * Combinable matcher where the actual value must match all the given matchers or values.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
    */
  def apply(matcherOrValue: js.Any): CombinableMatcher = js.native
}

