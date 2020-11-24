package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavbarOptions extends js.Object {
  
  var iconpos: String = js.native
}
object NavbarOptions {
  
  @scala.inline
  def apply(iconpos: String): NavbarOptions = {
    val __obj = js.Dynamic.literal(iconpos = iconpos.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarOptions]
  }
  
  @scala.inline
  implicit class NavbarOptionsOps[Self <: NavbarOptions] (val x: Self) extends AnyVal {
    
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
    def setIconpos(value: String): Self = this.set("iconpos", value.asInstanceOf[js.Any])
  }
}
