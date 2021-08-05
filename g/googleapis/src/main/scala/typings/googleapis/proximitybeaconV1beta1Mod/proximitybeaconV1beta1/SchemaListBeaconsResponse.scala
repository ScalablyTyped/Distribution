package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response that contains list beacon results and pagination help.
  */
trait SchemaListBeaconsResponse extends StObject {
  
  /**
    * The beacons that matched the search criteria.
    */
  var beacons: js.UndefOr[js.Array[SchemaBeacon]] = js.undefined
  
  /**
    * An opaque pagination token that the client may provide in their next
    * request to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Estimate of the total number of beacons matched by the query. Higher
    * values may be less accurate.
    */
  var totalCount: js.UndefOr[String] = js.undefined
}
object SchemaListBeaconsResponse {
  
  inline def apply(): SchemaListBeaconsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBeaconsResponse]
  }
  
  extension [Self <: SchemaListBeaconsResponse](x: Self) {
    
    inline def setBeacons(value: js.Array[SchemaBeacon]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
    
    inline def setBeaconsUndefined: Self = StObject.set(x, "beacons", js.undefined)
    
    inline def setBeaconsVarargs(value: SchemaBeacon*): Self = StObject.set(x, "beacons", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalCount(value: String): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
