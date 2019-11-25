package typings.hellosignDashEmbedded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ccroles extends js.Object {
  var cc_roles: js.Array[Anon_NameString]
  var message: String
  var signer_roles: js.Array[Anon_Name]
  var title: String
}

object Anon_Ccroles {
  @scala.inline
  def apply(
    cc_roles: js.Array[Anon_NameString],
    message: String,
    signer_roles: js.Array[Anon_Name],
    title: String
  ): Anon_Ccroles = {
    val __obj = js.Dynamic.literal(cc_roles = cc_roles.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signer_roles = signer_roles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Ccroles]
  }
}

