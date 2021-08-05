package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Photo object in Directory API.
  */
trait SchemaUserPhoto extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Height in pixels of the photo
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Unique identifier of User (Read-only)
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Mime Type of the photo
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * Base64 encoded photo data
    */
  var photoData: js.UndefOr[String] = js.undefined
  
  /**
    * Primary email of User (Read-only)
    */
  var primaryEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Width in pixels of the photo
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SchemaUserPhoto {
  
  inline def apply(): SchemaUserPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserPhoto]
  }
  
  extension [Self <: SchemaUserPhoto](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setPhotoData(value: String): Self = StObject.set(x, "photoData", value.asInstanceOf[js.Any])
    
    inline def setPhotoDataUndefined: Self = StObject.set(x, "photoData", js.undefined)
    
    inline def setPrimaryEmail(value: String): Self = StObject.set(x, "primaryEmail", value.asInstanceOf[js.Any])
    
    inline def setPrimaryEmailUndefined: Self = StObject.set(x, "primaryEmail", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
