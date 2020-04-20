package typings.log4javascript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppendResult extends js.Object {
  var appendResult: Boolean
  var isError: Boolean
}

object AnonAppendResult {
  @scala.inline
  def apply(appendResult: Boolean, isError: Boolean): AnonAppendResult = {
    val __obj = js.Dynamic.literal(appendResult = appendResult.asInstanceOf[js.Any], isError = isError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppendResult]
  }
}

