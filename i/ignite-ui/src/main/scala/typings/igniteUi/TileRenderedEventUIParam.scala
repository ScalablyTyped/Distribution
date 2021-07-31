package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileRenderedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the tile manager performing rendering.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get a reference to the rendered tile
    */
  var tile: js.UndefOr[js.Any] = js.undefined
}
object TileRenderedEventUIParam {
  
  @scala.inline
  def apply(): TileRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileRenderedEventUIParam]
  }
  
  @scala.inline
  implicit class TileRenderedEventUIParamMutableBuilder[Self <: TileRenderedEventUIParam] (val x: Self) extends AnyVal {
    
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
