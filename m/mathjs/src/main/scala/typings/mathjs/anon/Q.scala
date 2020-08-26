package typings.mathjs.anon

import typings.mathjs.mod.MathArray
import typings.mathjs.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Q extends js.Object {
  var Q: MathArray | Matrix = js.native
  var R: MathArray | Matrix = js.native
}

object Q {
  @scala.inline
  def apply(Q: MathArray | Matrix, R: MathArray | Matrix): Q = {
    val __obj = js.Dynamic.literal(Q = Q.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
    __obj.asInstanceOf[Q]
  }
  @scala.inline
  implicit class QOps[Self <: Q] (val x: Self) extends AnyVal {
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
    def setQVarargs(value: (js.Array[Double] | Double)*): Self = this.set("Q", js.Array(value :_*))
    @scala.inline
    def setQ(value: MathArray | Matrix): Self = this.set("Q", value.asInstanceOf[js.Any])
    @scala.inline
    def setRVarargs(value: (js.Array[Double] | Double)*): Self = this.set("R", js.Array(value :_*))
    @scala.inline
    def setR(value: MathArray | Matrix): Self = this.set("R", value.asInstanceOf[js.Any])
  }
  
}

