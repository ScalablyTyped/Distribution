package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attestor extends js.Object {
  
  /** Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs. */
  var description: js.UndefOr[String] = js.native
  
  /** Required. The resource name, in the format: `projects/∗/attestors/ *`. This field may not be updated. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Time when the attestor was last updated. */
  var updateTime: js.UndefOr[String] = js.native
  
  /** This specifies how an attestation will be read, and how it will be used during policy enforcement. */
  var userOwnedGrafeasNote: js.UndefOr[UserOwnedGrafeasNote] = js.native
}
object Attestor {
  
  @scala.inline
  def apply(): Attestor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attestor]
  }
  
  @scala.inline
  implicit class AttestorOps[Self <: Attestor] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setUserOwnedGrafeasNote(value: UserOwnedGrafeasNote): Self = this.set("userOwnedGrafeasNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserOwnedGrafeasNote: Self = this.set("userOwnedGrafeasNote", js.undefined)
  }
}
