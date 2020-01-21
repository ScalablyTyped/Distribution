package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMatcherResult extends js.Object {
  var pass: Boolean
  def message(): String
}

object CustomMatcherResult {
  @scala.inline
  def apply(message: () => String, pass: Boolean): CustomMatcherResult = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomMatcherResult]
  }
}

