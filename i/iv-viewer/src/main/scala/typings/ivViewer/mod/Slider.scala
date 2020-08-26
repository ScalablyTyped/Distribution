package typings.ivViewer.mod

import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slider extends js.Object {
  var container: Element | Null = js.native
  def destroy(): Unit = js.native
  def endHandler(): Unit = js.native
  def init(): Unit = js.native
  def isSliderEnabled(): Boolean = js.native
  def moveHandler(event: Event): Unit = js.native
  def onEnd(): Unit = js.native
  def onMove(): Unit = js.native
  def onStart(): Unit = js.native
  def removeListeners(): Unit = js.native
  def startHandler(event: Event): Unit = js.native
}

object Slider {
  @scala.inline
  def apply(
    destroy: () => Unit,
    endHandler: () => Unit,
    init: () => Unit,
    isSliderEnabled: () => Boolean,
    moveHandler: Event => Unit,
    onEnd: () => Unit,
    onMove: () => Unit,
    onStart: () => Unit,
    removeListeners: () => Unit,
    startHandler: Event => Unit
  ): Slider = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), endHandler = js.Any.fromFunction0(endHandler), init = js.Any.fromFunction0(init), isSliderEnabled = js.Any.fromFunction0(isSliderEnabled), moveHandler = js.Any.fromFunction1(moveHandler), onEnd = js.Any.fromFunction0(onEnd), onMove = js.Any.fromFunction0(onMove), onStart = js.Any.fromFunction0(onStart), removeListeners = js.Any.fromFunction0(removeListeners), startHandler = js.Any.fromFunction1(startHandler))
    __obj.asInstanceOf[Slider]
  }
  @scala.inline
  implicit class SliderOps[Self <: Slider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setEndHandler(value: () => Unit): Self = this.set("endHandler", js.Any.fromFunction0(value))
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSliderEnabled(value: () => Boolean): Self = this.set("isSliderEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveHandler(value: Event => Unit): Self = this.set("moveHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setOnEnd(value: () => Unit): Self = this.set("onEnd", js.Any.fromFunction0(value))
    @scala.inline
    def setOnMove(value: () => Unit): Self = this.set("onMove", js.Any.fromFunction0(value))
    @scala.inline
    def setOnStart(value: () => Unit): Self = this.set("onStart", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveListeners(value: () => Unit): Self = this.set("removeListeners", js.Any.fromFunction0(value))
    @scala.inline
    def setStartHandler(value: Event => Unit): Self = this.set("startHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setContainer(value: Element): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
  }
  
}

