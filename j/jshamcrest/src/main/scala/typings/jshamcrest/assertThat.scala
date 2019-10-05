package typings.jshamcrest

import typings.jshamcrest.JsHamcrest.Description
import typings.jshamcrest.JsHamcrest.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("assertThat")
@js.native
object assertThat extends js.Object {
  //
  // Functions that are copied by copyMembers() to the global scope are copy-n-pasted here.
  //
  // TODO There must be a better way to do this, and not every testing framework places them in the global scope.
  //
  //
  // Assert
  //
  /**
    * Fails if the actual value does not match the matcher.
    *
    * @param actual Value to test against the matcher
    * @param matcher Applied to the value
    * @param message Prepends the built description
    * @return {JsHamcrest.Description} Contains the message, actual value, matcher, and result
    */
  def apply(actual: js.Any): Description = js.native
  def apply(actual: js.Any, matcher: Matcher): Description = js.native
  def apply(actual: js.Any, matcher: Matcher, message: js.Any): Description = js.native
}

