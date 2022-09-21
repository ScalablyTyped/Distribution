package typings.jexl

import org.scalablytyped.runtime.StringDictionary
import typings.jexl.jexlStrings.functions
import typings.jexl.jexlStrings.transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object astMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.jexl.anon.Operator
    - typings.jexl.anon.Left
    - typings.jexl.anon.Alternate
    - typings.jexl.anon.Expr
    - typings.jexl.anon.Type
    - typings.jexl.anon.Value
    - typings.jexl.anon.TypeValue
    - typings.jexl.anon.From
    - typings.jexl.anon.Args
  */
  trait Ast extends StObject
  object Ast {
    
    inline def Alternate(alternate: Ast, consequent: Ast, test: Ast): typings.jexl.anon.Alternate = {
      val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ConditionalExpression")
      __obj.asInstanceOf[typings.jexl.anon.Alternate]
    }
    
    inline def Args(args: js.Array[Ast], name: String, pool: functions | transforms): typings.jexl.anon.Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FunctionCall")
      __obj.asInstanceOf[typings.jexl.anon.Args]
    }
    
    inline def Expr(expr: Ast, relative: Boolean, subject: Ast): typings.jexl.anon.Expr = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FilterExpression")
      __obj.asInstanceOf[typings.jexl.anon.Expr]
    }
    
    inline def From(value: String): typings.jexl.anon.From = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Identifier")
      __obj.asInstanceOf[typings.jexl.anon.From]
    }
    
    inline def Left(left: Ast, operator: String, right: Ast): typings.jexl.anon.Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("BinaryExpression")
      __obj.asInstanceOf[typings.jexl.anon.Left]
    }
    
    inline def Operator(operator: String, right: Ast): typings.jexl.anon.Operator = {
      val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("UnaryExpression")
      __obj.asInstanceOf[typings.jexl.anon.Operator]
    }
    
    inline def Type(value: String | Double | Boolean): typings.jexl.anon.Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Literal")
      __obj.asInstanceOf[typings.jexl.anon.Type]
    }
    
    inline def TypeValue(value: StringDictionary[Ast]): typings.jexl.anon.TypeValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ObjectLiteral")
      __obj.asInstanceOf[typings.jexl.anon.TypeValue]
    }
    
    inline def Value(value: js.Array[Ast]): typings.jexl.anon.Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ArrayLiteral")
      __obj.asInstanceOf[typings.jexl.anon.Value]
    }
  }
}
