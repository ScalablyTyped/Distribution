package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Companyid
  extends intercomDashClientLib.companyMod.CompanyIdentifier {
  var company_id: java.lang.String
}

object Anon_Companyid {
  @scala.inline
  def apply(company_id: java.lang.String): Anon_Companyid = {
    val __obj = js.Dynamic.literal(company_id = company_id)
  
    __obj.asInstanceOf[Anon_Companyid]
  }
}

