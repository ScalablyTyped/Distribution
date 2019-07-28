package typings.intercomDashClient.companyMod

import typings.intercomDashClient.Anon_Next
import typings.intercomDashClient.intercomDashClientStrings.companyDOTlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var companies: js.Array[Company with CompanyIdentifier]
  var pages: Anon_Next
  var total_count: Double
  var `type`: companyDOTlist
}

object List {
  @scala.inline
  def apply(
    companies: js.Array[Company with CompanyIdentifier],
    pages: Anon_Next,
    total_count: Double,
    `type`: companyDOTlist
  ): List = {
    val __obj = js.Dynamic.literal(companies = companies, pages = pages, total_count = total_count)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[List]
  }
}

