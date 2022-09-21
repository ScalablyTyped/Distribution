package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListMeshesResponse extends StObject {
  
  /**
    * List of Mesh resources.
    */
  var meshes: js.UndefOr[js.Array[SchemaMesh]] = js.undefined
  
  /**
    * If there might be more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListMeshesResponse {
  
  inline def apply(): SchemaListMeshesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMeshesResponse]
  }
  
  extension [Self <: SchemaListMeshesResponse](x: Self) {
    
    inline def setMeshes(value: js.Array[SchemaMesh]): Self = StObject.set(x, "meshes", value.asInstanceOf[js.Any])
    
    inline def setMeshesUndefined: Self = StObject.set(x, "meshes", js.undefined)
    
    inline def setMeshesVarargs(value: SchemaMesh*): Self = StObject.set(x, "meshes", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
