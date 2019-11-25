package typings.mathjs

import typings.mathjs.mathjsMod.MathArray
import typings.mathjs.mathjsMod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_L extends js.Object {
  var L: MathArray | Matrix
  var P: js.Array[Double]
  var U: MathArray | Matrix
}

object Anon_L {
  @scala.inline
  def apply(L: MathArray | Matrix, P: js.Array[Double], U: MathArray | Matrix): Anon_L = {
    val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_L]
  }
}

