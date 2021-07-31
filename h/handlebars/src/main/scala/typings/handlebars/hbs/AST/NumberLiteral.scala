package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberLiteral
  extends StObject
     with Node {
  
  var original: Double
  
  @JSName("type")
  var type_NumberLiteral: typings.handlebars.handlebarsStrings.NumberLiteral
  
  var value: Double
}
object NumberLiteral {
  
  @scala.inline
  def apply(loc: SourceLocation, original: Double, value: Double): NumberLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberLiteral")
    __obj.asInstanceOf[NumberLiteral]
  }
  
  @scala.inline
  implicit class NumberLiteralMutableBuilder[Self <: NumberLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginal(value: Double): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.NumberLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
