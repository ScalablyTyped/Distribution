package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextAnnotation extends StObject {
  
  /**
    * List of pages detected by OCR.
    */
  var pages: js.UndefOr[js.Array[SchemaPage]] = js.undefined
  
  /**
    * UTF-8 text detected on the pages.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaTextAnnotation {
  
  inline def apply(): SchemaTextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextAnnotation]
  }
  
  extension [Self <: SchemaTextAnnotation](x: Self) {
    
    inline def setPages(value: js.Array[SchemaPage]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: SchemaPage*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
