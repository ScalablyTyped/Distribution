package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentStatement
  extends StObject
     with Node {
  
  var original: StripFlags
  
  @JSName("type")
  var type_ContentStatement: typings.handlebars.handlebarsStrings.ContentStatement
  
  var value: String
}
object ContentStatement {
  
  inline def apply(loc: SourceLocation, original: StripFlags, value: String): ContentStatement = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ContentStatement")
    __obj.asInstanceOf[ContentStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentStatement] (val x: Self) extends AnyVal {
    
    inline def setOriginal(value: StripFlags): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.handlebars.handlebarsStrings.ContentStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
