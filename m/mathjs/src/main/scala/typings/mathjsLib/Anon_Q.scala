package typings
package mathjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Q extends js.Object {
  var Q: mathjsLib.mathjsMod.mathNs.MathArray | mathjsLib.mathjsMod.mathNs.Matrix
  var R: mathjsLib.mathjsMod.mathNs.MathArray | mathjsLib.mathjsMod.mathNs.Matrix
}

object Anon_Q {
  @scala.inline
  def apply(
    Q: mathjsLib.mathjsMod.mathNs.MathArray | mathjsLib.mathjsMod.mathNs.Matrix,
    R: mathjsLib.mathjsMod.mathNs.MathArray | mathjsLib.mathjsMod.mathNs.Matrix
  ): Anon_Q = {
    val __obj = js.Dynamic.literal(Q = Q.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Q]
  }
}

