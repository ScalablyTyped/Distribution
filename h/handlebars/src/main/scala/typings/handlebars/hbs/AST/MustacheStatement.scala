package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MustacheStatement extends Node {
  
  var escaped: Boolean = js.native
  
  var hash: Hash = js.native
  
  var params: js.Array[Expression] = js.native
  
  var path: PathExpression | Literal = js.native
  
  var strip: StripFlags = js.native
  
  @JSName("type")
  var type_MustacheStatement: typings.handlebars.handlebarsStrings.MustacheStatement = js.native
}
object MustacheStatement {
  
  @scala.inline
  def apply(
    escaped: Boolean,
    hash: Hash,
    loc: SourceLocation,
    params: js.Array[Expression],
    path: PathExpression | Literal,
    strip: StripFlags,
    `type`: typings.handlebars.handlebarsStrings.MustacheStatement
  ): MustacheStatement = {
    val __obj = js.Dynamic.literal(escaped = escaped.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MustacheStatement]
  }
  
  @scala.inline
  implicit class MustacheStatementMutableBuilder[Self <: MustacheStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEscaped(value: Boolean): Self = StObject.set(x, "escaped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Array[Expression]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: Expression*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: PathExpression | Literal): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrip(value: StripFlags): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.MustacheStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
