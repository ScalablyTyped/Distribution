package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response payload for a single Photo in batch operations including
  * BatchGetPhotos and BatchUpdatePhotos.
  */
@js.native
trait SchemaPhotoResponse extends StObject {
  
  /**
    * The Photo resource, if the request was successful.
    */
  var photo: js.UndefOr[SchemaPhoto] = js.native
  
  /**
    * The status for the operation to get or update a single photo in the batch
    * request.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}
object SchemaPhotoResponse {
  
  @scala.inline
  def apply(): SchemaPhotoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhotoResponse]
  }
  
  @scala.inline
  implicit class SchemaPhotoResponseMutableBuilder[Self <: SchemaPhotoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoto(value: SchemaPhoto): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
