package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanLiteral
  extends StObject
     with Node {
  
  var original: Boolean
  
  @JSName("type")
  var type_BooleanLiteral: typings.handlebars.handlebarsStrings.BooleanLiteral
  
  var value: Boolean
}
object BooleanLiteral {
  
  inline def apply(loc: SourceLocation, original: Boolean, value: Boolean): BooleanLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[BooleanLiteral]
  }
  
  extension [Self <: BooleanLiteral](x: Self) {
    
    inline def setOriginal(value: Boolean): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.handlebars.handlebarsStrings.BooleanLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
