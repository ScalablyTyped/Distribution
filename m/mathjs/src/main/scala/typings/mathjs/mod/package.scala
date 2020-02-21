package typings.mathjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BigNumber = typings.decimalJs.mod.Decimal
  type FactoryFunction[T] = js.Function1[/* scope */ js.Any, T]
  type ImportObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type MathArray = js.Array[js.Array[scala.Double] | scala.Double]
  type MathExpression = java.lang.String | js.Array[java.lang.String] | typings.mathjs.mod.MathArray | typings.mathjs.mod.Matrix
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.mathjs.mod.BigNumber
    - typings.mathjs.mod.Fraction
    - typings.mathjs.mod.Complex
    - typings.mathjs.mod.Unit
    - typings.mathjs.mod.MathArray
    - typings.mathjs.mod.Matrix
  */
  type MathType = typings.mathjs.mod._MathType | scala.Double | typings.mathjs.mod.BigNumber | typings.mathjs.mod.MathArray
  type NoLiteralType[T] = T | scala.Boolean | java.lang.String | scala.Double
}
