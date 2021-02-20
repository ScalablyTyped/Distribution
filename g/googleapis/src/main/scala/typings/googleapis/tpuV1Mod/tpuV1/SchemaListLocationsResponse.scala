package typings.googleapis.tpuV1Mod.tpuV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for Locations.ListLocations.
  */
@js.native
trait SchemaListLocationsResponse extends StObject {
  
  /**
    * A list of locations that matches the specified filter in the request.
    */
  var locations: js.UndefOr[js.Array[SchemaLocation]] = js.native
  
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
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
