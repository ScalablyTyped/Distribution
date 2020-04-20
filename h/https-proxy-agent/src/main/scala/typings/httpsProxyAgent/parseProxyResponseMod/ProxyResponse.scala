package typings.httpsProxyAgent.parseProxyResponseMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyResponse extends js.Object {
  var buffered: Buffer
  var statusCode: Double
}

object ProxyResponse {
  @scala.inline
  def apply(buffered: Buffer, statusCode: Double): ProxyResponse = {
    val __obj = js.Dynamic.literal(buffered = buffered.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyResponse]
  }
}

