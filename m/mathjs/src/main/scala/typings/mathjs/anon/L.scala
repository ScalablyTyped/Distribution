package typings.mathjs.anon

import typings.mathjs.mod.MathArray
import typings.mathjs.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait L extends js.Object {
  var L: MathArray | Matrix = js.native
  var P: js.Array[Double] = js.native
  var U: MathArray | Matrix = js.native
}

object L {
  @scala.inline
  def apply(L: MathArray | Matrix, P: js.Array[Double], U: MathArray | Matrix): L = {
    val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
    __obj.asInstanceOf[L]
  }
  @scala.inline
  implicit class LOps[Self <: L] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLVarargs(value: (js.Array[Double] | Double)*): Self = this.set("L", js.Array(value :_*))
    @scala.inline
    def setL(value: MathArray | Matrix): Self = this.set("L", value.asInstanceOf[js.Any])
    @scala.inline
    def setPVarargs(value: Double*): Self = this.set("P", js.Array(value :_*))
    @scala.inline
    def setP(value: js.Array[Double]): Self = this.set("P", value.asInstanceOf[js.Any])
    @scala.inline
    def setUVarargs(value: (js.Array[Double] | Double)*): Self = this.set("U", js.Array(value :_*))
    @scala.inline
    def setU(value: MathArray | Matrix): Self = this.set("U", value.asInstanceOf[js.Any])
  }
  
}

