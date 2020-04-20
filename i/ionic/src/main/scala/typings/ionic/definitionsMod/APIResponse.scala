package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionic.definitionsMod.APIResponseSuccess
  - typings.ionic.definitionsMod.APIResponseError
*/
trait APIResponse extends js.Object

object APIResponse {
  @scala.inline
  def APIResponseSuccess(data: APIResponseData, meta: APIResponseMeta): APIResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponse]
  }
  @scala.inline
  def APIResponseError(error: APIResponseErrorError, meta: APIResponseMeta): APIResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponse]
  }
}

