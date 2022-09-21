package typings.maplibreGl.anon

import org.scalablytyped.runtime.Instantiable2
import typings.maplibreGl.mod.LngLat
import typings.maplibreGl.mod.LngLatLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLngLat
  extends StObject
     with Instantiable2[/* lng */ Double, /* lat */ Double, LngLat] {
  
  /**
  	 * Converts an array of two numbers or an object with `lng` and `lat` or `lon` and `lat` properties
  	 * to a `LngLat` object.
  	 *
  	 * If a `LngLat` object is passed in, the function returns it unchanged.
  	 *
  	 * @param {LngLatLike} input An array of two numbers or object to convert, or a `LngLat` object to return.
  	 * @returns {LngLat} A new `LngLat` object, if a conversion occurred, or the original `LngLat` object.
  	 * @example
  	 * var arr = [-73.9749, 40.7736];
  	 * var ll = maplibregl.LngLat.convert(arr);
  	 * ll;   // = LngLat {lng: -73.9749, lat: 40.7736}
  	 */
  def convert(input: LngLatLike): LngLat = js.native
}
