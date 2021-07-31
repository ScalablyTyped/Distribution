package typings.intercomClient.anon

import typings.intercomClient.companyMod.Company
import typings.intercomClient.intercomClientStrings.companyDotlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Companies extends StObject {
  
  var companies: js.Array[Company]
  
  var `type`: companyDotlist
}
object Companies {
  
  @scala.inline
  def apply(companies: js.Array[Company]): Companies = {
    val __obj = js.Dynamic.literal(companies = companies.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("company.list")
    __obj.asInstanceOf[Companies]
  }
  
  @scala.inline
  implicit class CompaniesMutableBuilder[Self <: Companies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanies(value: js.Array[Company]): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompaniesVarargs(value: Company*): Self = StObject.set(x, "companies", js.Array(value :_*))
    
    @scala.inline
    def setType(value: companyDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
