package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndefinedLiteral
  extends StObject
     with Node {
  
  @JSName("type")
  var type_UndefinedLiteral: typings.handlebars.handlebarsStrings.UndefinedLiteral
}
object UndefinedLiteral {
  
  @scala.inline
  def apply(loc: SourceLocation): UndefinedLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UndefinedLiteral")
    __obj.asInstanceOf[UndefinedLiteral]
  }
  
  @scala.inline
  implicit class UndefinedLiteralMutableBuilder[Self <: UndefinedLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.UndefinedLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
