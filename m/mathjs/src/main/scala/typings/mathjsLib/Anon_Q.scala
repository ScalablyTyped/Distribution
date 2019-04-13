package typings
package mathjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Q extends js.Object {
  var Q: mathjsLib.mathjsMod.MathArray | mathjsLib.mathjsMod.Matrix
  var R: mathjsLib.mathjsMod.MathArray | mathjsLib.mathjsMod.Matrix
}

object Anon_Q {
  @scala.inline
  def apply(
    Q: mathjsLib.mathjsMod.MathArray | mathjsLib.mathjsMod.Matrix,
    R: mathjsLib.mathjsMod.MathArray | mathjsLib.mathjsMod.Matrix
  ): Anon_Q = {
    val __obj = js.Dynamic.literal(Q = Q.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Q]
  }
}

