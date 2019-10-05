package typings.jshamcrest

import typings.jshamcrest.JsHamcrest.BetweenBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("between")
@js.native
object between extends js.Object {
  //
  // Number Matchers
  //
  /**
    * The actual number must be between the given range (inclusive).
    *
    * @param start Range start
    * @return {JsHamcrest.BetweenBuilder} Builder object with an and(end) method, which returns a JsHamcrest.SimpleMatcher instance and thus should be called to finish the matcher creation
    */
  def apply(start: js.Any): BetweenBuilder = js.native
}

