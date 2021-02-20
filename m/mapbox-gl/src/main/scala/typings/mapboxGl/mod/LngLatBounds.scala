package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "LngLatBounds")
@js.native
class LngLatBounds () extends _LngLatBoundsLike {
  def this(boundsLike: js.Tuple2[LngLatLike, LngLatLike]) = this()
  def this(boundsLike: js.Tuple4[Double, Double, Double, Double]) = this()
  def this(sw: LngLatLike, ne: LngLatLike) = this()
  
  /** Check if the point is within the bounding box. */
  def contains(lnglat: LngLatLike): Boolean = js.native
  
  /** Extend the bounds to include a given LngLat or LngLatBounds. */
  def extend(obj: LngLatBoundsLike | LngLatLike): this.type = js.native
  
  /** Get the point equidistant from this box's corners */
  def getCenter(): LngLat = js.native
  
  /** Get east edge longitude */
  def getEast(): Double = js.native
  
  /** Get north edge latitude */
  def getNorth(): Double = js.native
  
  /** Get northeast corner */
  def getNorthEast(): LngLat = js.native
  
  /** Get northwest corner */
  def getNorthWest(): LngLat = js.native
  
  /** Get south edge latitude */
  def getSouth(): Double = js.native
  
  /** Get southeast corner */
  def getSouthEast(): LngLat = js.native
  
  /** Get southwest corner */
  def getSouthWest(): LngLat = js.native
  
  /** Get west edge longitude */
  def getWest(): Double = js.native
  
  /** Returns a boolean */
  def isEmpty(): Boolean = js.native
  
  @JSName("ne")
  var ne_FLngLatBounds: LngLatLike = js.native
  
  def setNorthEast(ne: LngLatLike): this.type = js.native
  
  def setSouthWest(sw: LngLatLike): this.type = js.native
  
  var sw: LngLatLike = js.native
  
  /** Returns a LngLatBounds as an array */
  def toArray(): js.Array[js.Array[Double]] = js.native
}
/* static members */
object LngLatBounds {
  
  /** Convert an array to a LngLatBounds object, or return an existing LngLatBounds object unchanged. */
  @JSImport("mapbox-gl", "LngLatBounds.convert")
  @js.native
  def convert(input: LngLatBoundsLike): LngLatBounds = js.native
}
