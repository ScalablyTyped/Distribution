package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Computer extends js.Object {
  
  var computer: js.UndefOr[String] = js.native
  
  var phone: js.UndefOr[String] = js.native
  
  var tablet: js.UndefOr[String] = js.native
}
object Computer {
  
  @scala.inline
  def apply(): Computer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Computer]
  }
  
  @scala.inline
  implicit class ComputerOps[Self <: Computer] (val x: Self) extends AnyVal {
    
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
    def setComputer(value: String): Self = this.set("computer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputer: Self = this.set("computer", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setTablet(value: String): Self = this.set("tablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTablet: Self = this.set("tablet", js.undefined)
  }
}
