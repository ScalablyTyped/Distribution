package typings.ionicCore.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterEventDetail extends js.Object {
  
  var from: String | Null = js.native
  
  var redirectedFrom: String | Null = js.native
  
  var to: String = js.native
}
object RouterEventDetail {
  
  @scala.inline
  def apply(to: String): RouterEventDetail = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterEventDetail]
  }
  
  @scala.inline
  implicit class RouterEventDetailOps[Self <: RouterEventDetail] (val x: Self) extends AnyVal {
    
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
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromNull: Self = this.set("from", null)
    
    @scala.inline
    def setRedirectedFrom(value: String): Self = this.set("redirectedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectedFromNull: Self = this.set("redirectedFrom", null)
  }
}
