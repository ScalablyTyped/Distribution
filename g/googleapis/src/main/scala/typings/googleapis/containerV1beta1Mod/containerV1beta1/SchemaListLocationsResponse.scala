package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ListLocationsResponse returns the list of all GKE locations and their
  * recommendation state.
  */
trait SchemaListLocationsResponse extends StObject {
  
  /**
    * A full list of GKE locations.
    */
  var locations: js.UndefOr[js.Array[SchemaLocation]] = js.undefined
  
  /**
    * Only return ListLocationsResponse that occur after the page_token. This
    * value should be populated from the ListLocationsResponse.next_page_token
    * if that response token was set (which happens when listing more Locations
    * than fit in a single ListLocationsResponse).
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListLocationsResponse {
  
  @scala.inline
  def apply(): SchemaListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLocationsResponse]
  }
  
  @scala.inline
  implicit class SchemaListLocationsResponseMutableBuilder[Self <: SchemaListLocationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: js.Array[SchemaLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: SchemaLocation*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
