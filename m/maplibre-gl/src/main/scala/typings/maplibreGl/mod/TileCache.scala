package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.maplibreGl.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TileCache")
@js.native
open class TileCache protected () extends StObject {
  /**
  	 * @param {number} max number of permitted values
  	 * @param {Function} onRemove callback called with items when they expire
  	 */
  def this(max: Double, onRemove: js.Function1[/* element */ Tile, scala.Unit]) = this()
  
  def _getAndRemoveByKey(key: String): Tile = js.native
  
  /**
  	 * Add a key, value combination to the cache, trimming its size if this pushes
  	 * it over max length.
  	 *
  	 * @param {OverscaledTileID} tileID lookup key for the item
  	 * @param {*} data any value
  	 *
  	 * @returns {TileCache} this cache
  	 * @private
  	 */
  def add(tileID: OverscaledTileID, data: Tile, expiryTimeout: Double): this.type = js.native
  def add(tileID: OverscaledTileID, data: Tile, expiryTimeout: scala.Unit): this.type = js.native
  
  var data: StringDictionary[js.Array[Timeout]] = js.native
  
  /**
  	 * Remove entries that do not pass a filter function. Used for removing
  	 * stale tiles from the cache.
  	 *
  	 * @param {function} filterFn Determines whether the tile is filtered. If the supplied function returns false, the tile will be filtered out.
  	 */
  def filter(filterFn: js.Function1[/* tile */ Tile, Boolean]): scala.Unit = js.native
  
  /**
  	 * Get the value attached to a specific key without removing data
  	 * from the cache. If the key is not found, returns `null`
  	 *
  	 * @param {OverscaledTileID} tileID the key to look up
  	 * @returns {*} the data, or null if it isn't found
  	 * @private
  	 */
  def get(tileID: OverscaledTileID): Tile = js.native
  
  /**
  	 * Get the value attached to a specific key and remove data from cache.
  	 * If the key is not found, returns `null`
  	 *
  	 * @param {OverscaledTileID} tileID the key to look up
  	 * @returns {*} the data, or null if it isn't found
  	 * @private
  	 */
  def getAndRemove(tileID: OverscaledTileID): Tile = js.native
  
  def getByKey(key: String): Tile = js.native
  
  /**
  	 * Determine whether the value attached to `key` is present
  	 *
  	 * @param {OverscaledTileID} tileID the key to be looked-up
  	 * @returns {boolean} whether the cache has this value
  	 * @private
  	 */
  def has(tileID: OverscaledTileID): Boolean = js.native
  
  var max: Double = js.native
  
  def onRemove(element: Tile): scala.Unit = js.native
  
  var order: js.Array[String] = js.native
  
  /**
  	 * Remove a key/value combination from the cache.
  	 *
  	 * @param {OverscaledTileID} tileID the key for the pair to delete
  	 * @param {Tile} value If a value is provided, remove that exact version of the value.
  	 * @returns {TileCache} this cache
  	 * @private
  	 */
  def remove(tileID: OverscaledTileID): this.type = js.native
  def remove(tileID: OverscaledTileID, value: Timeout): this.type = js.native
  
  /**
  	 * Clear the cache
  	 *
  	 * @returns {TileCache} this cache
  	 * @private
  	 */
  def reset(): this.type = js.native
  
  /**
  	 * Change the max size of the cache.
  	 *
  	 * @param {number} max the max size of the cache
  	 * @returns {TileCache} this cache
  	 * @private
  	 */
  def setMaxSize(max: Double): TileCache = js.native
}
