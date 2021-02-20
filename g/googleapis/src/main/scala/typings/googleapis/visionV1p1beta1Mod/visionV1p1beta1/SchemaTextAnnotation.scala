package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait SchemaTextAnnotation extends StObject {
  
  /**
    * List of pages detected by OCR.
    */
  var pages: js.UndefOr[js.Array[SchemaPage]] = js.native
  
  /**
    * UTF-8 text detected on the pages.
    */
  var text: js.UndefOr[String] = js.native
}
object SchemaTextAnnotation {
  
  @scala.inline
  def apply(): SchemaTextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextAnnotation]
  }
  
  @scala.inline
  implicit class SchemaTextAnnotationMutableBuilder[Self <: SchemaTextAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPages(value: js.Array[SchemaPage]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    @scala.inline
    def setPagesVarargs(value: SchemaPage*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
