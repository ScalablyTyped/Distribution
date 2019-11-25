package typings.intercomDashClient.companyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.intercomDashClient.Anon_Id
  - typings.intercomDashClient.Anon_Companyid
*/
trait CompanyIdentifier extends js.Object

object CompanyIdentifier {
  @scala.inline
  def Anon_Id(id: String): CompanyIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CompanyIdentifier]
  }
  @scala.inline
  def Anon_Companyid(company_id: String): CompanyIdentifier = {
    val __obj = js.Dynamic.literal(company_id = company_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CompanyIdentifier]
  }
}

