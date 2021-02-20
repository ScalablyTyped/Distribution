package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to update the metadata of photos. Updating the pixels of photos is
  * not supported.
  */
@js.native
trait SchemaBatchUpdatePhotosRequest extends StObject {
  
  /**
    * Required. List of UpdatePhotoRequests.
    */
  var updatePhotoRequests: js.UndefOr[js.Array[SchemaUpdatePhotoRequest]] = js.native
}
object SchemaBatchUpdatePhotosRequest {
  
  @scala.inline
  def apply(): SchemaBatchUpdatePhotosRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdatePhotosRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchUpdatePhotosRequestMutableBuilder[Self <: SchemaBatchUpdatePhotosRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdatePhotoRequests(value: js.Array[SchemaUpdatePhotoRequest]): Self = StObject.set(x, "updatePhotoRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatePhotoRequestsUndefined: Self = StObject.set(x, "updatePhotoRequests", js.undefined)
    
    @scala.inline
    def setUpdatePhotoRequestsVarargs(value: SchemaUpdatePhotoRequest*): Self = StObject.set(x, "updatePhotoRequests", js.Array(value :_*))
  }
}
