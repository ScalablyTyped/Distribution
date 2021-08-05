package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplicasListResponse extends StObject {
  
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var resources: js.UndefOr[js.Array[SchemaReplica]] = js.undefined
}
object SchemaReplicasListResponse {
  
  inline def apply(): SchemaReplicasListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplicasListResponse]
  }
  
  extension [Self <: SchemaReplicasListResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResources(value: js.Array[SchemaReplica]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaReplica*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
