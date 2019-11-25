package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIResponseError extends APIResponse {
  var error: APIResponseErrorError
  var meta: APIResponseMeta
}

object APIResponseError {
  @scala.inline
  def apply(error: APIResponseErrorError, meta: APIResponseMeta): APIResponseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[APIResponseError]
  }
}

