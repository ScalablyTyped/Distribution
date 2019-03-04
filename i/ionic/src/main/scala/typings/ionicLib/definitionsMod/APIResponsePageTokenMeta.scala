package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIResponsePageTokenMeta extends APIResponseMeta {
  var next_page_token: js.UndefOr[java.lang.String] = js.undefined
  var prev_page_token: js.UndefOr[java.lang.String] = js.undefined
}

object APIResponsePageTokenMeta {
  @scala.inline
  def apply(
    request_id: java.lang.String,
    status: scala.Double,
    version: java.lang.String,
    next_page_token: java.lang.String = null,
    prev_page_token: java.lang.String = null
  ): APIResponsePageTokenMeta = {
    val __obj = js.Dynamic.literal(request_id = request_id, status = status, version = version)
    if (next_page_token != null) __obj.updateDynamic("next_page_token")(next_page_token)
    if (prev_page_token != null) __obj.updateDynamic("prev_page_token")(prev_page_token)
    __obj.asInstanceOf[APIResponsePageTokenMeta]
  }
}

