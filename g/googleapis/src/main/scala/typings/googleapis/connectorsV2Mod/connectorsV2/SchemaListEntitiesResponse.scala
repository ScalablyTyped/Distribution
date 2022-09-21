package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListEntitiesResponse extends StObject {
  
  /**
    * List containing entity rows.
    */
  var entities: js.UndefOr[js.Array[SchemaEntity]] = js.undefined
  
  /**
    * Next page token if more records are available.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListEntitiesResponse {
  
  inline def apply(): SchemaListEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListEntitiesResponse]
  }
  
  extension [Self <: SchemaListEntitiesResponse](x: Self) {
    
    inline def setEntities(value: js.Array[SchemaEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: SchemaEntity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
