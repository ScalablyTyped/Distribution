package typings.logfmt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contentlength extends js.Object {
  var content_length: js.UndefOr[String] = js.undefined
  var content_type: js.UndefOr[String] = js.undefined
  var ip: String
  var method: String
  var path: String
  var request_id: js.UndefOr[String] = js.undefined
  var status: Double
  var time: String
}

object Anon_Contentlength {
  @scala.inline
  def apply(
    ip: String,
    method: String,
    path: String,
    status: Double,
    time: String,
    content_length: String = null,
    content_type: String = null,
    request_id: String = null
  ): Anon_Contentlength = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (content_length != null) __obj.updateDynamic("content_length")(content_length.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (request_id != null) __obj.updateDynamic("request_id")(request_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Contentlength]
  }
}

