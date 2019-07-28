package typings.latlonDashGeohash.latlonDashGeohashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("latlon-geohash", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def adjacent(geohash: String, direction: String): String = js.native
  def adjacent(geohash: String, direction: Direction): String = js.native
  def bounds(geohash: String): Bounds = js.native
  def decode(geohash: String): Point = js.native
  def encode(latitude: Double, longitude: Double): String = js.native
  def encode(latitude: Double, longitude: Double, precision: Double): String = js.native
  def neighbours(geohash: String): Neighbours = js.native
}

