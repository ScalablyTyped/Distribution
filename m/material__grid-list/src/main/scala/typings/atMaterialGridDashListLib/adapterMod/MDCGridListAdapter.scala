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

