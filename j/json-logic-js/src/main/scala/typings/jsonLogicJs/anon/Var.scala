package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Var
  extends StObject
     with _RulesLogic {
  
  var `var`: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object) | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
  ]) | (js.Tuple2[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
    js.Any
  ])
}
object Var {
  
  @scala.inline
  def apply(
    `var`: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object) | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
    ]) | (js.Tuple2[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
      js.Any
    ])
  ): Var = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Var]
  }
  
  @scala.inline
  implicit class VarMutableBuilder[Self <: Var] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVar(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object) | (js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]) | (js.Tuple2[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          js.Any
        ])
    ): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object)*
    ): Self = StObject.set(x, "var", js.Array(value :_*))
  }
}
