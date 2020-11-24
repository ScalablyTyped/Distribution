package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncResponses extends js.Object {
  
  var asyncResponses: js.UndefOr[Boolean] = js.native
  
  var asyncTimeout: js.UndefOr[Double] = js.native
}
object AsyncResponses {
  
  @scala.inline
  def apply(): AsyncResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncResponses]
  }
  
  @scala.inline
  implicit class AsyncResponsesOps[Self <: AsyncResponses] (val x: Self) extends AnyVal {
    
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
    def setAsyncResponses(value: Boolean): Self = this.set("asyncResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncResponses: Self = this.set("asyncResponses", js.undefined)
    
    @scala.inline
    def setAsyncTimeout(value: Double): Self = this.set("asyncTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncTimeout: Self = this.set("asyncTimeout", js.undefined)
  }
}
