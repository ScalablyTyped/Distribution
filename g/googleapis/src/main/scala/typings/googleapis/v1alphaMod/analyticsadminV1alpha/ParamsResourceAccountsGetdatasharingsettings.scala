package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsGetdatasharingsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the settings to lookup. Format: accounts/{account\}/dataSharingSettings Example: "accounts/1000/dataSharingSettings"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsGetdatasharingsettings {
  
  inline def apply(): ParamsResourceAccountsGetdatasharingsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsGetdatasharingsettings]
  }
  
  extension [Self <: ParamsResourceAccountsGetdatasharingsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
