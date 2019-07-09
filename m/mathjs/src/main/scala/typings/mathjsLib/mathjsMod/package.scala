package typings
package mathjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mathjsMod {
  type BigNumber = decimalDotJsLib.decimalDotJsMod.Decimal
  type FactoryFunction[T] = js.Function1[/* scope */ js.Any, T]
  type ImportObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type MathArray = js.Array[js.Array[scala.Double] | scala.Double]
  type MathExpression = java.lang.String | js.Array[java.lang.String] | MathArray | Matrix
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - BigNumber
    - Fraction
    - Complex
    - Unit
    - MathArray
    - Matrix
  */
  type MathType = _MathType | scala.Double | BigNumber | MathArray
}
