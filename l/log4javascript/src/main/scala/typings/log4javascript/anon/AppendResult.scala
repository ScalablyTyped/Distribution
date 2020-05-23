package typings.log4javascript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendResult extends js.Object {
  var appendResult: Boolean
  var isError: Boolean
}

object AppendResult {
  @scala.inline
  def apply(appendResult: Boolean, isError: Boolean): AppendResult = {
    val __obj = js.Dynamic.literal(appendResult = appendResult.asInstanceOf[js.Any], isError = isError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendResult]
  }
}

