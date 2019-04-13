package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "LngLatBounds")
@js.native
class LngLatBounds () extends js.Object {
  def this(boundsLike: js.Tuple2[LngLatLike, LngLatLike]) = this()
  def this(boundsLike: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) = this()
  def this(sw: LngLatLike, ne: LngLatLike) = this()
  @JSName("ne")
  var ne_FLngLatBounds: LngLatLike = js.native
  var sw: LngLatLike = js.native
  /** Extend the bounds to include a given LngLat or LngLatBounds. */
  def extend(obj: LngLat): this.type = js.native
  def extend(obj: LngLatBounds): this.type = js.native
  /** Get the point equidistant from this box's corners */
  def getCenter(): LngLat = js.native
  /** Get east edge longitude */
  def getEast(): scala.Double = js.native
  /** Get north edge latitude */
  def getNorth(): scala.Double = js.native
  /** Get northeast corner */
  def getNorthEast(): LngLat = js.native
  /** Get northwest corner */
  def getNorthWest(): LngLat = js.native
  /** Get south edge latitude */
  def getSouth(): scala.Double = js.native
  /** Get southeast corner */
  def getSouthEast(): LngLat = js.native
  /** Get southwest corner */
  def getSouthWest(): LngLat = js.native
  /** Get west edge longitude */
  def getWest(): scala.Double = js.native
  /** Returns a boolean */
  def isEmpty(): scala.Boolean = js.native
  def setNorthEast(ne: LngLatLike): this.type = js.native
  def setSouthWest(sw: LngLatLike): this.type = js.native
  /** Returns a LngLatBounds as an array */
  def toArray(): js.Array[js.Array[scala.Double]] = js.native
}

/* static members */
@JSImport("mapbox-gl", "LngLatBounds")
@js.native
object LngLatBounds extends js.Object {
  /** Convert an array to a LngLatBounds object, or return an existing LngLatBounds object unchanged. */
  def convert(input: mapboxDashGlLib.mapboxDashGlMod.LngLatBoundsLike): mapboxDashGlLib.mapboxDashGlMod.LngLatBounds = js.native
}

