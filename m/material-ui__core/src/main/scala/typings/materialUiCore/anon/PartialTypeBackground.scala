package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeBackground> */
@js.native
trait PartialTypeBackground extends js.Object {
  
  var default: js.UndefOr[String] = js.native
  
  var paper: js.UndefOr[String] = js.native
}
object PartialTypeBackground {
  
  @scala.inline
  def apply(): PartialTypeBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypeBackground]
  }
  
  @scala.inline
  implicit class PartialTypeBackgroundOps[Self <: PartialTypeBackground] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setPaper(value: String): Self = this.set("paper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaper: Self = this.set("paper", js.undefined)
  }
}
