package typings.intercomDashClient

import typings.intercomDashClient.intercomDashClientStrings.user
import typings.intercomDashClient.userMod.UserIdentifier
import typings.intercomDashClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdentifierType extends js.Object {
  var identifier: VisitorIdentifier
  var `type`: user
  var user: UserIdentifier
}

object Anon_IdentifierType {
  @scala.inline
  def apply(identifier: VisitorIdentifier, `type`: user, user: UserIdentifier): Anon_IdentifierType = {
    val __obj = js.Dynamic.literal(identifier = identifier, user = user)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_IdentifierType]
  }
}

