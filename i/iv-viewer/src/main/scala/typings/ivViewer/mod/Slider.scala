package typings.ivViewer.mod

import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slider extends js.Object {
  var container: Element | Null
  def destroy(): Unit
  def endHandler(): Unit
  def init(): Unit
  def isSliderEnabled(): Boolean
  def moveHandler(event: Event_): Unit
  def onEnd(): Unit
  def onMove(): Unit
  def onStart(): Unit
  def removeListeners(): Unit
  def startHandler(event: Event_): Unit
}

object Slider {
  @scala.inline
  def apply(
    destroy: () => Unit,
    endHandler: () => Unit,
    init: () => Unit,
    isSliderEnabled: () => Boolean,
    moveHandler: Event_ => Unit,
    onEnd: () => Unit,
    onMove: () => Unit,
    onStart: () => Unit,
    removeListeners: () => Unit,
    startHandler: Event_ => Unit,
    container: Element = null
  ): Slider = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), endHandler = js.Any.fromFunction0(endHandler), init = js.Any.fromFunction0(init), isSliderEnabled = js.Any.fromFunction0(isSliderEnabled), moveHandler = js.Any.fromFunction1(moveHandler), onEnd = js.Any.fromFunction0(onEnd), onMove = js.Any.fromFunction0(onMove), onStart = js.Any.fromFunction0(onStart), removeListeners = js.Any.fromFunction0(removeListeners), startHandler = js.Any.fromFunction1(startHandler))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slider]
  }
}

