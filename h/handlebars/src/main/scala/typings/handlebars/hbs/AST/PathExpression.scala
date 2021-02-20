package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathExpression extends Node {
  
  var data: Boolean = js.native
  
  var depth: Double = js.native
  
  var original: String = js.native
  
  var parts: js.Array[String] = js.native
  
  @JSName("type")
  var type_PathExpression: typings.handlebars.handlebarsStrings.PathExpression = js.native
}
object PathExpression {
  
  @scala.inline
  def apply(
    data: Boolean,
    depth: Double,
    loc: SourceLocation,
    original: String,
    parts: js.Array[String],
    `type`: typings.handlebars.handlebarsStrings.PathExpression
  ): PathExpression = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathExpression]
  }
  
  @scala.inline
  implicit class PathExpressionMutableBuilder[Self <: PathExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParts(value: js.Array[String]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsVarargs(value: String*): Self = StObject.set(x, "parts", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.PathExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
