package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullLiteral extends Node {
  
  @JSName("type")
  var type_NullLiteral: typings.handlebars.handlebarsStrings.NullLiteral = js.native
}
object NullLiteral {
  
  @scala.inline
  def apply(loc: SourceLocation, `type`: typings.handlebars.handlebarsStrings.NullLiteral): NullLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullLiteral]
  }
  
  @scala.inline
  implicit class NullLiteralMutableBuilder[Self <: NullLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.NullLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
