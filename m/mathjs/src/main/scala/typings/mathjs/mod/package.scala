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

/**
  * @deprecated since version 11.3. Prefer `MathNode` instead
  */
type MathNodeCommon = MathNode

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

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends number ? number : T extends string ? string : T extends boolean ? boolean : T
  }}}
  */
type NoLiteralType[T] = T

/* Rewritten from type alias, can be one of: 
  - typings.mathjs.anon.Assuming
  - typings.mathjs.anon.ImposeContext
  - java.lang.String
  - js.Function1[/ * node * / typings.mathjs.mod.MathNode, typings.mathjs.mod.MathNode]
*/
type SimplifyRule = _SimplifyRule | (js.Function1[/* node */ MathNode, MathNode]) | String
