package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of how user IDs are encrypted.
  */
@js.native
trait SchemaEncryptionInfo extends js.Object {
  
  /**
    * The encryption entity ID. This should match the encryption configuration
    * for ad serving or Data Transfer.
    */
  var encryptionEntityId: js.UndefOr[String] = js.native
  
  /**
    * The encryption entity type. This should match the encryption
    * configuration for ad serving or Data Transfer.
    */
  var encryptionEntityType: js.UndefOr[String] = js.native
  
  /**
    * Describes whether the encrypted cookie was received from ad serving (the
    * %m macro) or from Data Transfer.
    */
  var encryptionSource: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#encryptionInfo&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaEncryptionInfo {
  
  @scala.inline
  def apply(): SchemaEncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptionInfo]
  }
  
  @scala.inline
  implicit class SchemaEncryptionInfoOps[Self <: SchemaEncryptionInfo] (val x: Self) extends AnyVal {
    
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
    def setEncryptionEntityId(value: String): Self = this.set("encryptionEntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionEntityId: Self = this.set("encryptionEntityId", js.undefined)
    
    @scala.inline
    def setEncryptionEntityType(value: String): Self = this.set("encryptionEntityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionEntityType: Self = this.set("encryptionEntityType", js.undefined)
    
    @scala.inline
    def setEncryptionSource(value: String): Self = this.set("encryptionSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionSource: Self = this.set("encryptionSource", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
