package typings.jshamcrest

import typings.jshamcrest.JsHamcrest.SimpleMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("closeTo")
@js.native
object closeTo extends js.Object {
  /**
    * The actual number must be close enough to expected, that is, the actual number is equal to a value within some range of acceptable error.
    *
    * @param expected Expected number
    * @param [delta=0] Expected difference delta
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def apply(expected: Double): SimpleMatcher = js.native
  def apply(expected: Double, delta: Double): SimpleMatcher = js.native
}

