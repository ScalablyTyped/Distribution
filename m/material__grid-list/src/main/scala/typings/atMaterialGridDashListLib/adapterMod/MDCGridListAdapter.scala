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
    deregisterResizeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    getNumberOfTiles: js.Function0[scala.Double],
    getOffsetWidth: js.Function0[scala.Double],
    getOffsetWidthForTileAtIndex: js.Function1[scala.Double, scala.Double],
    registerResizeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    setStyleForTilesElement: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): MDCGridListAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deregisterResizeHandler")(deregisterResizeHandler)
    __obj.updateDynamic("getNumberOfTiles")(getNumberOfTiles)
    __obj.updateDynamic("getOffsetWidth")(getOffsetWidth)
    __obj.updateDynamic("getOffsetWidthForTileAtIndex")(getOffsetWidthForTileAtIndex)
    __obj.updateDynamic("registerResizeHandler")(registerResizeHandler)
    __obj.updateDynamic("setStyleForTilesElement")(setStyleForTilesElement)
    __obj.asInstanceOf[MDCGridListAdapter]
  }
}

