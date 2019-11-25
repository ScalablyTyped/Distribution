package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIResponseSuccess extends APIResponse {
  var data: APIResponseData
  var meta: APIResponseMeta
}

object APIResponseSuccess {
  @scala.inline
  def apply(data: APIResponseData, meta: APIResponseMeta): APIResponseSuccess = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[APIResponseSuccess]
  }
}

