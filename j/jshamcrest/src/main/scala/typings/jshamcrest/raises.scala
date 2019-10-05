package typings.jshamcrest

import typings.jshamcrest.JsHamcrest.SimpleMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("raises")
@js.native
object raises extends js.Object {
  /**
    * The actual value is a function and, when invoked, it should throw an exception with the given name.
    *
    * @param exceptionName Name of the expected exception
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def apply(exceptionName: String): SimpleMatcher = js.native
}

