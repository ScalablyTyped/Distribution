package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ListPartitionsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no remaining results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Partitions under the specified parent entity.
    */
  var partitions: js.UndefOr[js.Array[SchemaGoogleCloudDataplexV1Partition]] = js.undefined
}
object SchemaGoogleCloudDataplexV1ListPartitionsResponse {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ListPartitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ListPartitionsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ListPartitionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPartitions(value: js.Array[SchemaGoogleCloudDataplexV1Partition]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsUndefined: Self = StObject.set(x, "partitions", js.undefined)
    
    inline def setPartitionsVarargs(value: SchemaGoogleCloudDataplexV1Partition*): Self = StObject.set(x, "partitions", js.Array(value*))
  }
}
