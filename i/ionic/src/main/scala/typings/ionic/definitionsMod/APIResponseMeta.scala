package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIResponseMeta extends js.Object {
  var request_id: String
  var status: Double
  var version: String
}

object APIResponseMeta {
  @scala.inline
  def apply(request_id: String, status: Double, version: String): APIResponseMeta = {
    val __obj = js.Dynamic.literal(request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponseMeta]
  }
}

