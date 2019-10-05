package typings.jshamcrest

import typings.jshamcrest.JsHamcrest.SimpleMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("hasItem")
@js.native
object hasItem extends js.Object {
  /**
    * The actual value should be an array and it must contain at least one value that matches matcherOrValue.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def apply(matcherOrValue: js.Any): SimpleMatcher = js.native
}

