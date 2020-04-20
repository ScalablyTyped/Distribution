package typings.ionic.libSshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSHKeyCreateDetails extends js.Object {
  var pubkey: String
}

object SSHKeyCreateDetails {
  @scala.inline
  def apply(pubkey: String): SSHKeyCreateDetails = {
    val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSHKeyCreateDetails]
  }
}

