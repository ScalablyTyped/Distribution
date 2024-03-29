package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSavedAdStyles extends StObject {
  
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The saved ad styles returned in this list response.
    */
  var items: js.UndefOr[js.Array[SchemaSavedAdStyle]] = js.undefined
  
  /**
    * Kind of list this is, in this case adsense#savedAdStyles.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Continuation token used to page through ad units. To retrieve the next page of results, set the next request's "pageToken" value to this.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaSavedAdStyles {
  
  inline def apply(): SchemaSavedAdStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedAdStyles]
  }
  
  extension [Self <: SchemaSavedAdStyles](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaSavedAdStyle]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaSavedAdStyle*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
