package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSchemasResponse extends StObject {
  
  /**
    * If not empty, indicates that there may be more schemas that match the request; this value should be passed in a new `ListSchemasRequest`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resulting schemas.
    */
  var schemas: js.UndefOr[js.Array[SchemaSchema]] = js.undefined
}
object SchemaListSchemasResponse {
  
  inline def apply(): SchemaListSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSchemasResponse]
  }
  
  extension [Self <: SchemaListSchemasResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSchemas(value: js.Array[SchemaSchema]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: SchemaSchema*): Self = StObject.set(x, "schemas", js.Array(value*))
  }
}
