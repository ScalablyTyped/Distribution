package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileMaximizedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the tile manager the maximized tile belongs to.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get the jQuery element of the maximized tile
    */
  var tile: js.UndefOr[Any] = js.undefined
}
object TileMaximizedEventUIParam {
  
  inline def apply(): TileMaximizedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMaximizedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileMaximizedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTile(value: Any): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
  }
}
