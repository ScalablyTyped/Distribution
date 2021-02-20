package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A content string and a MIME type that describes the content string&#39;s
  * format.
  */
@js.native
trait SchemaDocumentation extends StObject {
  
  /**
    * The text of the documentation, interpreted according to mime_type. The
    * content may not exceed 8,192 Unicode characters and may not exceed more
    * than 10,240 bytes when encoded in UTF-8 format, whichever is smaller.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * The format of the content field. Presently, only the value
    * &quot;text/markdown&quot; is supported. See Markdown
    * (https://en.wikipedia.org/wiki/Markdown) for more information.
    */
  var mimeType: js.UndefOr[String] = js.native
}
object SchemaDocumentation {
  
  @scala.inline
  def apply(): SchemaDocumentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentation]
  }
  
  @scala.inline
  implicit class SchemaDocumentationMutableBuilder[Self <: SchemaDocumentation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
