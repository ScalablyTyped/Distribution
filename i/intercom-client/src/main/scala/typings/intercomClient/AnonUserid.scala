package typings.intercomClient

import typings.intercomClient.leadMod.LeadIdentifier
import typings.intercomClient.userMod.UserIdentifier
import typings.intercomClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUserid
  extends LeadIdentifier
     with UserIdentifier
     with VisitorIdentifier {
  var user_id: String
}

object AnonUserid {
  @scala.inline
  def apply(user_id: String): AnonUserid = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUserid]
  }
}

