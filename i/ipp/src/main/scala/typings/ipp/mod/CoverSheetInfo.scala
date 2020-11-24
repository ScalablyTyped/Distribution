package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverSheetInfo extends js.Object {
  
  var `from-name`: js.UndefOr[String] = js.native
  
  var logo: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var `organization-name`: js.UndefOr[String] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var `to-name`: js.UndefOr[String] = js.native
}
object CoverSheetInfo {
  
  @scala.inline
  def apply(): CoverSheetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverSheetInfo]
  }
  
  @scala.inline
  implicit class CoverSheetInfoOps[Self <: CoverSheetInfo] (val x: Self) extends AnyVal {
    
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
    def `setFrom-name`(value: String): Self = this.set("from-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFrom-name`: Self = this.set("from-name", js.undefined)
    
    @scala.inline
    def setLogo(value: String): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def `setOrganization-name`(value: String): Self = this.set("organization-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOrganization-name`: Self = this.set("organization-name", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def `setTo-name`(value: String): Self = this.set("to-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTo-name`: Self = this.set("to-name", js.undefined)
  }
}
