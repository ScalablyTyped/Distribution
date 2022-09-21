package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ListDataItemsResponse extends StObject {
  
  /**
    * The list of data items to return.
    */
  var dataItems: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1DataItem]] = js.undefined
  
  /**
    * A token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ListDataItemsResponse {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ListDataItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ListDataItemsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ListDataItemsResponse](x: Self) {
    
    inline def setDataItems(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1DataItem]): Self = StObject.set(x, "dataItems", value.asInstanceOf[js.Any])
    
    inline def setDataItemsUndefined: Self = StObject.set(x, "dataItems", js.undefined)
    
    inline def setDataItemsVarargs(value: SchemaGoogleCloudDatalabelingV1beta1DataItem*): Self = StObject.set(x, "dataItems", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
