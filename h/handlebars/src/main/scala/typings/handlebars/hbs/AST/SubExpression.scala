package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubExpression
  extends StObject
     with Node {
  
  var hash: Hash
  
  var params: js.Array[Expression]
  
  var path: PathExpression
  
  @JSName("type")
  var type_SubExpression: typings.handlebars.handlebarsStrings.SubExpression
}
object SubExpression {
  
  @scala.inline
  def apply(hash: Hash, loc: SourceLocation, params: js.Array[Expression], path: PathExpression): SubExpression = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SubExpression")
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
