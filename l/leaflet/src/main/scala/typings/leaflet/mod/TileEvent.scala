package typings.leaflet.mod

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileEvent
  extends StObject
     with LeafletEvent {
  
  var coords: Coords
  
  var tile: HTMLImageElement
}
object TileEvent {
  
  @scala.inline
  def apply(
    coords: Coords,
    layer: js.Any,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    tile: HTMLImageElement,
    `type`: String
  ): TileEvent = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileEvent]
  }
  
  @scala.inline
  implicit class TileEventMutableBuilder[Self <: TileEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoords(value: Coords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTile(value: HTMLImageElement): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
  }
}
