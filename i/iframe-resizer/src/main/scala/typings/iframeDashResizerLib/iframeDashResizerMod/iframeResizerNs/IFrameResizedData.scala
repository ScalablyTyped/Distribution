package typings
package iframeDashResizerLib.iframeDashResizerMod.iframeResizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait IFrameResizedData extends js.Object {
  var height: scala.Double
  var iframe: IFrameComponent
  var `type`: java.lang.String
  var width: scala.Double
}

object IFrameResizedData {
  @scala.inline
  def apply(height: scala.Double, iframe: IFrameComponent, `type`: java.lang.String, width: scala.Double): IFrameResizedData = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("iframe")(iframe)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IFrameResizedData]
  }
}

