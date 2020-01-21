package typings.jsforce.chatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchRequestResults extends js.Object {
  var hasError: Boolean
  var results: js.Array[BatchRequestResult]
}

object BatchRequestResults {
  @scala.inline
  def apply(hasError: Boolean, results: js.Array[BatchRequestResult]): BatchRequestResults = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchRequestResults]
  }
}

