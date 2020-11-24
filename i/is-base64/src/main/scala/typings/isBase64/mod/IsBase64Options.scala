package typings.isBase64.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsBase64Options extends js.Object {
  
  var allowEmpty: js.UndefOr[Boolean] = js.native
  
  var allowMime: js.UndefOr[Boolean] = js.native
  
  var mimeRequired: js.UndefOr[Boolean] = js.native
  
  var paddingRequired: js.UndefOr[Boolean] = js.native
}
object IsBase64Options {
  
  @scala.inline
  def apply(): IsBase64Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsBase64Options]
  }
  
  @scala.inline
  implicit class IsBase64OptionsOps[Self <: IsBase64Options] (val x: Self) extends AnyVal {
    
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
    def setAllowEmpty(value: Boolean): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
    
    @scala.inline
    def setAllowMime(value: Boolean): Self = this.set("allowMime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMime: Self = this.set("allowMime", js.undefined)
    
    @scala.inline
    def setMimeRequired(value: Boolean): Self = this.set("mimeRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeRequired: Self = this.set("mimeRequired", js.undefined)
    
    @scala.inline
    def setPaddingRequired(value: Boolean): Self = this.set("paddingRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingRequired: Self = this.set("paddingRequired", js.undefined)
  }
}
