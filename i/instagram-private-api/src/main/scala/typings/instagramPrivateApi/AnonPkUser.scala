package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPkUser extends js.Object {
  var pk: String
  var user: AnonPk
}

object AnonPkUser {
  @scala.inline
  def apply(pk: String, user: AnonPk): AnonPkUser = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPkUser]
  }
}

