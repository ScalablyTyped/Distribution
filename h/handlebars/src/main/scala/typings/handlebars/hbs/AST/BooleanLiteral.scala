package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanLiteral extends Node {
  
  var original: Boolean = js.native
  
  @JSName("type")
  var type_BooleanLiteral: typings.handlebars.handlebarsStrings.BooleanLiteral = js.native
  
  var value: Boolean = js.native
}
object BooleanLiteral {
  
  @scala.inline
  def apply(
    loc: SourceLocation,
    original: Boolean,
    `type`: typings.handlebars.handlebarsStrings.BooleanLiteral,
    value: Boolean
  ): BooleanLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanLiteral]
  }
  
  @scala.inline
  implicit class BooleanLiteralMutableBuilder[Self <: BooleanLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginal(value: Boolean): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.BooleanLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
