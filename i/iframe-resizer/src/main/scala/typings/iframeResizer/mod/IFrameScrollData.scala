package typings.iframeResizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait IFrameScrollData extends js.Object {
  var x: Double
  var y: Double
}

object IFrameScrollData {
  @scala.inline
  def apply(x: Double, y: Double): IFrameScrollData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFrameScrollData]
  }
}

