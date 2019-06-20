package typings
package logfmtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contentlength extends js.Object {
  var content_length: js.UndefOr[java.lang.String] = js.undefined
  var content_type: js.UndefOr[java.lang.String] = js.undefined
  var ip: java.lang.String
  var method: java.lang.String
  var path: java.lang.String
  var request_id: js.UndefOr[java.lang.String] = js.undefined
  var status: scala.Double
  var time: java.lang.String
}

object Anon_Contentlength {
  @scala.inline
  def apply(
    ip: java.lang.String,
    method: java.lang.String,
    path: java.lang.String,
    status: scala.Double,
    time: java.lang.String,
    content_length: java.lang.String = null,
    content_type: java.lang.String = null,
    request_id: java.lang.String = null
  ): Anon_Contentlength = {
    val __obj = js.Dynamic.literal(ip = ip, method = method, path = path, status = status, time = time)
    if (content_length != null) __obj.updateDynamic("content_length")(content_length)
    if (content_type != null) __obj.updateDynamic("content_type")(content_type)
    if (request_id != null) __obj.updateDynamic("request_id")(request_id)
    __obj.asInstanceOf[Anon_Contentlength]
  }
}

