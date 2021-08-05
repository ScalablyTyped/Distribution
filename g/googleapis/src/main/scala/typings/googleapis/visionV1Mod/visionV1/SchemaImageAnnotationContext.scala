package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If an image was produced from a file (e.g. a PDF), this message gives
  * information about the source of that image.
  */
trait SchemaImageAnnotationContext extends StObject {
  
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
object SchemaImageAnnotationContext {
  
  inline def apply(): SchemaImageAnnotationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageAnnotationContext]
  }
  
  extension [Self <: SchemaImageAnnotationContext](x: Self) {
    
    inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
