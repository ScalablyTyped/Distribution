package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubExpression extends Node {
  
  var hash: Hash = js.native
  
  var params: js.Array[Expression] = js.native
  
  var path: PathExpression = js.native
  
  @JSName("type")
  var type_SubExpression: typings.handlebars.handlebarsStrings.SubExpression = js.native
}
object SubExpression {
  
  @scala.inline
  def apply(
    hash: Hash,
    loc: SourceLocation,
    params: js.Array[Expression],
    path: PathExpression,
    `type`: typings.handlebars.handlebarsStrings.SubExpression
  ): SubExpression = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubExpression]
  }
  
  @scala.inline
  implicit class SubExpressionMutableBuilder[Self <: SubExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Array[Expression]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: Expression*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: PathExpression): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.SubExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
