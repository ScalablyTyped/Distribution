package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileMaximizingEventUIParam extends StObject {
  
  /**
    * Used to get reference to the tile that is minimizing simultaneously or null if no tile is minimizing.
    */
  var minimizingTile: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get a reference to the tile manager performing the maximizing the tile belongs to.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get the jQuery element of the tile being maximized
    */
  var tile: js.UndefOr[Any] = js.undefined
}
object TileMaximizingEventUIParam {
  
  inline def apply(): TileMaximizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMaximizingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileMaximizingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setMinimizingTile(value: Any): Self = StObject.set(x, "minimizingTile", value.asInstanceOf[js.Any])
    
    inline def setMinimizingTileUndefined: Self = StObject.set(x, "minimizingTile", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTile(value: Any): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
  }
}
