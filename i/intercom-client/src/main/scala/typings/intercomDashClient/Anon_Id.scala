package typings.intercomDashClient

import typings.intercomDashClient.companyMod.CompanyIdentifier
import typings.intercomDashClient.leadMod.LeadIdentifier
import typings.intercomDashClient.userMod.UserIdentifier
import typings.intercomDashClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id
  extends CompanyIdentifier
     with LeadIdentifier
     with UserIdentifier
     with VisitorIdentifier {
  var id: String
}

object Anon_Id {
  @scala.inline
  def apply(id: String): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Id]
  }
}

