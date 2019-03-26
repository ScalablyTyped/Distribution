package typings
package mathjsLib.mathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mathNs {
  type BigNumber = decimalDotJsLib.decimalDotJsMod.Decimal
  type MathArray = js.Array[scala.Double] | js.Array[js.Array[scala.Double]]
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
