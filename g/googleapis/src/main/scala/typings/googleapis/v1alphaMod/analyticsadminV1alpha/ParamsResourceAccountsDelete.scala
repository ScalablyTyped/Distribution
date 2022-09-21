package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the Account to soft-delete. Format: accounts/{account\} Example: "accounts/100"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsDelete {
  
  inline def apply(): ParamsResourceAccountsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsDelete]
  }
  
  extension [Self <: ParamsResourceAccountsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
