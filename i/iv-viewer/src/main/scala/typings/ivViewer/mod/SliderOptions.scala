package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderOptions extends js.Object {
  def isSliderEnabled(): Boolean
  def onEnd(): Unit
  def onMove(): Unit
  def onStart(): Unit
}

object SliderOptions {
  @scala.inline
  def apply(isSliderEnabled: () => Boolean, onEnd: () => Unit, onMove: () => Unit, onStart: () => Unit): SliderOptions = {
    val __obj = js.Dynamic.literal(isSliderEnabled = js.Any.fromFunction0(isSliderEnabled), onEnd = js.Any.fromFunction0(onEnd), onMove = js.Any.fromFunction0(onMove), onStart = js.Any.fromFunction0(onStart))
    __obj.asInstanceOf[SliderOptions]
  }
}

