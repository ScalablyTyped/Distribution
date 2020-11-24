package typings.materialRipple.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCRippleAttachOpts extends js.Object {
  
  var isUnbounded: js.UndefOr[Boolean] = js.native
}
object MDCRippleAttachOpts {
  
  @scala.inline
  def apply(): MDCRippleAttachOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MDCRippleAttachOpts]
  }
  
  @scala.inline
  implicit class MDCRippleAttachOptsOps[Self <: MDCRippleAttachOpts] (val x: Self) extends AnyVal {
    
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
    def setIsUnbounded(value: Boolean): Self = this.set("isUnbounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUnbounded: Self = this.set("isUnbounded", js.undefined)
  }
}
