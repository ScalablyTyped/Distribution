package typings.ibmMobilefirst.WLAuthorizationManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestObject extends js.Object {
  
  def setRequestHeader(header: String, value: String): Unit = js.native
}
object RequestObject {
  
  @scala.inline
  def apply(setRequestHeader: (String, String) => Unit): RequestObject = {
    val __obj = js.Dynamic.literal(setRequestHeader = js.Any.fromFunction2(setRequestHeader))
    __obj.asInstanceOf[RequestObject]
  }
  
  @scala.inline
  implicit class RequestObjectOps[Self <: RequestObject] (val x: Self) extends AnyVal {
    
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
    def setSetRequestHeader(value: (String, String) => Unit): Self = this.set("setRequestHeader", js.Any.fromFunction2(value))
  }
}
