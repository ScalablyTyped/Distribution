package typings.iframeResizer.mod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFrameResizedData]
  }
}

