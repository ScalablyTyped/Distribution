package typings.materialGridList.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TILESELECTOR extends js.Object {
  
  var TILES_SELECTOR: String = js.native
  
  var TILE_SELECTOR: String = js.native
}
object TILESELECTOR {
  
  @scala.inline
  def apply(TILES_SELECTOR: String, TILE_SELECTOR: String): TILESELECTOR = {
    val __obj = js.Dynamic.literal(TILES_SELECTOR = TILES_SELECTOR.asInstanceOf[js.Any], TILE_SELECTOR = TILE_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[TILESELECTOR]
  }
  
  @scala.inline
  implicit class TILESELECTOROps[Self <: TILESELECTOR] (val x: Self) extends AnyVal {
    
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
    def setTILES_SELECTOR(value: String): Self = this.set("TILES_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTILE_SELECTOR(value: String): Self = this.set("TILE_SELECTOR", value.asInstanceOf[js.Any])
  }
}
