package typings
package mathjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_L extends js.Object {
  var L: mathjsLib.mathjsMod.MathArray | mathjsLib.mathjsMod.Matrix
  var P: js.Array[scala.Double]
  var U: mathjsLib.mathjsMod.MathArray | mathjsLib.mathjsMod.Matrix
}

object Anon_L {
  @scala.inline
  def apply(
    L: mathjsLib.mathjsMod.MathArray | mathjsLib.mathjsMod.Matrix,
    P: js.Array[scala.Double],
    U: mathjsLib.mathjsMod.MathArray | mathjsLib.mathjsMod.Matrix
  ): Anon_L = {
    val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], P = P, U = U.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_L]
  }
}

