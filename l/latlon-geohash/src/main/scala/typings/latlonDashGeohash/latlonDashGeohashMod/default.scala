package typings.latlonDashGeohash.latlonDashGeohashMod

import typings.latlonDashGeohash.latlonDashGeohashMod.Geohash.Bounds
import typings.latlonDashGeohash.latlonDashGeohashMod.Geohash.Direction
import typings.latlonDashGeohash.latlonDashGeohashMod.Geohash.Neighbours
import typings.latlonDashGeohash.latlonDashGeohashMod.Geohash.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("latlon-geohash", JSImport.Default)
@js.native
object default extends js.Object {
  def adjacent(geohash: String, direction: String): String = js.native
  /**
    * Determines adjacent cell in given direction.
    *
    * @param   geohash - Cell to which adjacent cell is required.
    * @param   direction - Direction from geohash (N/S/E/W).
    * @returns Geocode of adjacent cell.
    * @throws  Invalid geohash.
    */
  def adjacent(geohash: String, direction: Direction): String = js.native
  /**
    * Returns SW/NE latitude/longitude bounds of specified geohash.
    *
    * @param   geohash - Cell that bounds are required of.
    * @returns The Bounds
    * @throws  Invalid geohash.
    */
  def bounds(geohash: String): Bounds = js.native
  /**
    * Decode geohash to latitude/longitude (location is approximate centre of geohash cell,
    *     to reasonable precision).
    *
    * @param   geohash - Geohash string to be converted to latitude/longitude.
    * @returns (Center of) geohashed location.
    * @throws  Invalid geohash.
    *
    * @example
    *     var latlon = Geohash.decode('u120fxw'); // latlon: { lat: 52.205, lon: 0.1188 }
    */
  def decode(geohash: String): Point = js.native
  /**
    * Encodes latitude/longitude to geohash, either to specified precision or to automatically
    * evaluated precision.
    *
    * @param   lat - Latitude in degrees.
    * @param   lon - Longitude in degrees.
    * @param   [precision] - Number of characters in resulting geohash.
    * @returns Geohash of supplied latitude/longitude.
    * @throws  Invalid geohash.
    *
    * @example
    *     var geohash = Geohash.encode(52.205, 0.119, 7); // geohash: 'u120fxw'
    */
  def encode(latitude: Double, longitude: Double): String = js.native
  def encode(latitude: Double, longitude: Double, precision: Double): String = js.native
  /**
    * Returns all 8 adjacent cells to specified geohash.
    *
    * @param   geohash - Geohash neighbours are required of.
    * @returns The neighbours
    * @throws  Invalid geohash.
    */
  def neighbours(geohash: String): Neighbours = js.native
  @js.native
  object Direction extends js.Object {
    /* "E" */ val East: typings.latlonDashGeohash.latlonDashGeohashMod.Geohash.Direction.East with String = js.native
    /* "N" */ val North: typings.latlonDashGeohash.latlonDashGeohashMod.Geohash.Direction.North with String = js.native
    /* "S" */ val South: typings.latlonDashGeohash.latlonDashGeohashMod.Geohash.Direction.South with String = js.native
    /* "W" */ val West: typings.latlonDashGeohash.latlonDashGeohashMod.Geohash.Direction.West with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.latlonDashGeohash.latlonDashGeohashMod.Geohash.Direction with String] = js.native
  }
  
}

