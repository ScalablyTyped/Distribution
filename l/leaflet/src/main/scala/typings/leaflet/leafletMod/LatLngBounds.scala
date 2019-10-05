package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "LatLngBounds")
@js.native
class LatLngBounds protected () extends js.Object {
  def this(latlngs: LatLngBoundsLiteral) = this()
  def this(southWest: LatLngExpression, northEast: LatLngExpression) = this()
  def contains(otherBoundsOrLatLng: LatLngBoundsExpression | LatLngExpression): Boolean = js.native
  def equals(otherBounds: LatLngBoundsExpression): Boolean = js.native
  def extend(latlngOrBounds: LatLngBoundsExpression | LatLngExpression): this.type = js.native
   // does this modify the current instance or does it return a new one?
  def getCenter(): LatLng = js.native
  def getEast(): Double = js.native
  def getNorth(): Double = js.native
  def getNorthEast(): LatLng = js.native
  def getNorthWest(): LatLng = js.native
  def getSouth(): Double = js.native
  def getSouthEast(): LatLng = js.native
  def getSouthWest(): LatLng = js.native
  def getWest(): Double = js.native
  def intersects(otherBounds: LatLngBoundsExpression): Boolean = js.native
  def isValid(): Boolean = js.native
  def overlaps(otherBounds: BoundsExpression): Boolean = js.native
  def pad(bufferRatio: Double): LatLngBounds = js.native
   // investigate if this is really bounds and not latlngbounds
  def toBBoxString(): String = js.native
}

@JSImport("leaflet", "latLngBounds")
@js.native
object latLngBounds extends js.Object {
  def apply(latlngs: js.Array[LatLngExpression]): LatLngBounds = js.native
  def apply(southWest: LatLngExpression, northEast: LatLngExpression): LatLngBounds = js.native
}

