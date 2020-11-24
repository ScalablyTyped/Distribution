package typings.materialRipple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VARFGSCALE extends js.Object {
  
  var VAR_FG_SCALE: String = js.native
  
  var VAR_FG_SIZE: String = js.native
  
  var VAR_FG_TRANSLATE_END: String = js.native
  
  var VAR_FG_TRANSLATE_START: String = js.native
  
  var VAR_LEFT: String = js.native
  
  var VAR_TOP: String = js.native
}
object VARFGSCALE {
  
  @scala.inline
  def apply(
    VAR_FG_SCALE: String,
    VAR_FG_SIZE: String,
    VAR_FG_TRANSLATE_END: String,
    VAR_FG_TRANSLATE_START: String,
    VAR_LEFT: String,
    VAR_TOP: String
  ): VARFGSCALE = {
    val __obj = js.Dynamic.literal(VAR_FG_SCALE = VAR_FG_SCALE.asInstanceOf[js.Any], VAR_FG_SIZE = VAR_FG_SIZE.asInstanceOf[js.Any], VAR_FG_TRANSLATE_END = VAR_FG_TRANSLATE_END.asInstanceOf[js.Any], VAR_FG_TRANSLATE_START = VAR_FG_TRANSLATE_START.asInstanceOf[js.Any], VAR_LEFT = VAR_LEFT.asInstanceOf[js.Any], VAR_TOP = VAR_TOP.asInstanceOf[js.Any])
    __obj.asInstanceOf[VARFGSCALE]
  }
  
  @scala.inline
  implicit class VARFGSCALEOps[Self <: VARFGSCALE] (val x: Self) extends AnyVal {
    
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
    def setVAR_FG_SCALE(value: String): Self = this.set("VAR_FG_SCALE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVAR_FG_SIZE(value: String): Self = this.set("VAR_FG_SIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVAR_FG_TRANSLATE_END(value: String): Self = this.set("VAR_FG_TRANSLATE_END", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVAR_FG_TRANSLATE_START(value: String): Self = this.set("VAR_FG_TRANSLATE_START", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVAR_LEFT(value: String): Self = this.set("VAR_LEFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVAR_TOP(value: String): Self = this.set("VAR_TOP", value.asInstanceOf[js.Any])
  }
}
