package typings.googlepay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProtocolVersion extends js.Object {
  var protocolVersion: String
  var publicKey: String
}

object Anon_ProtocolVersion {
  @scala.inline
  def apply(protocolVersion: String, publicKey: String): Anon_ProtocolVersion = {
    val __obj = js.Dynamic.literal(protocolVersion = protocolVersion.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ProtocolVersion]
  }
}

