package typings.jsforce.apiChatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchRequestResult extends js.Object {
  var result: RequestResult
  var statusCode: String
}

object BatchRequestResult {
  @scala.inline
  def apply(result: RequestResult, statusCode: String): BatchRequestResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchRequestResult]
  }
}

