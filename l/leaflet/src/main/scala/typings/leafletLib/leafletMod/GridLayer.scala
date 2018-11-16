package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "GridLayer")
@js.native
class GridLayer () extends Layer {
  def this(options: GridLayerOptions) = this()
  var _tileZoom: js.UndefOr[scala.Double] = js.native
  var _tiles: InternalTiles = js.native
  /* protected */ def _tileCoordsToKey(coords: Coords): java.lang.String = js.native
  def bringToBack(): this.type = js.native
  def bringToFront(): this.type = js.native
  /* protected */ def createTile(coords: Coords, done: DoneCallback): stdLib.HTMLElement = js.native
  def getContainer(): stdLib.HTMLElement | scala.Null = js.native
  def getTileSize(): Point = js.native
  def isLoading(): scala.Boolean = js.native
  def redraw(): this.type = js.native
  def setOpacity(opacity: scala.Double): this.type = js.native
  def setZIndex(zIndex: scala.Double): this.type = js.native
}

