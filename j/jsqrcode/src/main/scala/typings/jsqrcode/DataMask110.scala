package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataMask110 extends DataMask

object DataMask110 {
  @scala.inline
  def apply(isMasked: (Double, Double) => Boolean, unmaskBitMatrix: (js.Array[Double], Double) => Unit): DataMask110 = {
    val __obj = js.Dynamic.literal(isMasked = js.Any.fromFunction2(isMasked), unmaskBitMatrix = js.Any.fromFunction2(unmaskBitMatrix))
    __obj.asInstanceOf[DataMask110]
  }
}

