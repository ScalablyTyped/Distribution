package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Companies extends js.Object {
  var companies: js.Array[intercomDashClientLib.companyMod.Company]
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.companyDOTlist
}

object Anon_Companies {
  @scala.inline
  def apply(
    companies: js.Array[intercomDashClientLib.companyMod.Company],
    `type`: intercomDashClientLib.intercomDashClientLibStrings.companyDOTlist
  ): Anon_Companies = {
    val __obj = js.Dynamic.literal(companies = companies)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Companies]
  }
}

