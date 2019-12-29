package typings.intercomDashClient.companyMod

import typings.intercomDashClient.Anon_Next
import typings.intercomDashClient.intercomDashClientStrings.companyDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var companies: js.Array[Company with CompanyIdentifier]
  var pages: Anon_Next
  var total_count: Double
  var `type`: companyDotlist
}

object List {
  @scala.inline
  def apply(
    companies: js.Array[Company with CompanyIdentifier],
    pages: Anon_Next,
    total_count: Double,
    `type`: companyDotlist
  ): List = {
    val __obj = js.Dynamic.literal(companies = companies.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

