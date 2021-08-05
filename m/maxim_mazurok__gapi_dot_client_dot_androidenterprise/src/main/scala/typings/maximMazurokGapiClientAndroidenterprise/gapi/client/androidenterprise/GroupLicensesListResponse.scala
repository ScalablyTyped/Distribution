package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupLicensesListResponse extends StObject {
  
  /** A group license for a product approved for use in the enterprise. */
  var groupLicense: js.UndefOr[js.Array[GroupLicense]] = js.undefined
}
object GroupLicensesListResponse {
  
  inline def apply(): GroupLicensesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLicensesListResponse]
  }
  
  extension [Self <: GroupLicensesListResponse](x: Self) {
    
    inline def setGroupLicense(value: js.Array[GroupLicense]): Self = StObject.set(x, "groupLicense", value.asInstanceOf[js.Any])
    
    inline def setGroupLicenseUndefined: Self = StObject.set(x, "groupLicense", js.undefined)
    
    inline def setGroupLicenseVarargs(value: GroupLicense*): Self = StObject.set(x, "groupLicense", js.Array(value :_*))
  }
}
