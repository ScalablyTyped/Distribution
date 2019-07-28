package typings.atMaterialGridDashList.adapterMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCGridListAdapter extends js.Object {
  def deregisterResizeHandler(handler: EventListener): Unit
  def getNumberOfTiles(): Double
  def getOffsetWidth(): Double
  def getOffsetWidthForTileAtIndex(index: Double): Double
  def registerResizeHandler(handler: EventListener): Unit
  def setStyleForTilesElement(property: String, value: String): Unit
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
}

