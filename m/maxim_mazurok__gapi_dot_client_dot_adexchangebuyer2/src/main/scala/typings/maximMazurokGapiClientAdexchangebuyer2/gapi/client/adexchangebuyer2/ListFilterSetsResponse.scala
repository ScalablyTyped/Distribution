package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFilterSetsResponse extends StObject {
  
  /** The filter sets belonging to the buyer. */
  var filterSets: js.UndefOr[js.Array[FilterSet]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListFilterSetsRequest.pageToken field in the subsequent call to the accounts.filterSets.list method to retrieve
    * the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListFilterSetsResponse {
  
  inline def apply(): ListFilterSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFilterSetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFilterSetsResponse] (val x: Self) extends AnyVal {
    
    inline def setFilterSets(value: js.Array[FilterSet]): Self = StObject.set(x, "filterSets", value.asInstanceOf[js.Any])
    
    inline def setFilterSetsUndefined: Self = StObject.set(x, "filterSets", js.undefined)
    
    inline def setFilterSetsVarargs(value: FilterSet*): Self = StObject.set(x, "filterSets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
