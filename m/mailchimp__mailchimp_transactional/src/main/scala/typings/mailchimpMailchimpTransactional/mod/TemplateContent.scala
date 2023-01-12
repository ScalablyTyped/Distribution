package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateContent extends StObject {
  
  /** The content to inject. */
  var content: String
  
  /** The name of the mc:edit editable region to inject into. */
  var name: String
}
object TemplateContent {
  
  inline def apply(content: String, name: String): TemplateContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateContent] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
