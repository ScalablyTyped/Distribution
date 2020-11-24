package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileMinimizedEventUIParam extends js.Object {
  
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
  implicit class TileMinimizedEventUIParamOps[Self <: TileMinimizedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setTile(value: js.Any): Self = this.set("tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTile: Self = this.set("tile", js.undefined)
  }
}
