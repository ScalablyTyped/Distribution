package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response that contains list beacon results and pagination help.
  */
@js.native
trait SchemaListBeaconsResponse extends js.Object {
  
  /**
    * The beacons that matched the search criteria.
    */
  var beacons: js.UndefOr[js.Array[SchemaBeacon]] = js.native
  
  /**
    * An opaque pagination token that the client may provide in their next
    * request to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Estimate of the total number of beacons matched by the query. Higher
    * values may be less accurate.
    */
  var totalCount: js.UndefOr[String] = js.native
}
object SchemaListBeaconsResponse {
  
  @scala.inline
  def apply(): SchemaListBeaconsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBeaconsResponse]
  }
  
  @scala.inline
  implicit class SchemaListBeaconsResponseOps[Self <: SchemaListBeaconsResponse] (val x: Self) extends AnyVal {
    
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
    def setBeaconsVarargs(value: SchemaBeacon*): Self = this.set("beacons", js.Array(value :_*))
    
    @scala.inline
    def setBeacons(value: js.Array[SchemaBeacon]): Self = this.set("beacons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeacons: Self = this.set("beacons", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalCount(value: String): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
  }
}
