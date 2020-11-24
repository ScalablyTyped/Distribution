package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ListLocationsResponse returns the list of all GKE locations and their
  * recommendation state.
  */
@js.native
trait SchemaListLocationsResponse extends js.Object {
  
  /**
    * A full list of GKE locations.
    */
  var locations: js.UndefOr[js.Array[SchemaLocation]] = js.native
  
  /**
    * Only return ListLocationsResponse that occur after the page_token. This
    * value should be populated from the ListLocationsResponse.next_page_token
    * if that response token was set (which happens when listing more Locations
    * than fit in a single ListLocationsResponse).
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
  implicit class SchemaListLocationsResponseOps[Self <: SchemaListLocationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocationsVarargs(value: SchemaLocation*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[SchemaLocation]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
