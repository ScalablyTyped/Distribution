package typings.leaflet.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "GridLayer")
@js.native
open class GridLayer_ () extends Layer {
  def this(options: GridLayerOptions) = this()
  
  /* protected */ def _tileCoordsToKey(coords: Coords): String = js.native
  
  /* protected */ var _tileZoom: js.UndefOr[Double] = js.native
  
  /* protected */ var _tiles: InternalTiles = js.native
  
  /* protected */ def _wrapCoords(parameter: Coords): Coords = js.native
  
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
