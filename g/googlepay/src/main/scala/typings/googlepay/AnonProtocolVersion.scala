package typings.googlepay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProtocolVersion extends js.Object {
  var protocolVersion: String
  var publicKey: String
}

object AnonProtocolVersion {
  @scala.inline
  def apply(protocolVersion: String, publicKey: String): AnonProtocolVersion = {
    val __obj = js.Dynamic.literal(protocolVersion = protocolVersion.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProtocolVersion]
  }
}

