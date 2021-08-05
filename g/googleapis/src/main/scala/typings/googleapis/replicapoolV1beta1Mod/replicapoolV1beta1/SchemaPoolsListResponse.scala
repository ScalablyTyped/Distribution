package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPoolsListResponse extends StObject {
  
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var resources: js.UndefOr[js.Array[SchemaPool]] = js.undefined
}
object SchemaPoolsListResponse {
  
  inline def apply(): SchemaPoolsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoolsListResponse]
  }
  
  extension [Self <: SchemaPoolsListResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResources(value: js.Array[SchemaPool]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaPool*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
