package typings.grpcGrpcJs.serverCredentialsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyCertPair extends js.Object {
  var cert_chain: Buffer
  var private_key: Buffer
}

object KeyCertPair {
  @scala.inline
  def apply(cert_chain: Buffer, private_key: Buffer): KeyCertPair = {
    val __obj = js.Dynamic.literal(cert_chain = cert_chain.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyCertPair]
  }
}

