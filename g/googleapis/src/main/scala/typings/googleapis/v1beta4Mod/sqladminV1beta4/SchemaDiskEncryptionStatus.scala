package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Disk encryption status.
  */
@js.native
trait SchemaDiskEncryptionStatus extends js.Object {
  /**
    * This is always sql#diskEncryptionStatus.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * KMS key version used to encrypt the Cloud SQL instance disk
    */
  var kmsKeyVersionName: js.UndefOr[String] = js.native
}

object SchemaDiskEncryptionStatus {
  @scala.inline
  def apply(): SchemaDiskEncryptionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskEncryptionStatus]
  }
  @scala.inline
  implicit class SchemaDiskEncryptionStatusOps[Self <: SchemaDiskEncryptionStatus] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setKmsKeyVersionName(value: String): Self = this.set("kmsKeyVersionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyVersionName: Self = this.set("kmsKeyVersionName", js.undefined)
  }
  
}

