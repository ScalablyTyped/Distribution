package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImage extends StObject {
  
  /**
    * An URL to an image with a default lifetime of 30 minutes. This URL is tagged with the account of the requester. Anyone with the URL effectively accesses the image as the original requester. Access to the image may be lost if the presentation's sharing settings change.
    */
  var contentUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The properties of the image.
    */
  var imageProperties: js.UndefOr[SchemaImageProperties] = js.undefined
  
  /**
    * Placeholders are page elements that inherit from corresponding placeholders on layouts and masters. If set, the image is a placeholder image and any inherited properties can be resolved by looking at the parent placeholder identified by the Placeholder.parent_object_id field.
    */
  var placeholder: js.UndefOr[SchemaPlaceholder] = js.undefined
  
  /**
    * The source URL is the URL used to insert the image. The source URL can be empty.
    */
  var sourceUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaImage {
  
  inline def apply(): SchemaImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImage]
  }
  
  extension [Self <: SchemaImage](x: Self) {
    
    inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlNull: Self = StObject.set(x, "contentUrl", null)
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    inline def setImageProperties(value: SchemaImageProperties): Self = StObject.set(x, "imageProperties", value.asInstanceOf[js.Any])
    
    inline def setImagePropertiesUndefined: Self = StObject.set(x, "imageProperties", js.undefined)
    
    inline def setPlaceholder(value: SchemaPlaceholder): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceUrlNull: Self = StObject.set(x, "sourceUrl", null)
    
    inline def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
  }
}
