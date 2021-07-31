package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupLicensesListResponse extends StObject {
  
  /** A group license for a product approved for use in the enterprise. */
  var groupLicense: js.UndefOr[js.Array[GroupLicense]] = js.undefined
}
object GroupLicensesListResponse {
  
  @scala.inline
  def apply(): GroupLicensesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLicensesListResponse]
  }
  
  @scala.inline
  implicit class GroupLicensesListResponseMutableBuilder[Self <: GroupLicensesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupLicense(value: js.Array[GroupLicense]): Self = StObject.set(x, "groupLicense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupLicenseUndefined: Self = StObject.set(x, "groupLicense", js.undefined)
    
    @scala.inline
    def setGroupLicenseVarargs(value: GroupLicense*): Self = StObject.set(x, "groupLicense", js.Array(value :_*))
  }
}
