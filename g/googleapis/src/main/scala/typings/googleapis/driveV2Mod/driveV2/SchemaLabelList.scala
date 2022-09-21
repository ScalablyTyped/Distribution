package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLabelList extends StObject {
  
  /**
    * The list of labels.
    */
  var items: js.UndefOr[js.Array[SchemaLabel]] = js.undefined
  
  /**
    * This is always drive#labelList
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The page token for the next page of labels. This field will be absent if the end of the list has been reached. If the token is rejected for any reason, it should be discarded, and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaLabelList {
  
  inline def apply(): SchemaLabelList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLabelList]
  }
  
  extension [Self <: SchemaLabelList](x: Self) {
    
    inline def setItems(value: js.Array[SchemaLabel]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaLabel*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
