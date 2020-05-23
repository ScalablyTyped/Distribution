package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.user
import typings.intercomClient.userMod.UserIdentifier
import typings.intercomClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var identifier: VisitorIdentifier
  var `type`: user
  var user: UserIdentifier
}

object Type {
  @scala.inline
  def apply(identifier: VisitorIdentifier, `type`: user, user: UserIdentifier): Type = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

