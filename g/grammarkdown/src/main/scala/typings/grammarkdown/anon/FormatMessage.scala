package typings.grammarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatMessage extends js.Object {
  
  var detailedMessage: js.UndefOr[Boolean] = js.native
  
  var formatMessage: js.UndefOr[Boolean] = js.native
}
object FormatMessage {
  
  @scala.inline
  def apply(): FormatMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatMessage]
  }
  
  @scala.inline
  implicit class FormatMessageOps[Self <: FormatMessage] (val x: Self) extends AnyVal {
    
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
    def setDetailedMessage(value: Boolean): Self = this.set("detailedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailedMessage: Self = this.set("detailedMessage", js.undefined)
    
    @scala.inline
    def setFormatMessage(value: Boolean): Self = this.set("formatMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatMessage: Self = this.set("formatMessage", js.undefined)
  }
}
