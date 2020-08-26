package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataMask extends js.Object {
  def isMasked(i: Double, j: Double): Boolean = js.native
  def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit = js.native
}

object DataMask {
  @scala.inline
  def apply(isMasked: (Double, Double) => Boolean, unmaskBitMatrix: (js.Array[Double], Double) => Unit): DataMask = {
    val __obj = js.Dynamic.literal(isMasked = js.Any.fromFunction2(isMasked), unmaskBitMatrix = js.Any.fromFunction2(unmaskBitMatrix))
    __obj.asInstanceOf[DataMask]
  }
  @scala.inline
  implicit class DataMaskOps[Self <: DataMask] (val x: Self) extends AnyVal {
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
    def setIsMasked(value: (Double, Double) => Boolean): Self = this.set("isMasked", js.Any.fromFunction2(value))
    @scala.inline
    def setUnmaskBitMatrix(value: (js.Array[Double], Double) => Unit): Self = this.set("unmaskBitMatrix", js.Any.fromFunction2(value))
  }
  
}

