package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var email: java.lang.String
  var id: scala.Double
  var oauth_identities: js.UndefOr[OAuthIdentity] = js.undefined
}

object User {
  @scala.inline
  def apply(email: java.lang.String, id: scala.Double, oauth_identities: OAuthIdentity = null): User = {
    val __obj = js.Dynamic.literal(email = email, id = id)
    if (oauth_identities != null) __obj.updateDynamic("oauth_identities")(oauth_identities)
    __obj.asInstanceOf[User]
  }
}

