package typings
package intercomDashClientLib.companyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompanyIdentifier extends js.Object {
  var company_id: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object CompanyIdentifier {
  @scala.inline
  def apply(company_id: java.lang.String = null, id: java.lang.String = null): CompanyIdentifier = {
    val __obj = js.Dynamic.literal()
    if (company_id != null) __obj.updateDynamic("company_id")(company_id)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[CompanyIdentifier]
  }
}

