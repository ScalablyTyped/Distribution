package typings.intercomClient.anon

import typings.intercomClient.companyMod.CompanyIdentifier
import typings.intercomClient.leadMod.LeadIdentifier
import typings.intercomClient.userMod.UserIdIdentifier
import typings.intercomClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id
  extends UserIdIdentifier
     with CompanyIdentifier
     with LeadIdentifier
     with VisitorIdentifier {
  var id: String
}

object Id {
  @scala.inline
  def apply(id: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

