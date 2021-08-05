package typings.googleapis.youtubeAnalyticsV1Mod.youtubeAnalyticsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A paginated list of grouList resources returned in response to a
  * youtubeAnalytics.groupApi.list request.
  */
trait SchemaGroupItemListResponse extends StObject {
  
  var etag: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[SchemaGroupItem]] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaGroupItemListResponse {
  
  inline def apply(): SchemaGroupItemListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupItemListResponse]
  }
  
  extension [Self <: SchemaGroupItemListResponse](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaGroupItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaGroupItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
