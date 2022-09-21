package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAssignedLocationsResponse extends StObject {
  
  /**
    * The list of assigned locations. This list will be absent if empty.
    */
  var assignedLocations: js.UndefOr[js.Array[SchemaAssignedLocation]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListAssignedLocations` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAssignedLocationsResponse {
  
  inline def apply(): SchemaListAssignedLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAssignedLocationsResponse]
  }
  
  extension [Self <: SchemaListAssignedLocationsResponse](x: Self) {
    
    inline def setAssignedLocations(value: js.Array[SchemaAssignedLocation]): Self = StObject.set(x, "assignedLocations", value.asInstanceOf[js.Any])
    
    inline def setAssignedLocationsUndefined: Self = StObject.set(x, "assignedLocations", js.undefined)
    
    inline def setAssignedLocationsVarargs(value: SchemaAssignedLocation*): Self = StObject.set(x, "assignedLocations", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
