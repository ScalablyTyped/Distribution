package typings.intercomClient.anon

import typings.intercomClient.companyMod.CompanyIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Companyid extends CompanyIdentifier {
  var company_id: String
}

object Companyid {
  @scala.inline
  def apply(company_id: String): Companyid = {
    val __obj = js.Dynamic.literal(company_id = company_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Companyid]
  }
}

