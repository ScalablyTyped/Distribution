package typings.intercomClient

import typings.intercomClient.companyMod.CompanyIdentifier
import typings.intercomClient.leadMod.LeadIdentifier
import typings.intercomClient.userMod.UserIdentifier
import typings.intercomClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId
  extends CompanyIdentifier
     with LeadIdentifier
     with UserIdentifier
     with VisitorIdentifier {
  var id: String
}

object AnonId {
  @scala.inline
  def apply(id: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

