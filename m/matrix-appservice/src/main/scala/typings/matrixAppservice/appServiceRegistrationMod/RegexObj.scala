package typings.matrixAppservice.appServiceRegistrationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexObj extends js.Object {
  
  var exclusive: Boolean = js.native
  
  var regex: String = js.native
}
object RegexObj {
  
  @scala.inline
  def apply(exclusive: Boolean, regex: String): RegexObj = {
    val __obj = js.Dynamic.literal(exclusive = exclusive.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexObj]
  }
  
  @scala.inline
  implicit class RegexObjOps[Self <: RegexObj] (val x: Self) extends AnyVal {
    
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
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegex(value: String): Self = this.set("regex", value.asInstanceOf[js.Any])
  }
}
