package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoCompleteOptions extends js.Object {
  
  var blurTimeout: js.UndefOr[Double] = js.native
  
  var noResultsMessage: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object AutoCompleteOptions {
  
  @scala.inline
  def apply(): AutoCompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompleteOptions]
  }
  
  @scala.inline
  implicit class AutoCompleteOptionsOps[Self <: AutoCompleteOptions] (val x: Self) extends AnyVal {
    
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
    def setBlurTimeout(value: Double): Self = this.set("blurTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurTimeout: Self = this.set("blurTimeout", js.undefined)
    
    @scala.inline
    def setNoResultsMessage(value: String): Self = this.set("noResultsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoResultsMessage: Self = this.set("noResultsMessage", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
