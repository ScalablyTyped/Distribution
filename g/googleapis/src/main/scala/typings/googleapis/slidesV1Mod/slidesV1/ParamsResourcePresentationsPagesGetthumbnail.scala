package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePresentationsPagesGetthumbnail
  extends StObject
     with StandardParameters {
  
  /**
    * The object ID of the page whose thumbnail to retrieve.
    */
  var pageObjectId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the presentation to retrieve.
    */
  var presentationId: js.UndefOr[String] = js.undefined
  
  /**
    * The optional mime type of the thumbnail image. If you don't specify the mime type, the mime type defaults to PNG.
    */
  @JSName("thumbnailProperties.mimeType")
  var thumbnailPropertiesDotmimeType: js.UndefOr[String] = js.undefined
  
  /**
    * The optional thumbnail image size. If you don't specify the size, the server chooses a default size of the image.
    */
  @JSName("thumbnailProperties.thumbnailSize")
  var thumbnailPropertiesDotthumbnailSize: js.UndefOr[String] = js.undefined
}
object ParamsResourcePresentationsPagesGetthumbnail {
  
  inline def apply(): ParamsResourcePresentationsPagesGetthumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePresentationsPagesGetthumbnail]
  }
  
  extension [Self <: ParamsResourcePresentationsPagesGetthumbnail](x: Self) {
    
    inline def setPageObjectId(value: String): Self = StObject.set(x, "pageObjectId", value.asInstanceOf[js.Any])
    
    inline def setPageObjectIdUndefined: Self = StObject.set(x, "pageObjectId", js.undefined)
    
    inline def setPresentationId(value: String): Self = StObject.set(x, "presentationId", value.asInstanceOf[js.Any])
    
    inline def setPresentationIdUndefined: Self = StObject.set(x, "presentationId", js.undefined)
    
    inline def setThumbnailPropertiesDotmimeType(value: String): Self = StObject.set(x, "thumbnailProperties.mimeType", value.asInstanceOf[js.Any])
    
    inline def setThumbnailPropertiesDotmimeTypeUndefined: Self = StObject.set(x, "thumbnailProperties.mimeType", js.undefined)
    
    inline def setThumbnailPropertiesDotthumbnailSize(value: String): Self = StObject.set(x, "thumbnailProperties.thumbnailSize", value.asInstanceOf[js.Any])
    
    inline def setThumbnailPropertiesDotthumbnailSizeUndefined: Self = StObject.set(x, "thumbnailProperties.thumbnailSize", js.undefined)
  }
}
