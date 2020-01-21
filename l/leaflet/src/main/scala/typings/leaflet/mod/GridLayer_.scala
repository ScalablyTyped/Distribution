package typings.leaflet.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "GridLayer")
@js.native
class GridLayer_ () extends Layer {
  def this(options: GridLayerOptions) = this()
  var _tileZoom: js.UndefOr[Double] = js.native
  var _tiles: InternalTiles = js.native
  /* protected */ def _tileCoordsToKey(coords: Coords): String = js.native
  def bringToBack(): this.type = js.native
  def bringToFront(): this.type = js.native
  /* protected */ def createTile(coords: Coords, done: DoneCallback): HTMLElement = js.native
  def getContainer(): HTMLElement | Null = js.native
  def getTileSize(): Point_ = js.native
  def isLoading(): Boolean = js.native
  def redraw(): this.type = js.native
  def setOpacity(opacity: Double): this.type = js.native
  def setZIndex(zIndex: Double): this.type = js.native
}

