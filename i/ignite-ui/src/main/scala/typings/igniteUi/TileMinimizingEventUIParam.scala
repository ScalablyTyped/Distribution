package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileMinimizingEventUIParam extends StObject {
  
  /**
    * Used to get reference to the tile that is maximizing simultaneously or null if no tile is maximizing.
    */
  var maximizingTile: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get a reference to the tile manager performing the minimizing the tile belongs to.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get the jQuery element of the tile being minimized
    */
  var tile: js.UndefOr[Any] = js.undefined
}
object TileMinimizingEventUIParam {
  
  inline def apply(): TileMinimizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMinimizingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileMinimizingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setMaximizingTile(value: Any): Self = StObject.set(x, "maximizingTile", value.asInstanceOf[js.Any])
    
    inline def setMaximizingTileUndefined: Self = StObject.set(x, "maximizingTile", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTile(value: Any): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
  }
}
