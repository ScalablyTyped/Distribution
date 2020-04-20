package typings.intercomClient

import typings.intercomClient.companyMod.CompanyIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompanyid extends CompanyIdentifier {
  var company_id: String
}

object AnonCompanyid {
  @scala.inline
  def apply(company_id: String): AnonCompanyid = {
    val __obj = js.Dynamic.literal(company_id = company_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompanyid]
  }
}

