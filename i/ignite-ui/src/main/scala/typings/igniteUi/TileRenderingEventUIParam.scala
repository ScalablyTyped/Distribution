package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileRenderingEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the tile manager performing rendering.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get a reference to the tile being rendered
    */
  var tile: js.UndefOr[js.Any] = js.undefined
}
object TileRenderingEventUIParam {
  
  inline def apply(): TileRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileRenderingEventUIParam]
  }
  
  extension [Self <: TileRenderingEventUIParam](x: Self) {
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTile(value: js.Any): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
  }
}
