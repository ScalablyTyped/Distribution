package typings.hellosignEmbedded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCcroles extends js.Object {
  var cc_roles: js.Array[AnonNameString]
  var message: String
  var signer_roles: js.Array[AnonName]
  var title: String
}

object AnonCcroles {
  @scala.inline
  def apply(
    cc_roles: js.Array[AnonNameString],
    message: String,
    signer_roles: js.Array[AnonName],
    title: String
  ): AnonCcroles = {
    val __obj = js.Dynamic.literal(cc_roles = cc_roles.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signer_roles = signer_roles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCcroles]
  }
}

