package typings.jshamcrest

import typings.jshamcrest.JsHamcrest.SimpleMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("emailAddress")
@js.native
object emailAddress extends js.Object {
  /**
    * The actual string must look like an e-mail address.
    *
    * Warning: This matcher is not fully compliant with RFC2822 due to its complexity.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def apply(): SimpleMatcher = js.native
}

