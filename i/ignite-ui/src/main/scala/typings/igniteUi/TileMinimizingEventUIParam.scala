package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileMinimizingEventUIParam extends StObject {
  
  /**
    * Used to get reference to the tile that is maximizing simultaneously or null if no tile is maximizing.
    */
  var maximizingTile: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get a reference to the tile manager performing the minimizing the tile belongs to.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get the jQuery element of the tile being minimized
    */
  var tile: js.UndefOr[js.Any] = js.native
}
object TileMinimizingEventUIParam {
  
  @scala.inline
  def apply(): TileMinimizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMinimizingEventUIParam]
  }
  
  @scala.inline
  implicit class TileMinimizingEventUIParamMutableBuilder[Self <: TileMinimizingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximizingTile(value: js.Any): Self = StObject.set(x, "maximizingTile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximizingTileUndefined: Self = StObject.set(x, "maximizingTile", js.undefined)
    
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
