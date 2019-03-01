package typings
package mathjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_L extends js.Object {
  var L: mathjsLib.mathjsMod.mathNs.MathArray | mathjsLib.mathjsMod.mathNs.Matrix
  var P: js.Array[scala.Double]
  var U: mathjsLib.mathjsMod.mathNs.MathArray | mathjsLib.mathjsMod.mathNs.Matrix
}

object Anon_L {
  @scala.inline
  def apply(
    L: mathjsLib.mathjsMod.mathNs.MathArray | mathjsLib.mathjsMod.mathNs.Matrix,
    P: js.Array[scala.Double],
    U: mathjsLib.mathjsMod.mathNs.MathArray | mathjsLib.mathjsMod.mathNs.Matrix
  ): Anon_L = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("L")(L.asInstanceOf[js.Any])
    __obj.updateDynamic("P")(P)
    __obj.updateDynamic("U")(U.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_L]
  }
}

