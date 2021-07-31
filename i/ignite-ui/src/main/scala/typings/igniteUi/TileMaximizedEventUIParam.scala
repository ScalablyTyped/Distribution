package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileMaximizedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the tile manager the maximized tile belongs to.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get the jQuery element of the maximized tile
    */
  var tile: js.UndefOr[js.Any] = js.undefined
}
object TileMaximizedEventUIParam {
  
  @scala.inline
  def apply(): TileMaximizedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMaximizedEventUIParam]
  }
  
  @scala.inline
  implicit class TileMaximizedEventUIParamMutableBuilder[Self <: TileMaximizedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setTile(value: js.Any): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
  }
}
