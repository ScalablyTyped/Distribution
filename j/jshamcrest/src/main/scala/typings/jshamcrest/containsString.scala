package typings.jshamcrest

import typings.jshamcrest.JsHamcrest.SimpleMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("containsString")
@js.native
object containsString extends js.Object {
  //
  // Text Matchers
  //
  /**
    * The actual string must have a substring equals to str.
    *
    * @param str Substring
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def apply(str: String): SimpleMatcher = js.native
}

