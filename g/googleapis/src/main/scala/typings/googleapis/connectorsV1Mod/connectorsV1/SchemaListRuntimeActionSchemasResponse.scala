package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRuntimeActionSchemasResponse extends StObject {
  
  /**
    * Next page token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Runtime action schemas.
    */
  var runtimeActionSchemas: js.UndefOr[js.Array[SchemaRuntimeActionSchema]] = js.undefined
}
object SchemaListRuntimeActionSchemasResponse {
  
  inline def apply(): SchemaListRuntimeActionSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRuntimeActionSchemasResponse]
  }
  
  extension [Self <: SchemaListRuntimeActionSchemasResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRuntimeActionSchemas(value: js.Array[SchemaRuntimeActionSchema]): Self = StObject.set(x, "runtimeActionSchemas", value.asInstanceOf[js.Any])
    
    inline def setRuntimeActionSchemasUndefined: Self = StObject.set(x, "runtimeActionSchemas", js.undefined)
    
    inline def setRuntimeActionSchemasVarargs(value: SchemaRuntimeActionSchema*): Self = StObject.set(x, "runtimeActionSchemas", js.Array(value*))
  }
}
