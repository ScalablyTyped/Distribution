package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserPhoto extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Height of the photo in pixels.
    */
  var height: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The ID the API uses to uniquely identify the user.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the API resource. For Photo resources, this is `admin#directory#user#photo`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The MIME type of the photo. Allowed values are `JPEG`, `PNG`, `GIF`, `BMP`, `TIFF`, and web-safe base64 encoding.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user photo's upload data in [web-safe Base64](https://en.wikipedia.org/wiki/Base64#URL_applications) format in bytes. This means: * The slash (/) character is replaced with the underscore (_) character. * The plus sign (+) character is replaced with the hyphen (-) character. * The equals sign (=) character is replaced with the asterisk (*). * For padding, the period (.) character is used instead of the RFC-4648 baseURL definition which uses the equals sign (=) for padding. This is done to simplify URL-parsing. * Whatever the size of the photo being uploaded, the API downsizes it to 96x96 pixels.
    */
  var photoData: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's primary email address.
    */
  var primaryEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Width of the photo in pixels.
    */
  var width: js.UndefOr[Double | Null] = js.undefined
}
object SchemaUserPhoto {
  
  inline def apply(): SchemaUserPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserPhoto]
  }
  
  extension [Self <: SchemaUserPhoto](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setPhotoData(value: String): Self = StObject.set(x, "photoData", value.asInstanceOf[js.Any])
    
    inline def setPhotoDataNull: Self = StObject.set(x, "photoData", null)
    
    inline def setPhotoDataUndefined: Self = StObject.set(x, "photoData", js.undefined)
    
    inline def setPrimaryEmail(value: String): Self = StObject.set(x, "primaryEmail", value.asInstanceOf[js.Any])
    
    inline def setPrimaryEmailNull: Self = StObject.set(x, "primaryEmail", null)
    
    inline def setPrimaryEmailUndefined: Self = StObject.set(x, "primaryEmail", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
