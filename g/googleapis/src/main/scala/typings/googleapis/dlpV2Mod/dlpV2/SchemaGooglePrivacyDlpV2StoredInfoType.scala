package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StoredInfoType resource message that contains information about the current
  * version and any pending updates.
  */
@js.native
trait SchemaGooglePrivacyDlpV2StoredInfoType extends js.Object {
  /**
    * Current version of the stored info type.
    */
  var currentVersion: js.UndefOr[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion] = js.native
  /**
    * Resource name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Pending versions of the stored info type. Empty if no versions are
    * pending.
    */
  var pendingVersions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion]] = js.native
}

object SchemaGooglePrivacyDlpV2StoredInfoType {
  @scala.inline
  def apply(
    currentVersion: SchemaGooglePrivacyDlpV2StoredInfoTypeVersion = null,
    name: String = null,
    pendingVersions: js.Array[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion] = null
  ): SchemaGooglePrivacyDlpV2StoredInfoType = {
    val __obj = js.Dynamic.literal()
    if (currentVersion != null) __obj.updateDynamic("currentVersion")(currentVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pendingVersions != null) __obj.updateDynamic("pendingVersions")(pendingVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StoredInfoType]
  }
}

