package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListGrpcRoutesResponse extends StObject {
  
  /**
    * List of GrpcRoute resources.
    */
  var grpcRoutes: js.UndefOr[js.Array[SchemaGrpcRoute]] = js.undefined
  
  /**
    * If there might be more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListGrpcRoutesResponse {
  
  inline def apply(): SchemaListGrpcRoutesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGrpcRoutesResponse]
  }
  
  extension [Self <: SchemaListGrpcRoutesResponse](x: Self) {
    
    inline def setGrpcRoutes(value: js.Array[SchemaGrpcRoute]): Self = StObject.set(x, "grpcRoutes", value.asInstanceOf[js.Any])
    
    inline def setGrpcRoutesUndefined: Self = StObject.set(x, "grpcRoutes", js.undefined)
    
    inline def setGrpcRoutesVarargs(value: SchemaGrpcRoute*): Self = StObject.set(x, "grpcRoutes", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
