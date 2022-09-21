package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ListZonesResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Zones under the given parent lake.
    */
  var zones: js.UndefOr[js.Array[SchemaGoogleCloudDataplexV1Zone]] = js.undefined
}
object SchemaGoogleCloudDataplexV1ListZonesResponse {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ListZonesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ListZonesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ListZonesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setZones(value: js.Array[SchemaGoogleCloudDataplexV1Zone]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    inline def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    inline def setZonesVarargs(value: SchemaGoogleCloudDataplexV1Zone*): Self = StObject.set(x, "zones", js.Array(value*))
  }
}
