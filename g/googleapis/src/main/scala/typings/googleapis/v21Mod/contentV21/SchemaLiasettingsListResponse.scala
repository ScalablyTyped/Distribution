package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiasettingsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#liasettingsListResponse`".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The token for the retrieval of the next page of LIA settings.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  var resources: js.UndefOr[js.Array[SchemaLiaSettings]] = js.undefined
}
object SchemaLiasettingsListResponse {
  
  inline def apply(): SchemaLiasettingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsListResponse]
  }
  
  extension [Self <: SchemaLiasettingsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResources(value: js.Array[SchemaLiaSettings]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaLiaSettings*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
