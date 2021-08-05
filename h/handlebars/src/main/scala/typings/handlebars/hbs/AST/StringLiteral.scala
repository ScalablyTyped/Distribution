package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringLiteral
  extends StObject
     with Node {
  
  var original: String
  
  @JSName("type")
  var type_StringLiteral: typings.handlebars.handlebarsStrings.StringLiteral
  
  var value: String
}
object StringLiteral {
  
  inline def apply(loc: SourceLocation, original: String, value: String): StringLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[StringLiteral]
  }
  
  extension [Self <: StringLiteral](x: Self) {
    
    inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.handlebars.handlebarsStrings.StringLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
