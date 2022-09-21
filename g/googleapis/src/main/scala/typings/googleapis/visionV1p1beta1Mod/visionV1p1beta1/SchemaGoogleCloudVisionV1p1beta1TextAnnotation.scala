package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p1beta1TextAnnotation extends StObject {
  
  /**
    * List of pages detected by OCR.
    */
  var pages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1Page]] = js.undefined
  
  /**
    * UTF-8 text detected on the pages.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1TextAnnotation {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1TextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1TextAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1TextAnnotation](x: Self) {
    
    inline def setPages(value: js.Array[SchemaGoogleCloudVisionV1p1beta1Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: SchemaGoogleCloudVisionV1p1beta1Page*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
