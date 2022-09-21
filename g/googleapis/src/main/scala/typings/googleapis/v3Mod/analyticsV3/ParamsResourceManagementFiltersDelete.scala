package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementFiltersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID to delete the filter for.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the filter to be deleted.
    */
  var filterId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementFiltersDelete {
  
  inline def apply(): ParamsResourceManagementFiltersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementFiltersDelete]
  }
  
  extension [Self <: ParamsResourceManagementFiltersDelete](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setFilterId(value: String): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
    
    inline def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
  }
}
