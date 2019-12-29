package typings.intercomDashClient

import typings.intercomDashClient.companyMod.Company
import typings.intercomDashClient.intercomDashClientStrings.companyDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Companies extends js.Object {
  var companies: js.Array[Company]
  var `type`: companyDotlist
}

object Anon_Companies {
  @scala.inline
  def apply(companies: js.Array[Company], `type`: companyDotlist): Anon_Companies = {
    val __obj = js.Dynamic.literal(companies = companies.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Companies]
  }
}

