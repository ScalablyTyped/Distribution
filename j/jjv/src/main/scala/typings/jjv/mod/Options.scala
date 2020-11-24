package typings.jjv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var checkRequired: js.UndefOr[Boolean] = js.native
  
  var removeAdditional: js.UndefOr[Boolean] = js.native
  
  var useCoerce: js.UndefOr[Boolean] = js.native
  
  var useDefault: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCheckRequired(value: Boolean): Self = this.set("checkRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckRequired: Self = this.set("checkRequired", js.undefined)
    
    @scala.inline
    def setRemoveAdditional(value: Boolean): Self = this.set("removeAdditional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveAdditional: Self = this.set("removeAdditional", js.undefined)
    
    @scala.inline
    def setUseCoerce(value: Boolean): Self = this.set("useCoerce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCoerce: Self = this.set("useCoerce", js.undefined)
    
    @scala.inline
    def setUseDefault(value: Boolean): Self = this.set("useDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDefault: Self = this.set("useDefault", js.undefined)
  }
}
