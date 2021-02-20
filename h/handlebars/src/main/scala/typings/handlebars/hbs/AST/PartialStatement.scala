package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialStatement extends Node {
  
  var hash: Hash = js.native
  
  var indent: String = js.native
  
  var name: PathExpression | SubExpression = js.native
  
  var params: js.Array[Expression] = js.native
  
  var strip: StripFlags = js.native
  
  @JSName("type")
  var type_PartialStatement: typings.handlebars.handlebarsStrings.PartialStatement = js.native
}
object PartialStatement {
  
  @scala.inline
  def apply(
    hash: Hash,
    indent: String,
    loc: SourceLocation,
    name: PathExpression | SubExpression,
    params: js.Array[Expression],
    strip: StripFlags,
    `type`: typings.handlebars.handlebarsStrings.PartialStatement
  ): PartialStatement = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStatement]
  }
  
  @scala.inline
  implicit class PartialStatementMutableBuilder[Self <: PartialStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: PathExpression | SubExpression): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Array[Expression]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: Expression*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setStrip(value: StripFlags): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.PartialStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
