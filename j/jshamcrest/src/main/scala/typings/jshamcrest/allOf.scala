package typings.jshamcrest

import typings.jshamcrest.JsHamcrest.SimpleMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("allOf")
@js.native
object allOf extends js.Object {
  //
  // Core Matchers
  //
  /**
    * All matchesOrValues must match the actual value. This matcher behaves pretty much like the JavaScript && (and) operator.
    *
    * @param matchersOrValues Instances of JsHamcrest.SimpleMatcher and/or values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def apply(matchersOrValues: js.Any*): SimpleMatcher = js.native
}

