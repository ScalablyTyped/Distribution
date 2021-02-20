package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response that contains list beacon results and pagination help.
  */
@js.native
trait SchemaListBeaconsResponse extends StObject {
  
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
  implicit class SchemaListBeaconsResponseMutableBuilder[Self <: SchemaListBeaconsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeacons(value: js.Array[SchemaBeacon]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconsUndefined: Self = StObject.set(x, "beacons", js.undefined)
    
    @scala.inline
    def setBeaconsVarargs(value: SchemaBeacon*): Self = StObject.set(x, "beacons", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalCount(value: String): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
