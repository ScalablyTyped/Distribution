package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileMinimizedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the tile manager the minimized tile belongs to.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get the jQuery element of the minimized tile
    */
  var tile: js.UndefOr[Any] = js.undefined
}
object TileMinimizedEventUIParam {
  
  inline def apply(): TileMinimizedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMinimizedEventUIParam]
  }
  
  extension [Self <: TileMinimizedEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTile(value: Any): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
  }
}
