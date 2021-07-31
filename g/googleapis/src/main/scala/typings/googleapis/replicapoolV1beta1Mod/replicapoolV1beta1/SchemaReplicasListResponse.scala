package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplicasListResponse extends StObject {
  
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var resources: js.UndefOr[js.Array[SchemaReplica]] = js.undefined
}
object SchemaReplicasListResponse {
  
  @scala.inline
  def apply(): SchemaReplicasListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplicasListResponse]
  }
  
  @scala.inline
  implicit class SchemaReplicasListResponseMutableBuilder[Self <: SchemaReplicasListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[SchemaReplica]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: SchemaReplica*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
