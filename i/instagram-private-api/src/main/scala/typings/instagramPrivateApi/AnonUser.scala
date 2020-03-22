package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUser extends js.Object {
  var pk: String
  var user: AnonPk
}

object AnonUser {
  @scala.inline
  def apply(pk: String, user: AnonPk): AnonUser = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUser]
  }
}

