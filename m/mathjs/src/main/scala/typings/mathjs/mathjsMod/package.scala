package typings.mathjs

import org.scalablytyped.runtime.StringDictionary
import typings.decimalDotJs.decimalDotJsMod.Decimal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mathjsMod {
  type BigNumber = Decimal
  type FactoryFunction[T] = js.Function1[/* scope */ js.Any, T]
  type ImportObject = StringDictionary[js.Any]
  type MathArray = js.Array[js.Array[Double] | Double]
  type MathExpression = String | js.Array[String] | MathArray | Matrix
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.mathjs.mathjsMod.BigNumber
    - typings.mathjs.mathjsMod.Fraction
    - typings.mathjs.mathjsMod.Complex
    - typings.mathjs.mathjsMod.Unit
    - typings.mathjs.mathjsMod.MathArray
    - typings.mathjs.mathjsMod.Matrix
  */
  type MathType = _MathType | Double | BigNumber | MathArray
}
