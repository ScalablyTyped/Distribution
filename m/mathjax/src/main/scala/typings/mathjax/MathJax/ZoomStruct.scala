package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomStruct extends js.Object {
  /*The vertical offset from the top of the span to the baseline of the mathematics*/
  var Y: Double
  /*The height of the original mathematics element*/
  var mH: Double
  /*The width of the original mathematics element*/
  var mW: Double
  /*The height of the zoomed math*/
  var zH: Double
  /*The width of the zoomed math*/
  var zW: Double
}

object ZoomStruct {
  @scala.inline
  def apply(Y: Double, mH: Double, mW: Double, zH: Double, zW: Double): ZoomStruct = {
    val __obj = js.Dynamic.literal(Y = Y.asInstanceOf[js.Any], mH = mH.asInstanceOf[js.Any], mW = mW.asInstanceOf[js.Any], zH = zH.asInstanceOf[js.Any], zW = zW.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZoomStruct]
  }
}

