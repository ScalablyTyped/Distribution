package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the list request.
  */
trait SchemaListTenancyUnitsResponse extends StObject {
  
  /**
    * Pagination token for large results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Tenancy units matching the request.
    */
  var tenancyUnits: js.UndefOr[js.Array[SchemaTenancyUnit]] = js.undefined
}
object SchemaListTenancyUnitsResponse {
  
  inline def apply(): SchemaListTenancyUnitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTenancyUnitsResponse]
  }
  
  extension [Self <: SchemaListTenancyUnitsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTenancyUnits(value: js.Array[SchemaTenancyUnit]): Self = StObject.set(x, "tenancyUnits", value.asInstanceOf[js.Any])
    
    inline def setTenancyUnitsUndefined: Self = StObject.set(x, "tenancyUnits", js.undefined)
    
    inline def setTenancyUnitsVarargs(value: SchemaTenancyUnit*): Self = StObject.set(x, "tenancyUnits", js.Array(value :_*))
  }
}
