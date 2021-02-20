package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPoolsListResponse extends StObject {
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var resources: js.UndefOr[js.Array[SchemaPool]] = js.native
}
object SchemaPoolsListResponse {
  
  @scala.inline
  def apply(): SchemaPoolsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoolsListResponse]
  }
  
  @scala.inline
  implicit class SchemaPoolsListResponseMutableBuilder[Self <: SchemaPoolsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[SchemaPool]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: SchemaPool*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
