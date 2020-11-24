package typings.highland.Highland

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CleanupObject extends js.Object {
  
  var continueOnError: js.UndefOr[Boolean] = js.native
  
  var onDestroy: js.UndefOr[js.Function] = js.native
}
object CleanupObject {
  
  @scala.inline
  def apply(): CleanupObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CleanupObject]
  }
  
  @scala.inline
  implicit class CleanupObjectOps[Self <: CleanupObject] (val x: Self) extends AnyVal {
    
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
    def setContinueOnError(value: Boolean): Self = this.set("continueOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinueOnError: Self = this.set("continueOnError", js.undefined)
    
    @scala.inline
    def setOnDestroy(value: js.Function): Self = this.set("onDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDestroy: Self = this.set("onDestroy", js.undefined)
  }
}
