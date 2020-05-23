package typings.hellosignEmbedded.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ccroles extends js.Object {
  var cc_roles: js.Array[NameString]
  var message: String
  var signer_roles: js.Array[Name]
  var title: String
}

object Ccroles {
  @scala.inline
  def apply(cc_roles: js.Array[NameString], message: String, signer_roles: js.Array[Name], title: String): Ccroles = {
    val __obj = js.Dynamic.literal(cc_roles = cc_roles.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signer_roles = signer_roles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ccroles]
  }
}

