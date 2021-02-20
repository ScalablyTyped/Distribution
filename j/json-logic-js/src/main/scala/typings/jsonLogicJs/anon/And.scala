package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait And extends _RulesLogic {
  
  var and: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
  ] = js.native
}
object And {
  
  @scala.inline
  def apply(
    and: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
    ]
  ): And = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any])
    __obj.asInstanceOf[And]
  }
  
  @scala.inline
  implicit class AndMutableBuilder[Self <: And] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnd(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object)*
    ): Self = StObject.set(x, "and", js.Array(value :_*))
  }
}
