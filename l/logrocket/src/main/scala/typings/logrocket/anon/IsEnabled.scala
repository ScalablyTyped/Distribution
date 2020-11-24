package typings.logrocket.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsEnabled extends js.Object {
  
  var isEnabled: js.UndefOr[Boolean | Debug] = js.native
  
  var shouldAggregateConsoleErrors: js.UndefOr[Boolean] = js.native
}
object IsEnabled {
  
  @scala.inline
  def apply(): IsEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsEnabled]
  }
  
  @scala.inline
  implicit class IsEnabledOps[Self <: IsEnabled] (val x: Self) extends AnyVal {
    
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
    def setIsEnabled(value: Boolean | Debug): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    
    @scala.inline
    def setShouldAggregateConsoleErrors(value: Boolean): Self = this.set("shouldAggregateConsoleErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldAggregateConsoleErrors: Self = this.set("shouldAggregateConsoleErrors", js.undefined)
  }
}
