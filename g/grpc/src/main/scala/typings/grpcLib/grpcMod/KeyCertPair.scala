package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyCertPair extends js.Object {
  /**
    * The server's certificate chain
    */
  var cert_chain: nodeLib.Buffer
  /**
    * The server's private key
    */
  var private_key: nodeLib.Buffer
}

object KeyCertPair {
  @scala.inline
  def apply(cert_chain: nodeLib.Buffer, private_key: nodeLib.Buffer): KeyCertPair = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cert_chain")(cert_chain)
    __obj.updateDynamic("private_key")(private_key)
    __obj.asInstanceOf[KeyCertPair]
  }
}

