package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentStatement
  extends StObject
     with Node {
  
  var strip: StripFlags
  
  @JSName("type")
  var type_CommentStatement: typings.handlebars.handlebarsStrings.CommentStatement
  
  var value: String
}
object CommentStatement {
  
  inline def apply(loc: SourceLocation, strip: StripFlags, value: String): CommentStatement = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentStatement")
    __obj.asInstanceOf[CommentStatement]
  }
  
  extension [Self <: CommentStatement](x: Self) {
    
    inline def setStrip(value: StripFlags): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.handlebars.handlebarsStrings.CommentStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
