package typings
package jsforceLib.apiChatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchRequestResult extends js.Object {
  var result: RequestResult
  var statusCode: java.lang.String
}

object BatchRequestResult {
  @scala.inline
  def apply(result: RequestResult, statusCode: java.lang.String): BatchRequestResult = {
    val __obj = js.Dynamic.literal(result = result, statusCode = statusCode)
  
    __obj.asInstanceOf[BatchRequestResult]
  }
}

