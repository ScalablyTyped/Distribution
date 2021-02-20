package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileMinimizedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the tile manager the minimized tile belongs to.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get the jQuery element of the minimized tile
    */
  var tile: js.UndefOr[js.Any] = js.native
}
object TileMinimizedEventUIParam {
  
  @scala.inline
  def apply(): TileMinimizedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMinimizedEventUIParam]
  }
  
  @scala.inline
  implicit class TileMinimizedEventUIParamMutableBuilder[Self <: TileMinimizedEventUIParam] (val x: Self) extends AnyVal {
    
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
