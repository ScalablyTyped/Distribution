package typings.hapiHawk.browserMod.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedUri extends js.Object {
  var host: String
  var port: String
  var resource: String
}

object ParsedUri {
  @scala.inline
  def apply(host: String, port: String, resource: String): ParsedUri = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedUri]
  }
}

