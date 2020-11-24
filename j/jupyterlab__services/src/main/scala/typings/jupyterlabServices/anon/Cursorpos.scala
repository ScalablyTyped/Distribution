package typings.jupyterlabServices.anon

import typings.jupyterlabServices.jupyterlabServicesNumbers.`0`
import typings.jupyterlabServices.jupyterlabServicesNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cursorpos extends js.Object {
  
  var code: String = js.native
  
  var cursor_pos: Double = js.native
  
  var detail_level: `0` | `1` = js.native
}
object Cursorpos {
  
  @scala.inline
  def apply(code: String, cursor_pos: Double, detail_level: `0` | `1`): Cursorpos = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], cursor_pos = cursor_pos.asInstanceOf[js.Any], detail_level = detail_level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursorpos]
  }
  
  @scala.inline
  implicit class CursorposOps[Self <: Cursorpos] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor_pos(value: Double): Self = this.set("cursor_pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail_level(value: `0` | `1`): Self = this.set("detail_level", value.asInstanceOf[js.Any])
  }
}
