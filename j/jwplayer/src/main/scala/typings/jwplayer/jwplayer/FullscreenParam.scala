package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullscreenParam extends js.Object {
  var fullscreen: Boolean
}

object FullscreenParam {
  @scala.inline
  def apply(fullscreen: Boolean): FullscreenParam = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FullscreenParam]
  }
}

