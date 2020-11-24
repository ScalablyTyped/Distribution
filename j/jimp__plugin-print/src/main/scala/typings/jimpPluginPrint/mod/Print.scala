package typings.jimpPluginPrint.mod

import typings.jimpPluginPrint.anon.FONTSANS10BLACK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Print extends js.Object {
  
  var `class`: PrintClass = js.native
  
  var constants: FONTSANS10BLACK = js.native
}
object Print {
  
  @scala.inline
  def apply(`class`: PrintClass, constants: FONTSANS10BLACK): Print = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print]
  }
  
  @scala.inline
  implicit class PrintOps[Self <: Print] (val x: Self) extends AnyVal {
    
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
    def setClass(value: PrintClass): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstants(value: FONTSANS10BLACK): Self = this.set("constants", value.asInstanceOf[js.Any])
  }
}
