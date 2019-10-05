package typings.jshamcrest

import typings.jshamcrest.JsHamcrest.SimpleMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("anyOf")
@js.native
object anyOf extends js.Object {
  /**
    * At least one of the matchersOrValues should match the actual value. This matcher behaves pretty much like the JavaScript || (or) operator.
    *
    * @param matchersOrValues Instances of JsHamcrest.SimpleMatcher and/or values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def apply(matchersOrValues: js.Any*): SimpleMatcher = js.native
}

