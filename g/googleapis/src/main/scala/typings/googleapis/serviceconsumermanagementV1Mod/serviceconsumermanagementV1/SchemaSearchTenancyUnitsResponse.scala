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
  
  @scala.inline
  def apply(): SchemaSearchTenancyUnitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchTenancyUnitsResponse]
  }
  
  @scala.inline
  implicit class SchemaSearchTenancyUnitsResponseMutableBuilder[Self <: SchemaSearchTenancyUnitsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTenancyUnits(value: js.Array[SchemaTenancyUnit]): Self = StObject.set(x, "tenancyUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenancyUnitsUndefined: Self = StObject.set(x, "tenancyUnits", js.undefined)
    
    @scala.inline
    def setTenancyUnitsVarargs(value: SchemaTenancyUnit*): Self = StObject.set(x, "tenancyUnits", js.Array(value :_*))
  }
}
