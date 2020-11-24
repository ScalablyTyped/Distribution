package typings.intercomClient.companyMod

import typings.intercomClient.anon.Next
import typings.intercomClient.intercomClientStrings.companyDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends js.Object {
  
  var companies: js.Array[Company with CompanyIdentifier] = js.native
  
  var pages: Next = js.native
  
  var total_count: Double = js.native
  
  var `type`: companyDotlist = js.native
}
object List {
  
  @scala.inline
  def apply(
    companies: js.Array[Company with CompanyIdentifier],
    pages: Next,
    total_count: Double,
    `type`: companyDotlist
  ): List = {
    val __obj = js.Dynamic.literal(companies = companies.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
  
  @scala.inline
  implicit class ListOps[Self <: List] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompaniesVarargs(value: (Company with CompanyIdentifier)*): Self = this.set("companies", js.Array(value :_*))
    
    @scala.inline
    def setCompanies(value: js.Array[Company with CompanyIdentifier]): Self = this.set("companies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: Next): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: companyDotlist): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
