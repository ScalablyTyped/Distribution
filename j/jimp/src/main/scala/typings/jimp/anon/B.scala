package typings.jimp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait B extends js.Object {
  var b: js.Array[Double] = js.native
  var g: js.Array[Double] = js.native
  var r: js.Array[Double] = js.native
}

object B {
  @scala.inline
  def apply(b: js.Array[Double], g: js.Array[Double], r: js.Array[Double]): B = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[B]
  }
  @scala.inline
  implicit class BOps[Self <: B] (val x: Self) extends AnyVal {
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
    def setBVarargs(value: Double*): Self = this.set("b", js.Array(value :_*))
    @scala.inline
    def setB(value: js.Array[Double]): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setGVarargs(value: Double*): Self = this.set("g", js.Array(value :_*))
    @scala.inline
    def setG(value: js.Array[Double]): Self = this.set("g", value.asInstanceOf[js.Any])
    @scala.inline
    def setRVarargs(value: Double*): Self = this.set("r", js.Array(value :_*))
    @scala.inline
    def setR(value: js.Array[Double]): Self = this.set("r", value.asInstanceOf[js.Any])
  }
  
}

