package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If an image was produced from a file (e.g. a PDF), this message gives
  * information about the source of that image.
  */
trait SchemaGoogleCloudVisionV1p3beta1ImageAnnotationContext extends StObject {
  
  /**
    * If the file was a PDF or TIFF, this field gives the page number within
    * the file used to produce the image.
    */
  var pageNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * The URI of the file used to produce the image.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVisionV1p3beta1ImageAnnotationContext {
  
  inline def apply(): SchemaGoogleCloudVisionV1p3beta1ImageAnnotationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1ImageAnnotationContext]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p3beta1ImageAnnotationContext](x: Self) {
    
    inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
