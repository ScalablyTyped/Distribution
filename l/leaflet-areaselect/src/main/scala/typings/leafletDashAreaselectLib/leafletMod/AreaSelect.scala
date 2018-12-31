package typings
package leafletDashAreaselectLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaSelect extends js.Object {
  def addTo(map: leafletLib.leafletMod.Map): leafletLib.leafletMod.Map
  def getBounds(): leafletLib.leafletMod.LatLngBounds
  def remove(): scala.Unit
  def setDimensions(dim: Dimension): scala.Unit
}

