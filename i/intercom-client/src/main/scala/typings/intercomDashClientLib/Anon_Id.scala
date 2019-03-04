package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id
  extends intercomDashClientLib.companyMod.CompanyIdentifier
     with intercomDashClientLib.leadMod.LeadIdentifier
     with intercomDashClientLib.userMod.UserIdentifier {
  var id: java.lang.String
}

object Anon_Id {
  @scala.inline
  def apply(id: java.lang.String): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[Anon_Id]
  }
}

