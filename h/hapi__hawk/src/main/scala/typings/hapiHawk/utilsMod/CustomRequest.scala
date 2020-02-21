package typings.hapiHawk.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomRequest extends js.Object {
  var authorization: String
  var contentType: String
  var host: String
  var method: String
  var port: Double
  var url: String
}

object CustomRequest {
  @scala.inline
  def apply(
    authorization: String,
    contentType: String,
    host: String,
    method: String,
    port: Double,
    url: String
  ): CustomRequest = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomRequest]
  }
}

