package typings.iframeDashResizer.iframeDashResizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait IFrameResizedData extends js.Object {
  var height: Double
  var iframe: IFrameComponent
  var `type`: String
  var width: Double
}

object IFrameResizedData {
  @scala.inline
  def apply(height: Double, iframe: IFrameComponent, `type`: String, width: Double): IFrameResizedData = {
    val __obj = js.Dynamic.literal(height = height, iframe = iframe, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IFrameResizedData]
  }
}

