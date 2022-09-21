package typings.maplibreGl.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.maplibreGl.mod.LngLatLike
import typings.maplibreGl.mod.MercatorCoordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMercatorCoordinate
  extends StObject
     with Instantiable2[/* x */ Double, /* y */ Double, MercatorCoordinate]
     with Instantiable3[/* x */ Double, /* y */ Double, /* z */ Double, MercatorCoordinate] {
  
  /**
  	 * Project a `LngLat` to a `MercatorCoordinate`.
  	 *
  	 * @param {LngLatLike} lngLatLike The location to project.
  	 * @param {number} altitude The altitude in meters of the position.
  	 * @returns {MercatorCoordinate} The projected mercator coordinate.
  	 * @example
  	 * var coord = maplibregl.MercatorCoordinate.fromLngLat({ lng: 0, lat: 0}, 0);
  	 * coord; // MercatorCoordinate(0.5, 0.5, 0)
  	 */
  def fromLngLat(lngLatLike: LngLatLike): MercatorCoordinate = js.native
  def fromLngLat(lngLatLike: LngLatLike, altitude: Double): MercatorCoordinate = js.native
}
