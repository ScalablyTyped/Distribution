package typings.intercomClient

import typings.intercomClient.companyMod.Company
import typings.intercomClient.intercomClientStrings.companyDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompanies extends js.Object {
  var companies: js.Array[Company]
  var `type`: companyDotlist
}

object AnonCompanies {
  @scala.inline
  def apply(companies: js.Array[Company], `type`: companyDotlist): AnonCompanies = {
    val __obj = js.Dynamic.literal(companies = companies.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompanies]
  }
}

