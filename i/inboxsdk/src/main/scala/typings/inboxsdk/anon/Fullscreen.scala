package typings.inboxsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fullscreen extends js.Object {
  var fullscreen: Boolean
}

object Fullscreen {
  @scala.inline
  def apply(fullscreen: Boolean): Fullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fullscreen]
  }
}

