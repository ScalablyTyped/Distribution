package typings.googleapis.osloginV1betaMod.osloginV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response message for importing an SSH public key.
  */
@js.native
trait SchemaImportSshPublicKeyResponse extends js.Object {
  
  /**
    * The login profile information for the user.
    */
  var loginProfile: js.UndefOr[SchemaLoginProfile] = js.native
}
object SchemaImportSshPublicKeyResponse {
  
  @scala.inline
  def apply(): SchemaImportSshPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportSshPublicKeyResponse]
  }
  
  @scala.inline
  implicit class SchemaImportSshPublicKeyResponseOps[Self <: SchemaImportSshPublicKeyResponse] (val x: Self) extends AnyVal {
    
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
    def setLoginProfile(value: SchemaLoginProfile): Self = this.set("loginProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginProfile: Self = this.set("loginProfile", js.undefined)
  }
}
