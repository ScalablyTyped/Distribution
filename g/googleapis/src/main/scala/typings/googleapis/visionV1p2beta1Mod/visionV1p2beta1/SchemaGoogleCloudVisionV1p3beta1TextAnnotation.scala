package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TextAnnotation contains a structured representation of OCR extracted text.
  * The hierarchy of an OCR extracted text structure is like this:
  * TextAnnotation -&gt; Page -&gt; Block -&gt; Paragraph -&gt; Word -&gt;
  * Symbol Each structural component, starting from Page, may further have
  * their own properties. Properties describe detected languages, breaks etc..
  * Please refer to the TextAnnotation.TextProperty message definition below
  * for more detail.
  */
trait SchemaGoogleCloudVisionV1p3beta1TextAnnotation extends StObject {
  
  /**
    * List of pages detected by OCR.
    */
  var pages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1Page]] = js.undefined
  
  /**
    * UTF-8 text detected on the pages.
    */
  var text: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVisionV1p3beta1TextAnnotation {
  
  inline def apply(): SchemaGoogleCloudVisionV1p3beta1TextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1TextAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p3beta1TextAnnotation](x: Self) {
    
    inline def setPages(value: js.Array[SchemaGoogleCloudVisionV1p3beta1Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: SchemaGoogleCloudVisionV1p3beta1Page*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
