package typings.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseObjectHeaderOptions extends js.Object {
  
  var append: js.UndefOr[Boolean] = js.native
  
  var duplicate: js.UndefOr[Boolean] = js.native
  
  var `override`: js.UndefOr[Boolean] = js.native
  
  var separator: js.UndefOr[String] = js.native
}
object ResponseObjectHeaderOptions {
  
  @scala.inline
  def apply(): ResponseObjectHeaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseObjectHeaderOptions]
  }
  
  @scala.inline
  implicit class ResponseObjectHeaderOptionsOps[Self <: ResponseObjectHeaderOptions] (val x: Self) extends AnyVal {
    
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
    def setAppend(value: Boolean): Self = this.set("append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    
    @scala.inline
    def setDuplicate(value: Boolean): Self = this.set("duplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicate: Self = this.set("duplicate", js.undefined)
    
    @scala.inline
    def setOverride(value: Boolean): Self = this.set("override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
}
