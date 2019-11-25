package typings.intercomDashClient

import typings.intercomDashClient.companyMod.CompanyIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Companyid extends CompanyIdentifier {
  var company_id: String
}

object Anon_Companyid {
  @scala.inline
  def apply(company_id: String): Anon_Companyid = {
    val __obj = js.Dynamic.literal(company_id = company_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Companyid]
  }
}

