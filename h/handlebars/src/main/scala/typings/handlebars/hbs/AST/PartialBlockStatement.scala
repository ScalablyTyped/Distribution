package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialBlockStatement extends Node {
  
  var closeStrip: StripFlags = js.native
  
  var hash: Hash = js.native
  
  var name: PathExpression | SubExpression = js.native
  
  var openStrip: StripFlags = js.native
  
  var params: js.Array[Expression] = js.native
  
  var program: Program = js.native
  
  @JSName("type")
  var type_PartialBlockStatement: typings.handlebars.handlebarsStrings.PartialBlockStatement = js.native
}
object PartialBlockStatement {
  
  @scala.inline
  def apply(
    closeStrip: StripFlags,
    hash: Hash,
    loc: SourceLocation,
    name: PathExpression | SubExpression,
    openStrip: StripFlags,
    params: js.Array[Expression],
    program: Program,
    `type`: typings.handlebars.handlebarsStrings.PartialBlockStatement
  ): PartialBlockStatement = {
    val __obj = js.Dynamic.literal(closeStrip = closeStrip.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], openStrip = openStrip.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBlockStatement]
  }
  
  @scala.inline
  implicit class PartialBlockStatementMutableBuilder[Self <: PartialBlockStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseStrip(value: StripFlags): Self = StObject.set(x, "closeStrip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: PathExpression | SubExpression): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenStrip(value: StripFlags): Self = StObject.set(x, "openStrip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Array[Expression]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: Expression*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.PartialBlockStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
