package typings
package iframeDashResizerLib.iframeDashResizerMod.iframeResizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait IFrameScrollData extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object IFrameScrollData {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): IFrameScrollData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[IFrameScrollData]
  }
}

