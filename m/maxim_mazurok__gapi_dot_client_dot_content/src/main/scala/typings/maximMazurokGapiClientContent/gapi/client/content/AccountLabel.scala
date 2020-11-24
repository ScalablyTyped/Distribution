package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountLabel extends js.Object {
  
  /** Output only. Immutable. The ID of account this label belongs to. */
  var accountId: js.UndefOr[String] = js.native
  
  /** Description for this label. */
  var description: js.UndefOr[String] = js.native
  
  /** Output only. Immutable. The ID of the label. */
  var labelId: js.UndefOr[String] = js.native
  
  /** The display name of this label. */
  var name: js.UndefOr[String] = js.native
}
object AccountLabel {
  
  @scala.inline
  def apply(): AccountLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLabel]
  }
  
  @scala.inline
  implicit class AccountLabelOps[Self <: AccountLabel] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLabelId(value: String): Self = this.set("labelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelId: Self = this.set("labelId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
