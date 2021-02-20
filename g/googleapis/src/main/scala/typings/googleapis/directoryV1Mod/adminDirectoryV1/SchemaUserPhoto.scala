package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Photo object in Directory API.
  */
@js.native
trait SchemaUserPhoto extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Height in pixels of the photo
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Unique identifier of User (Read-only)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Mime Type of the photo
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * Base64 encoded photo data
    */
  var photoData: js.UndefOr[String] = js.native
  
  /**
    * Primary email of User (Read-only)
    */
  var primaryEmail: js.UndefOr[String] = js.native
  
  /**
    * Width in pixels of the photo
    */
  var width: js.UndefOr[Double] = js.native
}
object SchemaUserPhoto {
  
  @scala.inline
  def apply(): SchemaUserPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserPhoto]
  }
  
  @scala.inline
  implicit class SchemaUserPhotoMutableBuilder[Self <: SchemaUserPhoto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setPhotoData(value: String): Self = StObject.set(x, "photoData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoDataUndefined: Self = StObject.set(x, "photoData", js.undefined)
    
    @scala.inline
    def setPrimaryEmail(value: String): Self = StObject.set(x, "primaryEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryEmailUndefined: Self = StObject.set(x, "primaryEmail", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
