package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterprisesListResponse extends StObject {
  
  /** An enterprise. */
  var enterprise: js.UndefOr[js.Array[Enterprise]] = js.undefined
}
object EnterprisesListResponse {
  
  inline def apply(): EnterprisesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterprisesListResponse]
  }
  
  extension [Self <: EnterprisesListResponse](x: Self) {
    
    inline def setEnterprise(value: js.Array[Enterprise]): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setEnterpriseVarargs(value: Enterprise*): Self = StObject.set(x, "enterprise", js.Array(value :_*))
  }
}
