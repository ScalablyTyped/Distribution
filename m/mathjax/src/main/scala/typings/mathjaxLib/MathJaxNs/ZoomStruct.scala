package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomStruct extends js.Object {
  /*The vertical offset from the top of the span to the baseline of the mathematics*/
  var Y: scala.Double
  /*The height of the original mathematics element*/
  var mH: scala.Double
  /*The width of the original mathematics element*/
  var mW: scala.Double
  /*The height of the zoomed math*/
  var zH: scala.Double
  /*The width of the zoomed math*/
  var zW: scala.Double
}

object ZoomStruct {
  @scala.inline
  def apply(Y: scala.Double, mH: scala.Double, mW: scala.Double, zH: scala.Double, zW: scala.Double): ZoomStruct = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Y")(Y)
    __obj.updateDynamic("mH")(mH)
    __obj.updateDynamic("mW")(mW)
    __obj.updateDynamic("zH")(zH)
    __obj.updateDynamic("zW")(zW)
    __obj.asInstanceOf[ZoomStruct]
  }
}

