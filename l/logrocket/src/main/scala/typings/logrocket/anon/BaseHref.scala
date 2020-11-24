package typings.logrocket.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseHref extends js.Object {
  
  var baseHref: js.UndefOr[String] = js.native
  
  var inputSanitizer: js.UndefOr[Boolean | String] = js.native
  
  var isEnabled: js.UndefOr[Boolean] = js.native
  
  var textSanitizer: js.UndefOr[Boolean | String] = js.native
}
object BaseHref {
  
  @scala.inline
  def apply(): BaseHref = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseHref]
  }
  
  @scala.inline
  implicit class BaseHrefOps[Self <: BaseHref] (val x: Self) extends AnyVal {
    
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
    def setBaseHref(value: String): Self = this.set("baseHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseHref: Self = this.set("baseHref", js.undefined)
    
    @scala.inline
    def setInputSanitizer(value: Boolean | String): Self = this.set("inputSanitizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSanitizer: Self = this.set("inputSanitizer", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    
    @scala.inline
    def setTextSanitizer(value: Boolean | String): Self = this.set("textSanitizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSanitizer: Self = this.set("textSanitizer", js.undefined)
  }
}
