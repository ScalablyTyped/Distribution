package typings
package atMaterialGridDashListLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCGridListAdapter extends js.Object {
  def deregisterResizeHandler(handler: stdLib.EventListener): scala.Unit
  def getNumberOfTiles(): scala.Double
  def getOffsetWidth(): scala.Double
  def getOffsetWidthForTileAtIndex(index: scala.Double): scala.Double
  def registerResizeHandler(handler: stdLib.EventListener): scala.Unit
  def setStyleForTilesElement(property: java.lang.String, value: java.lang.String): scala.Unit
}

object MDCGridListAdapter {
  @scala.inline
  def apply(
    deregisterResizeHandler: stdLib.EventListener => scala.Unit,
    getNumberOfTiles: () => scala.Double,
    getOffsetWidth: () => scala.Double,
    getOffsetWidthForTileAtIndex: scala.Double => scala.Double,
    registerResizeHandler: stdLib.EventListener => scala.Unit,
    setStyleForTilesElement: (java.lang.String, java.lang.String) => scala.Unit
  ): MDCGridListAdapter = {
    val __obj = js.Dynamic.literal(deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), getNumberOfTiles = js.Any.fromFunction0(getNumberOfTiles), getOffsetWidth = js.Any.fromFunction0(getOffsetWidth), getOffsetWidthForTileAtIndex = js.Any.fromFunction1(getOffsetWidthForTileAtIndex), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), setStyleForTilesElement = js.Any.fromFunction2(setStyleForTilesElement))
  
    __obj.asInstanceOf[MDCGridListAdapter]
  }
}

