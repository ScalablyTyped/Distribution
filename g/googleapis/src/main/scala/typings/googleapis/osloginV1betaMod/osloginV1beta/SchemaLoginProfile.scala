package typings.googleapis.osloginV1betaMod.osloginV1beta

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The user profile information used for logging in to a virtual machine on
  * Google Compute Engine.
  */
@js.native
trait SchemaLoginProfile extends js.Object {
  
  /**
    * A unique user ID.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The list of POSIX accounts associated with the user.
    */
  var posixAccounts: js.UndefOr[js.Array[SchemaPosixAccount]] = js.native
  
  /**
    * A map from SSH public key fingerprint to the associated key object.
    */
  var sshPublicKeys: js.UndefOr[StringDictionary[SchemaSshPublicKey]] = js.native
}
object SchemaLoginProfile {
  
  @scala.inline
  def apply(): SchemaLoginProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoginProfile]
  }
  
  @scala.inline
  implicit class SchemaLoginProfileOps[Self <: SchemaLoginProfile] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPosixAccountsVarargs(value: SchemaPosixAccount*): Self = this.set("posixAccounts", js.Array(value :_*))
    
    @scala.inline
    def setPosixAccounts(value: js.Array[SchemaPosixAccount]): Self = this.set("posixAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosixAccounts: Self = this.set("posixAccounts", js.undefined)
    
    @scala.inline
    def setSshPublicKeys(value: StringDictionary[SchemaSshPublicKey]): Self = this.set("sshPublicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshPublicKeys: Self = this.set("sshPublicKeys", js.undefined)
  }
}
