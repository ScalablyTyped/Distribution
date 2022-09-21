package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImage extends StObject {
  
  /**
    * A description of the image that is shown on hover and read by screenreaders.
    */
  var altText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A URI from which you can download the image; this is valid only for a limited time.
    */
  var contentUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Properties of an image.
    */
  var properties: js.UndefOr[SchemaMediaProperties] = js.undefined
  
  /**
    * Input only. The source URI is the URI used to insert the image. The source URI can be empty when fetched.
    */
  var sourceUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaImage {
  
  inline def apply(): SchemaImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImage]
  }
  
  extension [Self <: SchemaImage](x: Self) {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextNull: Self = StObject.set(x, "altText", null)
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setContentUri(value: String): Self = StObject.set(x, "contentUri", value.asInstanceOf[js.Any])
    
    inline def setContentUriNull: Self = StObject.set(x, "contentUri", null)
    
    inline def setContentUriUndefined: Self = StObject.set(x, "contentUri", js.undefined)
    
    inline def setProperties(value: SchemaMediaProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    inline def setSourceUriNull: Self = StObject.set(x, "sourceUri", null)
    
    inline def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
  }
}
