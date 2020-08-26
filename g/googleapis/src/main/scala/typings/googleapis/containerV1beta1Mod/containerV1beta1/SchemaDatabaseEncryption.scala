package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of etcd encryption.
  */
@js.native
trait SchemaDatabaseEncryption extends js.Object {
  /**
    * Name of CloudKMS key to use for the encryption of secrets in etcd. Ex.
    * projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
    */
  var keyName: js.UndefOr[String] = js.native
  /**
    * Denotes the state of etcd encryption.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaDatabaseEncryption {
  @scala.inline
  def apply(): SchemaDatabaseEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabaseEncryption]
  }
  @scala.inline
  implicit class SchemaDatabaseEncryptionOps[Self <: SchemaDatabaseEncryption] (val x: Self) extends AnyVal {
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
    def setKeyName(value: String): Self = this.set("keyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("keyName", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

