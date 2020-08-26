package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.user
import typings.intercomClient.userMod.UserIdentifier
import typings.intercomClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  var identifier: VisitorIdentifier = js.native
  var `type`: user = js.native
  var user: UserIdentifier = js.native
}

object Type {
  @scala.inline
  def apply(identifier: VisitorIdentifier, `type`: user, user: UserIdentifier): Type = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
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
    def setIdentifier(value: VisitorIdentifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: user): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: UserIdentifier): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

