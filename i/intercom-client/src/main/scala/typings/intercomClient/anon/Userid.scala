package typings.intercomClient.anon

import typings.intercomClient.leadMod.LeadIdentifier
import typings.intercomClient.userMod.UserIdIdentifier
import typings.intercomClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Userid
  extends UserIdIdentifier
     with LeadIdentifier
     with VisitorIdentifier {
  var user_id: String
}

object Userid {
  @scala.inline
  def apply(user_id: String): Userid = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userid]
  }
}

