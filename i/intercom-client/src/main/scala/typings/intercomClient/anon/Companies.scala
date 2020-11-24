package typings.intercomClient.anon

import typings.intercomClient.companyMod.Company
import typings.intercomClient.intercomClientStrings.companyDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Companies extends js.Object {
  
  var companies: js.Array[Company] = js.native
  
  var `type`: companyDotlist = js.native
}
object Companies {
  
  @scala.inline
  def apply(companies: js.Array[Company], `type`: companyDotlist): Companies = {
    val __obj = js.Dynamic.literal(companies = companies.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Companies]
  }
  
  @scala.inline
  implicit class CompaniesOps[Self <: Companies] (val x: Self) extends AnyVal {
    
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
    def setCompaniesVarargs(value: Company*): Self = this.set("companies", js.Array(value :_*))
    
    @scala.inline
    def setCompanies(value: js.Array[Company]): Self = this.set("companies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: companyDotlist): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
