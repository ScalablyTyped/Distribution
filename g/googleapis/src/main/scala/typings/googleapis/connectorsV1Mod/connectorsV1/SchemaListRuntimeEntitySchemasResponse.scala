package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRuntimeEntitySchemasResponse extends StObject {
  
  /**
    * Next page token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Runtime entity schemas.
    */
  var runtimeEntitySchemas: js.UndefOr[js.Array[SchemaRuntimeEntitySchema]] = js.undefined
}
object SchemaListRuntimeEntitySchemasResponse {
  
  inline def apply(): SchemaListRuntimeEntitySchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRuntimeEntitySchemasResponse]
  }
  
  extension [Self <: SchemaListRuntimeEntitySchemasResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRuntimeEntitySchemas(value: js.Array[SchemaRuntimeEntitySchema]): Self = StObject.set(x, "runtimeEntitySchemas", value.asInstanceOf[js.Any])
    
    inline def setRuntimeEntitySchemasUndefined: Self = StObject.set(x, "runtimeEntitySchemas", js.undefined)
    
    inline def setRuntimeEntitySchemasVarargs(value: SchemaRuntimeEntitySchema*): Self = StObject.set(x, "runtimeEntitySchemas", js.Array(value*))
  }
}
