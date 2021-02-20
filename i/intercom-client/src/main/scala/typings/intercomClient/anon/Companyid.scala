package typings.intercomClient.anon

import typings.intercomClient.companyMod.CompanyIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Companyid extends CompanyIdentifier {
  
  var company_id: String = js.native
}
object Companyid {
  
  @scala.inline
  def apply(company_id: String): Companyid = {
    val __obj = js.Dynamic.literal(company_id = company_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Companyid]
  }
  
  @scala.inline
  implicit class CompanyidMutableBuilder[Self <: Companyid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompany_id(value: String): Self = StObject.set(x, "company_id", value.asInstanceOf[js.Any])
  }
}
