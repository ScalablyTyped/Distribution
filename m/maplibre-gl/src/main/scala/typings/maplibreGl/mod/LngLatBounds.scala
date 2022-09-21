package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "LngLatBounds")
@js.native
open class LngLatBounds () extends StObject {
  def this(sw: Any) = this()
  def this(sw: Any, ne: Any) = this()
  def this(sw: scala.Unit, ne: Any) = this()
  
  var _ne: LngLat = js.native
  
  var _sw: LngLat = js.native
  
  /**
  	 * Check if the point is within the bounding box.
  	 *
  	 * @param {LngLatLike} lnglat geographic point to check against.
  	 * @returns {boolean} True if the point is within the bounding box.
  	 * @example
  	 * var llb = new maplibregl.LngLatBounds(
  	 *   new maplibregl.LngLat(-73.9876, 40.7661),
  	 *   new maplibregl.LngLat(-73.9397, 40.8002)
  	 * );
  	 *
  	 * var ll = new maplibregl.LngLat(-73.9567, 40.7789);
  	 *
  	 * console.log(llb.contains(ll)); // = true
  	 */
  def contains(lnglat: LngLatLike): Boolean = js.native
  
  /**
  	 * Extend the bounds to include a given LngLatLike or LngLatBoundsLike.
  	 *
  	 * @param {LngLatLike|LngLatBoundsLike} obj object to extend to
  	 * @returns {LngLatBounds} `this`
  	 */
  def extend(obj: LngLatBoundsLike | LngLatLike): Any = js.native
  
  /**
  	 * Returns the geographical coordinate equidistant from the bounding box's corners.
  	 *
  	 * @returns {LngLat} The bounding box's center.
  	 * @example
  	 * var llb = new maplibregl.LngLatBounds([-73.9876, 40.7661], [-73.9397, 40.8002]);
  	 * llb.getCenter(); // = LngLat {lng: -73.96365, lat: 40.78315}
  	 */
  def getCenter(): LngLat = js.native
  
  /**
  	 * Returns the east edge of the bounding box.
  	 *
  	 * @returns {number} The east edge of the bounding box.
  	 */
  def getEast(): Double = js.native
  
  /**
  	 * Returns the north edge of the bounding box.
  	 *
  	 * @returns {number} The north edge of the bounding box.
  	 */
  def getNorth(): Double = js.native
  
  /**
  	 * Returns the northeast corner of the bounding box.
  	 *
  	 * @returns {LngLat} The northeast corner of the bounding box.
  	 */
  def getNorthEast(): LngLat = js.native
  
  /**
  	 * Returns the northwest corner of the bounding box.
  	 *
  	 * @returns {LngLat} The northwest corner of the bounding box.
  	 */
  def getNorthWest(): LngLat = js.native
  
  /**
  	 * Returns the south edge of the bounding box.
  	 *
  	 * @returns {number} The south edge of the bounding box.
  	 */
  def getSouth(): Double = js.native
  
  /**
  	 * Returns the southeast corner of the bounding box.
  	 *
  	 * @returns {LngLat} The southeast corner of the bounding box.
  	 */
  def getSouthEast(): LngLat = js.native
  
  /**
  	 * Returns the southwest corner of the bounding box.
  	 *
  	 * @returns {LngLat} The southwest corner of the bounding box.
  	 */
  def getSouthWest(): LngLat = js.native
  
  /**
  	 * Returns the west edge of the bounding box.
  	 *
  	 * @returns {number} The west edge of the bounding box.
  	 */
  def getWest(): Double = js.native
  
  /**
  	 * Check if the bounding box is an empty/`null`-type box.
  	 *
  	 * @returns {boolean} True if bounds have been defined, otherwise false.
  	 */
  def isEmpty(): Boolean = js.native
  
  /**
  	 * Set the northeast corner of the bounding box
  	 *
  	 * @param {LngLatLike} ne a {@link LngLatLike} object describing the northeast corner of the bounding box.
  	 * @returns {LngLatBounds} `this`
  	 */
  def setNorthEast(ne: LngLatLike): this.type = js.native
  
  /**
  	 * Set the southwest corner of the bounding box
  	 *
  	 * @param {LngLatLike} sw a {@link LngLatLike} object describing the southwest corner of the bounding box.
  	 * @returns {LngLatBounds} `this`
  	 */
  def setSouthWest(sw: LngLatLike): this.type = js.native
  
  /**
  	 * Returns the bounding box represented as an array.
  	 *
  	 * @returns {Array<Array<number>>} The bounding box represented as an array, consisting of the
  	 *   southwest and northeast coordinates of the bounding represented as arrays of numbers.
  	 * @example
  	 * var llb = new maplibregl.LngLatBounds([-73.9876, 40.7661], [-73.9397, 40.8002]);
  	 * llb.toArray(); // = [[-73.9876, 40.7661], [-73.9397, 40.8002]]
  	 */
  def toArray(): js.Array[js.Array[Double]] = js.native
}
/* static members */
object LngLatBounds {
  
  @JSImport("maplibre-gl", "LngLatBounds")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	 * Converts an array to a `LngLatBounds` object.
  	 *
  	 * If a `LngLatBounds` object is passed in, the function returns it unchanged.
  	 *
  	 * Internally, the function calls `LngLat#convert` to convert arrays to `LngLat` values.
  	 *
  	 * @param {LngLatBoundsLike} input An array of two coordinates to convert, or a `LngLatBounds` object to return.
  	 * @returns {LngLatBounds} A new `LngLatBounds` object, if a conversion occurred, or the original `LngLatBounds` object.
  	 * @example
  	 * var arr = [[-73.9876, 40.7661], [-73.9397, 40.8002]];
  	 * var llb = maplibregl.LngLatBounds.convert(arr);
  	 * llb;   // = LngLatBounds {_sw: LngLat {lng: -73.9876, lat: 40.7661}, _ne: LngLat {lng: -73.9397, lat: 40.8002}}
  	 */
  inline def convert(): LngLatBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")().asInstanceOf[LngLatBounds]
  inline def convert(input: LngLatBoundsLike): LngLatBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(input.asInstanceOf[js.Any]).asInstanceOf[LngLatBounds]
}
