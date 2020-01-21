package typings.inboxsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFullscreen extends js.Object {
  var fullscreen: Boolean
}

object AnonFullscreen {
  @scala.inline
  def apply(fullscreen: Boolean): AnonFullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFullscreen]
  }
}

