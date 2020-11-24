package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiasettingsRequestInventoryVerificationResponse extends js.Object {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#liasettingsRequestInventoryVerificationResponse". */
  var kind: js.UndefOr[String] = js.native
}
object LiasettingsRequestInventoryVerificationResponse {
  
  @scala.inline
  def apply(): LiasettingsRequestInventoryVerificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsRequestInventoryVerificationResponse]
  }
  
  @scala.inline
  implicit class LiasettingsRequestInventoryVerificationResponseOps[Self <: LiasettingsRequestInventoryVerificationResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
