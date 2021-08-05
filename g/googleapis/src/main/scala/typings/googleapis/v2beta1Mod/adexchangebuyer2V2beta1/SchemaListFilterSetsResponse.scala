package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing filter sets.
  */
trait SchemaListFilterSetsResponse extends StObject {
  
  /**
    * The filter sets belonging to the buyer.
    */
  var filterSets: js.UndefOr[js.Array[SchemaFilterSet]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListFilterSetsRequest.pageToken field in the subsequent call to the
    * accounts.filterSets.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListFilterSetsResponse {
  
  inline def apply(): SchemaListFilterSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFilterSetsResponse]
  }
  
  extension [Self <: SchemaListFilterSetsResponse](x: Self) {
    
    inline def setFilterSets(value: js.Array[SchemaFilterSet]): Self = StObject.set(x, "filterSets", value.asInstanceOf[js.Any])
    
    inline def setFilterSetsUndefined: Self = StObject.set(x, "filterSets", js.undefined)
    
    inline def setFilterSetsVarargs(value: SchemaFilterSet*): Self = StObject.set(x, "filterSets", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
