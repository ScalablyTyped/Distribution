package typings.jsforce.apiChatterMod

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
    val __obj = js.Dynamic.literal(hasError = hasError, results = results)
  
    __obj.asInstanceOf[BatchRequestResults]
  }
}

