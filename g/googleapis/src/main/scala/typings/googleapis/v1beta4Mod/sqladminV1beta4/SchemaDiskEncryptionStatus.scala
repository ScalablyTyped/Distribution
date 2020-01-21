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
  def apply(kind: String = null, kmsKeyVersionName: String = null): SchemaDiskEncryptionStatus = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (kmsKeyVersionName != null) __obj.updateDynamic("kmsKeyVersionName")(kmsKeyVersionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDiskEncryptionStatus]
  }
}

