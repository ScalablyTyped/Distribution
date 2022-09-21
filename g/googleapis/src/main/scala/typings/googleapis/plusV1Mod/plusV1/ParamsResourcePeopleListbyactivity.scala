package typings.googleapis.plusV1Mod.plusV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePeopleListbyactivity
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the activity to get the list of people for.
    */
  var activityId: js.UndefOr[String] = js.undefined
  
  /**
    * The collection of people to list.
    */
  var collection: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of people to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourcePeopleListbyactivity {
  
  inline def apply(): ParamsResourcePeopleListbyactivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleListbyactivity]
  }
  
  extension [Self <: ParamsResourcePeopleListbyactivity](x: Self) {
    
    inline def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
    
    inline def setActivityIdUndefined: Self = StObject.set(x, "activityId", js.undefined)
    
    inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
