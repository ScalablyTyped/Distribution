package typings.leafletFullscreen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoFullscreen extends js.Object {
  var pseudoFullscreen: Boolean
}

object PseudoFullscreen {
  @scala.inline
  def apply(pseudoFullscreen: Boolean): PseudoFullscreen = {
    val __obj = js.Dynamic.literal(pseudoFullscreen = pseudoFullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoFullscreen]
  }
}

