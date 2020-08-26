package typings.hellosignEmbedded.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ccroles extends js.Object {
  var cc_roles: js.Array[NameString] = js.native
  var message: String = js.native
  var signer_roles: js.Array[Name] = js.native
  var title: String = js.native
}

object Ccroles {
  @scala.inline
  def apply(cc_roles: js.Array[NameString], message: String, signer_roles: js.Array[Name], title: String): Ccroles = {
    val __obj = js.Dynamic.literal(cc_roles = cc_roles.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signer_roles = signer_roles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ccroles]
  }
  @scala.inline
  implicit class CcrolesOps[Self <: Ccroles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCc_rolesVarargs(value: NameString*): Self = this.set("cc_roles", js.Array(value :_*))
    @scala.inline
    def setCc_roles(value: js.Array[NameString]): Self = this.set("cc_roles", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigner_rolesVarargs(value: Name*): Self = this.set("signer_roles", js.Array(value :_*))
    @scala.inline
    def setSigner_roles(value: js.Array[Name]): Self = this.set("signer_roles", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

