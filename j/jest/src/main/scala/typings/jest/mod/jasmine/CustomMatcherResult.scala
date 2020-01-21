package typings.jest.mod.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMatcherResult extends js.Object {
  var message: String | js.Function0[String]
  var pass: Boolean
}

object CustomMatcherResult {
  @scala.inline
  def apply(message: String | js.Function0[String], pass: Boolean): CustomMatcherResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomMatcherResult]
  }
}

