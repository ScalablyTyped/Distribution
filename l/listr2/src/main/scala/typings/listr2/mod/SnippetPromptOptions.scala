package typings.listr2.mod

import typings.listr2.anon.PartialBasePromptOptionsW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnippetPromptOptions
  extends StObject
     with BasePromptOptions {
  
  var fields: js.Array[PartialBasePromptOptionsW]
  
  var newline: js.UndefOr[String] = js.undefined
  
  var template: String
}
object SnippetPromptOptions {
  
  inline def apply(
    fields: js.Array[PartialBasePromptOptionsW],
    message: String | (js.Function0[js.Promise[String] | String]),
    template: String
  ): SnippetPromptOptions = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnippetPromptOptions]
  }
  
  extension [Self <: SnippetPromptOptions](x: Self) {
    
    inline def setFields(value: js.Array[PartialBasePromptOptionsW]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: PartialBasePromptOptionsW*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
    
    inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
