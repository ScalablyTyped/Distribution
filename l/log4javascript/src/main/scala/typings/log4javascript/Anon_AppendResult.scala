package typings.log4javascript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppendResult extends js.Object {
  var appendResult: Boolean
  var isError: Boolean
}

object Anon_AppendResult {
  @scala.inline
  def apply(appendResult: Boolean, isError: Boolean): Anon_AppendResult = {
    val __obj = js.Dynamic.literal(appendResult = appendResult.asInstanceOf[js.Any], isError = isError.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AppendResult]
  }
}

