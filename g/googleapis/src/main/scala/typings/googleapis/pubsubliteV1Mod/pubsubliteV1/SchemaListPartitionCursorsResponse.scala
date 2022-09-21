package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPartitionCursorsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The partition cursors from this request.
    */
  var partitionCursors: js.UndefOr[js.Array[SchemaPartitionCursor]] = js.undefined
}
object SchemaListPartitionCursorsResponse {
  
  inline def apply(): SchemaListPartitionCursorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPartitionCursorsResponse]
  }
  
  extension [Self <: SchemaListPartitionCursorsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPartitionCursors(value: js.Array[SchemaPartitionCursor]): Self = StObject.set(x, "partitionCursors", value.asInstanceOf[js.Any])
    
    inline def setPartitionCursorsUndefined: Self = StObject.set(x, "partitionCursors", js.undefined)
    
    inline def setPartitionCursorsVarargs(value: SchemaPartitionCursor*): Self = StObject.set(x, "partitionCursors", js.Array(value*))
  }
}
