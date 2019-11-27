package typings.ioredis.ioredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressFromResponse extends js.Object {
  var flags: js.UndefOr[String] = js.undefined
  var ip: String
  var port: String
}

object AddressFromResponse {
  @scala.inline
  def apply(ip: String, port: String, flags: String = null): AddressFromResponse = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressFromResponse]
  }
}

