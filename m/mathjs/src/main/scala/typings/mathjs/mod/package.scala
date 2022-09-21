package typings.mathjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.decimalJs.mod.Decimal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// eslint-disable-next-line @typescript-eslint/no-empty-interface
type BigNumber = Decimal

// eslint-disable-next-line @typescript-eslint/no-explicit-any
type FactoryFunction[T] = js.Function1[/* scope */ Any, T]

type ImportObject = // eslint-disable-next-line @typescript-eslint/no-explicit-any
StringDictionary[Any]

type MathArray = js.Array[js.Array[MathNumericType] | MathNumericType]

type MathCollection = MathArray | Matrix

type MathExpression = String | js.Array[String] | MathCollection

/* Rewritten from type alias, can be one of: 
  - typings.mathjs.mod.AccessorNode
  - typings.mathjs.mod.ArrayNode
  - typings.mathjs.mod.AssignmentNode
  - typings.mathjs.mod.BlockNode
  - typings.mathjs.mod.ConditionalNode
  - typings.mathjs.mod.ConstantNode
  - typings.mathjs.mod.FunctionAssignmentNode
  - typings.mathjs.mod.FunctionNode
  - typings.mathjs.mod.IndexNode
  - typings.mathjs.mod.ObjectNode
  - typings.mathjs.mod.OperatorNode[
typings.mathjs.mod.OperatorNodeOp, 
typings.mathjs.mod.OperatorNodeFn, 
js.Array[scala.Any]]
  - typings.mathjs.mod.ParenthesisNode[scala.Any]
  - typings.mathjs.mod.RangeNode
  - typings.mathjs.mod.RelationalNode
  - typings.mathjs.mod.SymbolNode
*/
type MathNode = _MathNode | (OperatorNode[OperatorNodeOp, OperatorNodeFn, js.Array[Any]]) | ParenthesisNode[Any]

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typings.mathjs.mod.BigNumber
  - typings.mathjs.mod.Fraction
  - typings.mathjs.mod.Complex
*/
type MathNumericType = _MathNumericType | Double | BigNumber

/* Rewritten from type alias, can be one of: 
  - typings.mathjs.mod.MathNumericType
  - typings.mathjs.mod.Unit
  - typings.mathjs.mod.MathCollection
*/
type MathType = _MathType | MathCollection | Double | BigNumber

type NoLiteralType[T] = T | Boolean | String | Double

/* Rewritten from type alias, can be one of: 
  - typings.mathjs.anon.Assuming
  - typings.mathjs.anon.ImposeContext
  - java.lang.String
  - js.Function1[/ * node * / scala.Any, scala.Any]
*/
type SimplifyRule = _SimplifyRule | (js.Function1[/* node */ Any, Any]) | String
