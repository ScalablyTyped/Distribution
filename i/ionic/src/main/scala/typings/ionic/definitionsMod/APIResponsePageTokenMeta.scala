package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIResponsePageTokenMeta extends APIResponseMeta {
  var next_page_token: js.UndefOr[String] = js.undefined
  var prev_page_token: js.UndefOr[String] = js.undefined
}

object APIResponsePageTokenMeta {
  @scala.inline
  def apply(
    request_id: String,
    status: Double,
    version: String,
    next_page_token: String = null,
    prev_page_token: String = null
  ): APIResponsePageTokenMeta = {
    val __obj = js.Dynamic.literal(request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (next_page_token != null) __obj.updateDynamic("next_page_token")(next_page_token.asInstanceOf[js.Any])
    if (prev_page_token != null) __obj.updateDynamic("prev_page_token")(prev_page_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponsePageTokenMeta]
  }
}

