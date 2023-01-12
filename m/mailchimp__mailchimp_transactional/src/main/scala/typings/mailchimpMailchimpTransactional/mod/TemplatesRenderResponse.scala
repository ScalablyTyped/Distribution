package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplatesRenderResponse extends StObject {
  
  /** the rendered HTML as a string */
  var html: String
}
object TemplatesRenderResponse {
  
  inline def apply(html: String): TemplatesRenderResponse = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplatesRenderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplatesRenderResponse] (val x: Self) extends AnyVal {
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
