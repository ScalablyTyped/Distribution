package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the search query.
  */
trait SchemaSearchTenancyUnitsResponse extends StObject {
  
  /**
    * Pagination token for large results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Tenancy Units matching the request.
    */
  var tenancyUnits: js.UndefOr[js.Array[SchemaTenancyUnit]] = js.undefined
}
object SchemaSearchTenancyUnitsResponse {
  
  inline def apply(): SchemaSearchTenancyUnitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchTenancyUnitsResponse]
  }
  
  extension [Self <: SchemaSearchTenancyUnitsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTenancyUnits(value: js.Array[SchemaTenancyUnit]): Self = StObject.set(x, "tenancyUnits", value.asInstanceOf[js.Any])
    
    inline def setTenancyUnitsUndefined: Self = StObject.set(x, "tenancyUnits", js.undefined)
    
    inline def setTenancyUnitsVarargs(value: SchemaTenancyUnit*): Self = StObject.set(x, "tenancyUnits", js.Array(value :_*))
  }
}
