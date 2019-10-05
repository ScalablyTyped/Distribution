package typings.jshamcrest

import typings.jshamcrest.JsHamcrest.SimpleMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("hasItems")
@js.native
object hasItems extends js.Object {
  /**
    * The actual value should be an array and matchersOrValues must match at least one item.
    *
    * @param matchersOrValues Instances of JsHamcrest.SimpleMatcher and/or values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def apply(matchersOrValues: js.Any*): SimpleMatcher = js.native
}

