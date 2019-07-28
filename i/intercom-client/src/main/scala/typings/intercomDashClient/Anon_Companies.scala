package typings.intercomDashClient

import typings.intercomDashClient.companyMod.Company
import typings.intercomDashClient.intercomDashClientStrings.companyDOTlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Companies extends js.Object {
  var companies: js.Array[Company]
  var `type`: companyDOTlist
}

object Anon_Companies {
  @scala.inline
  def apply(companies: js.Array[Company], `type`: companyDOTlist): Anon_Companies = {
    val __obj = js.Dynamic.literal(companies = companies)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Companies]
  }
}

