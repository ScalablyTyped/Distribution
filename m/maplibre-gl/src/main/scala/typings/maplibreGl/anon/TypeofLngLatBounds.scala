package typings.maplibreGl.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.maplibreGl.mod.LngLatBounds
import typings.maplibreGl.mod.LngLatBoundsLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLngLatBounds
  extends StObject
     with Instantiable0[LngLatBounds]
     with Instantiable1[/* sw */ Any, LngLatBounds]
     with Instantiable2[(/* sw */ Any) | (/* sw */ Unit), /* ne */ Any, LngLatBounds] {
  
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
  def convert(): LngLatBounds = js.native
  def convert(input: LngLatBoundsLike): LngLatBounds = js.native
}
