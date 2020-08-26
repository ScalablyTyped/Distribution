package typings.materialGridList.adapterMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCGridListAdapter extends js.Object {
  def deregisterResizeHandler(handler: EventListener): Unit = js.native
  def getNumberOfTiles(): Double = js.native
  def getOffsetWidth(): Double = js.native
  def getOffsetWidthForTileAtIndex(index: Double): Double = js.native
  def registerResizeHandler(handler: EventListener): Unit = js.native
  def setStyleForTilesElement(property: String, value: String): Unit = js.native
}

object MDCGridListAdapter {
  @scala.inline
  def apply(
    deregisterResizeHandler: EventListener => Unit,
    getNumberOfTiles: () => Double,
    getOffsetWidth: () => Double,
    getOffsetWidthForTileAtIndex: Double => Double,
    registerResizeHandler: EventListener => Unit,
    setStyleForTilesElement: (String, String) => Unit
  ): MDCGridListAdapter = {
    val __obj = js.Dynamic.literal(deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), getNumberOfTiles = js.Any.fromFunction0(getNumberOfTiles), getOffsetWidth = js.Any.fromFunction0(getOffsetWidth), getOffsetWidthForTileAtIndex = js.Any.fromFunction1(getOffsetWidthForTileAtIndex), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), setStyleForTilesElement = js.Any.fromFunction2(setStyleForTilesElement))
    __obj.asInstanceOf[MDCGridListAdapter]
  }
  @scala.inline
  implicit class MDCGridListAdapterOps[Self <: MDCGridListAdapter] (val x: Self) extends AnyVal {
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
    def setDeregisterResizeHandler(value: EventListener => Unit): Self = this.set("deregisterResizeHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setGetNumberOfTiles(value: () => Double): Self = this.set("getNumberOfTiles", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOffsetWidth(value: () => Double): Self = this.set("getOffsetWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOffsetWidthForTileAtIndex(value: Double => Double): Self = this.set("getOffsetWidthForTileAtIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterResizeHandler(value: EventListener => Unit): Self = this.set("registerResizeHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStyleForTilesElement(value: (String, String) => Unit): Self = this.set("setStyleForTilesElement", js.Any.fromFunction2(value))
  }
  
}

