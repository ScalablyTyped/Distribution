package typings.heremaps.H.map.provider

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TileProvider is an abstract class to provide data on a tile basis
  * @property requestTile {} - Request data on a tile basis
  * @property cancelTile {} - Cancels tile from being requested using x, y, z coordinates (column, row, zoom)
  * @property cancelTileByKey {} - Cancels tile from being requested using a tile-key
  * @property uri {string} - This provider&#x27;s unique resource identifier, if not provided at construction time it defaults to provider&#x27;s uid
  * @property min {number} - Minimum zoom level at which provider can serve data, set at construction time
  * @property max {number} - Maximum zoom level at which provider can server data, set at construction time
  * @property uid {string} - Provider instance unique identifier, generated at construction time
  */
@js.native
trait TileProvider_ extends Provider {
  var cancelTile: js.Any = js.native
  var cancelTileByKey: js.Any = js.native
  var requestTile: js.Any = js.native
  def createTileInternal(x: Double, y: Double, z: Double, data: HTMLCanvasElement): Tile = js.native
  def createTileInternal(x: Double, y: Double, z: Double, data: HTMLCanvasElement, opt_options: StringDictionary[js.Any]): Tile = js.native
  /**
    * This method creates a tile object with given parameters
    * @param x {number} - x tile coordinate (row)
    * @param y {number} - y tile coordinate (column)
    * @param z {number} - tile coordinate (zoom)
    * @param data {(HTMLImageElement | HTMLCanvasElement)} - data for the tile
    * @param opt_options {Object<string, *>=} - free form options object. These options are meant to be used in tile specific rendering cases
    * @returns {H.map.provider.Tile}
    */
  def createTileInternal(x: Double, y: Double, z: Double, data: HTMLImageElement): Tile = js.native
  def createTileInternal(x: Double, y: Double, z: Double, data: HTMLImageElement, opt_options: StringDictionary[js.Any]): Tile = js.native
  /**
    * This method creates a tile key consisting of the provider&#x27;s uri, and the tile&#x27;s x, y and z coordinates, seperated by underscores e.g.: &quot;4711_7_42_23&quot;
    * @param x {number} - The x tile coordinate (row)
    * @param y {number} - The y tile coordinate (column)
    * @param z {number} - The z tile coordinate (zoom level)
    * @returns {string} - string
    */
  def getTileKey(x: Double, y: Double, z: Double): String = js.native
}

