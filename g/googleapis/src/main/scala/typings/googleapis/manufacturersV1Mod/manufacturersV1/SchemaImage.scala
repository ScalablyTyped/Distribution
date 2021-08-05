package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An image.
  */
trait SchemaImage extends StObject {
  
  /**
    * The URL of the image. For crawled images, this is the provided URL. For
    * uploaded images, this is a serving URL from Google if the image has been
    * processed successfully.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the image. @OutputOnly
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the image, i.e., crawled or uploaded. @OutputOnly
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaImage {
  
  inline def apply(): SchemaImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImage]
  }
  
  extension [Self <: SchemaImage](x: Self) {
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
