package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileMaximizingEventUIParam extends StObject {
  
  /**
    * Used to get reference to the tile that is minimizing simultaneously or null if no tile is minimizing.
    */
  var minimizingTile: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get a reference to the tile manager performing the maximizing the tile belongs to.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get the jQuery element of the tile being maximized
    */
  var tile: js.UndefOr[js.Any] = js.undefined
}
object TileMaximizingEventUIParam {
  
  @scala.inline
  def apply(): TileMaximizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMaximizingEventUIParam]
  }
  
  @scala.inline
  implicit class TileMaximizingEventUIParamMutableBuilder[Self <: TileMaximizingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinimizingTile(value: js.Any): Self = StObject.set(x, "minimizingTile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimizingTileUndefined: Self = StObject.set(x, "minimizingTile", js.undefined)
    
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
