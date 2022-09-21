package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatafeedsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#datafeedsListResponse`".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The token for the retrieval of the next page of datafeeds.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  var resources: js.UndefOr[js.Array[SchemaDatafeed]] = js.undefined
}
object SchemaDatafeedsListResponse {
  
  inline def apply(): SchemaDatafeedsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedsListResponse]
  }
  
  extension [Self <: SchemaDatafeedsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResources(value: js.Array[SchemaDatafeed]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaDatafeed*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
