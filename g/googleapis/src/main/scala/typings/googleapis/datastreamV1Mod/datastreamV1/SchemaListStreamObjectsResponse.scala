package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListStreamObjectsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of stream objects.
    */
  var streamObjects: js.UndefOr[js.Array[SchemaStreamObject]] = js.undefined
}
object SchemaListStreamObjectsResponse {
  
  inline def apply(): SchemaListStreamObjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListStreamObjectsResponse]
  }
  
  extension [Self <: SchemaListStreamObjectsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setStreamObjects(value: js.Array[SchemaStreamObject]): Self = StObject.set(x, "streamObjects", value.asInstanceOf[js.Any])
    
    inline def setStreamObjectsUndefined: Self = StObject.set(x, "streamObjects", js.undefined)
    
    inline def setStreamObjectsVarargs(value: SchemaStreamObject*): Self = StObject.set(x, "streamObjects", js.Array(value*))
  }
}
