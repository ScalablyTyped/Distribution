package typings.leafletFullscreen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map extends js.Object {
  def toggleFullScreen(): Unit
}

object Map {
  @scala.inline
  def apply(toggleFullScreen: () => Unit): Map = {
    val __obj = js.Dynamic.literal(toggleFullScreen = js.Any.fromFunction0(toggleFullScreen))
  
    __obj.asInstanceOf[Map]
  }
}

