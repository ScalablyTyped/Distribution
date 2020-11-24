package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayidString extends js.Object {
  
  var display_id: String = js.native
}
object DisplayidString {
  
  @scala.inline
  def apply(display_id: String): DisplayidString = {
    val __obj = js.Dynamic.literal(display_id = display_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayidString]
  }
  
  @scala.inline
  implicit class DisplayidStringOps[Self <: DisplayidString] (val x: Self) extends AnyVal {
    
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
    def setDisplay_id(value: String): Self = this.set("display_id", value.asInstanceOf[js.Any])
  }
}
