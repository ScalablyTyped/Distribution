package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max
  extends StObject
     with _RulesLogic {
  
  var max: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
  ]
}
object Max {
  
  @scala.inline
  def apply(
    max: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
    ]
  ): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
  
  @scala.inline
  implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object)*
    ): Self = StObject.set(x, "max", js.Array(value :_*))
  }
}
