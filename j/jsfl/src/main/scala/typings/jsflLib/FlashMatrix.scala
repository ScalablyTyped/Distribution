package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashMatrix extends js.Object {
  var a: scala.Double
  var b: scala.Double
  var c: scala.Double
  var d: scala.Double
  var tx: scala.Double
  var ty: scala.Double
}

object FlashMatrix {
  @scala.inline
  def apply(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    tx: scala.Double,
    ty: scala.Double
  ): FlashMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("a")(a)
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("c")(c)
    __obj.updateDynamic("d")(d)
    __obj.updateDynamic("tx")(tx)
    __obj.updateDynamic("ty")(ty)
    __obj.asInstanceOf[FlashMatrix]
  }
}

