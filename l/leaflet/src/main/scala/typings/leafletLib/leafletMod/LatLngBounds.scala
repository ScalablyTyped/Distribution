package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "LatLngBounds")
@js.native
class LatLngBounds protected () extends js.Object {
  def this(latlngs: LatLngBoundsLiteral) = this()
  def this(southWest: LatLngExpression, northEast: LatLngExpression) = this()
  def contains(otherBoundsOrLatLng: LatLngBoundsExpression | LatLngExpression): scala.Boolean = js.native
  def equals(otherBounds: LatLngBoundsExpression): scala.Boolean = js.native
  def extend(latlngOrBounds: LatLngBoundsExpression | LatLngExpression): this.type = js.native
   // does this modify the current instance or does it return a new one?
  def getCenter(): LatLng = js.native
  def getEast(): scala.Double = js.native
  def getNorth(): scala.Double = js.native
  def getNorthEast(): LatLng = js.native
  def getNorthWest(): LatLng = js.native
  def getSouth(): scala.Double = js.native
  def getSouthEast(): LatLng = js.native
  def getSouthWest(): LatLng = js.native
  def getWest(): scala.Double = js.native
  def intersects(otherBounds: LatLngBoundsExpression): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
  def overlaps(otherBounds: BoundsExpression): scala.Boolean = js.native
  def pad(bufferRatio: scala.Double): LatLngBounds = js.native
   // investigate if this is really bounds and not latlngbounds
  def toBBoxString(): java.lang.String = js.native
}

