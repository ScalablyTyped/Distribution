package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileMinimizingEventUIParam extends StObject {
  
  /**
    * Used to get reference to the tile that is maximizing simultaneously or null if no tile is maximizing.
    */
  var maximizingTile: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get a reference to the tile manager performing the minimizing the tile belongs to.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get the jQuery element of the tile being minimized
    */
  var tile: js.UndefOr[js.Any] = js.undefined
}
object TileMinimizingEventUIParam {
  
  inline def apply(): TileMinimizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMinimizingEventUIParam]
  }
  
  extension [Self <: TileMinimizingEventUIParam](x: Self) {
    
    inline def setMaximizingTile(value: js.Any): Self = StObject.set(x, "maximizingTile", value.asInstanceOf[js.Any])
    
    inline def setMaximizingTileUndefined: Self = StObject.set(x, "maximizingTile", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTile(value: js.Any): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
  }
}
