package typings.jshamcrest

import typings.jshamcrest.JsHamcrest.SimpleMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("hasMember")
@js.native
object hasMember extends js.Object {
  /**
    * The actual value has an attribute with the given name.
    *
    * @param memberName Member name
    * @param [matcherOrValue] Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def apply(memberName: String): SimpleMatcher = js.native
  def apply(memberName: String, matcherOrValue: js.Any): SimpleMatcher = js.native
}

