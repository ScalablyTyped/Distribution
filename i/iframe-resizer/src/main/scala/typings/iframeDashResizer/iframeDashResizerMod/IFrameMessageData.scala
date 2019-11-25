package typings.iframeDashResizer.iframeDashResizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait IFrameMessageData extends js.Object {
  var iframe: IFrameComponent
  var message: js.Any
}

object IFrameMessageData {
  @scala.inline
  def apply(iframe: IFrameComponent, message: js.Any): IFrameMessageData = {
    val __obj = js.Dynamic.literal(iframe = iframe.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFrameMessageData]
  }
}

