package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementFiltersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID to retrieve filters for.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Filter ID to retrieve filters for.
    */
  var filterId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementFiltersGet {
  
  inline def apply(): ParamsResourceManagementFiltersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementFiltersGet]
  }
  
  extension [Self <: ParamsResourceManagementFiltersGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setFilterId(value: String): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
    
    inline def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
  }
}
