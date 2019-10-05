package typings.jshamcrest

import typings.jshamcrest.JsHamcrest.SimpleMatcher
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("matches")
@js.native
object matches extends js.Object {
  /**
    * The actual string must match regex.
    *
    * @param regex String
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def apply(regex: RegExp): SimpleMatcher = js.native
}

