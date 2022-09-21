package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatafeedstatusesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "content#datafeedstatusesListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The token for the retrieval of the next page of datafeed statuses.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  var resources: js.UndefOr[js.Array[SchemaDatafeedStatus]] = js.undefined
}
object SchemaDatafeedstatusesListResponse {
  
  inline def apply(): SchemaDatafeedstatusesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedstatusesListResponse]
  }
  
  extension [Self <: SchemaDatafeedstatusesListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResources(value: js.Array[SchemaDatafeedStatus]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaDatafeedStatus*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
